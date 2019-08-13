package funcoes;

import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.draw.SolidLine;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.UnitValue;
import controller.cadastros.entidades.EntidadeController;
import controller.cadastros.placa.PlacaController;
import controller.cadastrosUnicos.EmpresaController;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import model.cadastros.entidades.EntidadeModel;
import model.cadastros.placa.PlacaModel;
import model.cadastrosUnicos.EmpresaModel;
import model.servicos.OSItensModel;
import model.servicos.OSModel;
import model.vendas.VendasItensModel;

public class GerarOSPDF {

    static EmpresaController ec = new EmpresaController();
    static EntidadeController enc = new EntidadeController();
    static PlacaController pl = new PlacaController();

    private static String caminho = "C:/AHRI/ordemservico/";

    public static String getCaminho() {
        return caminho;
    }

    public static void setCaminho(String caminho) {
        GerarOSPDF.caminho = caminho;
    }

    //Dados da empresa
    public static EmpresaModel getDadosEmpresa() {
        EmpresaModel em = new EmpresaModel();
        ec.puxarDados(em);
        return em;
    }

    //Dados do cliente
    public static EntidadeModel getDadosCliente(int cod) {
        EntidadeModel em = new EntidadeModel();
        enc.puxarDados(em, cod);
        return em;
    }

    //Dados da placa
    public static PlacaModel getDadosPlaca(String cod) {
        PlacaModel em = new PlacaModel();
        pl.puxarDados(em, cod);
        return em;
    }

