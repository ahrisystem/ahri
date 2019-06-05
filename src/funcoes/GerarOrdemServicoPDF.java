package funcoes;

import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.UnitValue;
import controller.cadastros.entidades.EntidadeController;
import controller.cadastros.placa.PlacaController;
import controller.cadastrosUnicos.EmpresaController;
import java.io.File;
import model.cadastros.entidades.EntidadeModel;
import model.cadastros.placa.PlacaModel;
import model.cadastrosUnicos.EmpresaModel;
import model.servicos.OrdemdeServicoModel;

public class GerarOrdemServicoPDF {

    static EmpresaController ec = new EmpresaController();
    static EntidadeController enc = new EntidadeController();
    static PlacaController pl = new PlacaController();

    private static String caminho = "C:/AHRI/ordemservico/";

    public static String getCaminho() {
        return caminho;
    }

    public static void setCaminho(String caminho) {
        GerarOrdemServicoPDF.caminho = caminho;
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

    public static void OS(OrdemdeServicoModel om) {
        PdfWriter writer;
        try {
            writer = new PdfWriter(new FileOutputStream(getCaminho() + "os" + om.getCod() + ".pdf"));
            PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
            PdfFont headerFont = PdfFontFactory.createFont(StandardFonts.HELVETICA_BOLD);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            
            // Adicionando título
            Paragraph p1 = new Paragraph("ORDEM SERVIÇO");
            p1.setHorizontalAlignment(HorizontalAlignment.RIGHT);

            //Sobre a empresa
            Table cabeçalhoEmpresa = new Table(new float[]{4, 4});
            cabeçalhoEmpresa.setWidth(UnitValue.createPercentValue(100));
            cabeçalhoEmpresa.addHeaderCell(new Cell().add(new Paragraph(
                    getDadosEmpresa().getxFant() + " - " + getDadosEmpresa().getCNPJ() + "\n")));
            cabeçalhoEmpresa.addHeaderCell(new Cell().add(new Paragraph(
                    getDadosEmpresa().getxLgr() + " - "
                    + getDadosEmpresa().getNro() + " - " + getDadosEmpresa().getxBairro())
                    .setFont(font)));

            //Sobre o cliente
            Table cabeçalhoCliente = new Table(new float[]{1});
            cabeçalhoCliente.setWidth(UnitValue.createPercentValue(100));
            cabeçalhoCliente.addHeaderCell(new Cell().add(new Paragraph("Cliente: \n").setFont(font)));

            //Sobre a placa
            Table cabeçalhoPlaca = new Table(new float[]{1});
            cabeçalhoPlaca.setWidth(UnitValue.createPercentValue(100));
            cabeçalhoPlaca.addHeaderCell(new Cell().add(new Paragraph("Placa: \n").setFont(font)));

            //Tabela de serviços
            Table tabelaProdutos = new Table(new float[] { 0.8f, 0.1f, 0.1f });
            tabelaProdutos.setWidth(UnitValue.createPercentValue(100));

            // Adicionando cabeçalho serviços
            tabelaProdutos.addHeaderCell(new Cell().add(new Paragraph("Serviço").setFont(headerFont)));
            tabelaProdutos.addHeaderCell(new Cell().add(new Paragraph("Valor").setFont(headerFont)));
            tabelaProdutos.addHeaderCell(new Cell().add(new Paragraph("Tempo(HRS)").setFont(headerFont)));

            //Linhas restantes de serviços
            int i;
            for (i = 0; i < 15; i++) {
                tabelaProdutos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                tabelaProdutos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                tabelaProdutos.addCell(new Cell().add(new Paragraph().setHeight(18)));
            }
            //Observações
            Table obs = new Table(new float[]{1});
            obs.setWidth(UnitValue.createPercentValue(100));
            obs.setHeight(200);
            if (om.getObs().isEmpty()) {
                obs.addHeaderCell(new Cell().add(new Paragraph("Observações:\n\n\n\n\n\n\n").setFont(font)));
            } else {
                obs.addHeaderCell(new Cell().add(new Paragraph("Observações:\n" + om.getObs()).setFont(font)));
            }

            //Adicionar componentes
            document.add(p1);
            document.add(cabeçalhoEmpresa);
            document.add(cabeçalhoCliente);
            document.add(cabeçalhoPlaca);
            document.add(tabelaProdutos);
            document.add(obs);
            document.close();
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            desktop.open(new File(getCaminho() + "os" + om.getCod() + ".pdf"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        OrdemdeServicoModel om = new OrdemdeServicoModel();
        om.setCod(1);
        OS(om);
    }
}