    public static void OS(OSModel om, List<OSItensModel> itens, boolean emBranco) {
        PdfWriter writer;
        try {
            writer = new PdfWriter(new FileOutputStream(getCaminho()+"os"+om.getCod()+".pdf"));
            PdfFont font = PdfFontFactory.createFont(StandardFonts.COURIER);
            PdfFont headerFont = PdfFontFactory.createFont(StandardFonts.COURIER_BOLD);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);
            //Adicionar linha separadora

            // Adicionando cabeçalho
            Table cabeçalho = new Table(new float[]{10, 2});
            cabeçalho.setWidth(UnitValue.createPercentValue(100));
            cabeçalho.addHeaderCell(new Cell().add(new Paragraph("ORDEM DE SERVIÇO").setFont(headerFont)));
            cabeçalho.addHeaderCell(new Cell().add(new Paragraph("Nº " + om.getCod()).setFont(font)));
            
            //Sobre a empresa
            Table cabeçalhoEmpresa = new Table(new float[]{4,4});
            cabeçalhoEmpresa.setWidth(UnitValue.createPercentValue(100));
            cabeçalhoEmpresa.addHeaderCell(new Cell().add(new Paragraph(
                    getDadosEmpresa().getxFant() +" - "+getDadosEmpresa().getCNPJ()+ "\n")));
            cabeçalhoEmpresa.addHeaderCell(new Cell().add(new Paragraph(
                    getDadosEmpresa().getxLgr() + " - "
                    + getDadosEmpresa().getNro() + " - " + getDadosEmpresa().getxBairro())
                    .setFont(font)));

            //Sobre o cliente
            Table cabeçalhoCliente = new Table(new float[]{1});
            cabeçalhoCliente.setWidth(UnitValue.createPercentValue(100));
            if (emBranco) {
                cabeçalhoCliente.addHeaderCell(new Cell().add(new Paragraph("\n\n").setFont(font)));
            } else {
                cabeçalhoCliente.addHeaderCell(new Cell().add(new Paragraph(
                    "Cliente: " + getDadosCliente(om.getCliente()).getNome() + "\n"
                    + getDadosCliente(om.getCliente()).getCNPJ() + " - " + getDadosCliente(om.getCliente()).getFone1()+"\n")
                    .setFont(font)));
            }

            //Sobre a placa
            Table cabeçalhoPlaca = new Table(new float[]{1});
            cabeçalhoPlaca.setWidth(UnitValue.createPercentValue(100));
            
            if (emBranco) {
                cabeçalhoPlaca.addHeaderCell(new Cell().add(new Paragraph(
                    "Placa: ")).setFont(font));
            } else {
                cabeçalhoPlaca.addHeaderCell(new Cell().add(new Paragraph(
                    "Placa: " + om.getPlaca() + " - " + getDadosPlaca(om.getPlaca()).getNome()).setFont(font)));
            }
            //Tabela de serviços
            Table tabelaServicos = new Table(new float[]{1, 4, 4, 4,});
            tabelaServicos.setWidth(UnitValue.createPercentValue(100));
            
            // Adicionando cabeçalho servicos
            tabelaServicos.addHeaderCell(new Cell().add(new Paragraph("Servico").setFont(headerFont)));
            tabelaServicos.addHeaderCell(new Cell().add(new Paragraph("Valor").setFont(headerFont)));
            tabelaServicos.addHeaderCell(new Cell().add(new Paragraph("HRS").setFont(headerFont)));
            tabelaServicos.addHeaderCell(new Cell().add(new Paragraph("Total").setFont(headerFont)));
            
            //tabela de serviços
            if (emBranco) {
                for (int i = 0; i < 10; i++) {
                    tabelaServicos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                    tabelaServicos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                    tabelaServicos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                    tabelaServicos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                }
            } else {
                int contador = 0;
                for (OSItensModel produto : itens) {
                    tabelaServicos.addCell(new Cell().add(new Paragraph(produto.getNome()).setFont(font)));
                    tabelaServicos.addCell(new Cell().add(new Paragraph(Double.toString(produto.getValorunitario())).setFont(font)));
                    tabelaServicos.addCell(new Cell().add(new Paragraph(Double.toString(produto.getQuantidade())).setFont(font)));
                    tabelaServicos.addCell(new Cell().add(new Paragraph(Double.toString(produto.getValortotal())).setFont(font)));
                }
                //Linhas restantes de produtos
                int i;
                for (i = contador; i < 10; i++) {
                    tabelaServicos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                    tabelaServicos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                    tabelaServicos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                    tabelaServicos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                }
            }
            
            if (emBranco) {
            } else {
                tabelaServicos.addFooterCell(new Cell().add(new Paragraph("").setFont(headerFont)));
                tabelaServicos.addFooterCell(new Cell().setFont(headerFont));
                tabelaServicos.addFooterCell(new Cell().setFont(headerFont));
                tabelaServicos.addFooterCell(new Cell().add(new Paragraph("R$ " + om.getValorTotal()).setFont(headerFont)));
            }
            
            //Observações
            Table obs = new Table(new float[]{1});
            obs.setWidth(UnitValue.createPercentValue(100));
            obs.setHeight(200);
            if (om.getObs().isEmpty()) {
                obs.addHeaderCell(new Cell().add(new Paragraph("Observações:\n\n\n\n\n\n\n").setFont(font)));
            } else {
                obs.addHeaderCell(new Cell().add(new Paragraph("Observações:\n"+om.getObs()).setFont(font)));
            }
            
            //Adicionar componentes
            document.add(cabeçalho);
            document.add(cabeçalhoEmpresa);
            document.add(cabeçalhoCliente);
            document.add(cabeçalhoPlaca);
            document.add(tabelaServicos);
            document.add(obs);
            document.close();
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();  
            desktop.open(new File(getCaminho()+"os"+om.getCod()+".pdf"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        OSModel om = new OSModel();
        om.setCod(13);
        om.setCliente(4);
        om.setObs("observações\n\n");
        om.setPlaca("DFK-4002");
        om.setValorTotal(100.0);
        OSItensModel p = new OSItensModel();
        List<OSItensModel> produtos = new ArrayList<>();
        p.setCod(1);
        p.setNome("Produto teste");
        p.setValorunitario(10.0);
        p.setQuantidade(10.0);
        p.setValortotal(50.0);
        produtos.add(p);
        produtos.add(p);
        OS(om, produtos, false);
    }
}
