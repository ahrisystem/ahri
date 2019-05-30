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
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import model.cadastros.entidades.EntidadeModel;
import model.cadastros.placa.PlacaModel;
import model.cadastrosUnicos.EmpresaModel;
import model.vendas.VendasItensModel;
import model.vendas.VendasModel;

public class GerarOrçamentoPDF {

    static EmpresaController ec = new EmpresaController();
    static EntidadeController enc = new EntidadeController();
    static PlacaController pl = new PlacaController();

    private static String caminho = "C:/AHRI/orcamentos/";

    public static String getCaminho() {
        return caminho;
    }

    public static void setCaminho(String caminho) {
        GerarOrçamentoPDF.caminho = caminho;
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

    /**
     *
     * @param vm 
     * @param exibirProdutos Indica se irá imprimir a lista de produtos no PDF.
     * @param p Lista de produtos tipo VendasItensModel.
     */
    public static void Orcamento(VendasModel vm, boolean exibirProdutos, boolean exibirPlaca, List<VendasItensModel> p) {
        PdfWriter writer;
        try {
            writer = new PdfWriter(new FileOutputStream(getCaminho()+"orcamento"+vm.getCod()+".pdf"));
            PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
            PdfFont headerFont = PdfFontFactory.createFont(StandardFonts.HELVETICA_BOLD);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);
            //Adicionar linha separadora
            final SolidLine lineDrawer = new SolidLine(1f);

            // Adicionando cabeçalho
            Table cabeçalho = new Table(new float[]{10, 2});
            cabeçalho.setWidth(UnitValue.createPercentValue(100));
            cabeçalho.addHeaderCell(new Cell().add(new Paragraph("ORÇAMENTO").setFont(headerFont)));
            cabeçalho.addHeaderCell(new Cell().add(new Paragraph("Nº " + vm.getCod()).setFont(font)));
            
            // Adicionando cabeçalho 2
            Table cabeçalho2 = new Table(new float[]{1});
            cabeçalho2.setWidth(UnitValue.createPercentValue(100));
            cabeçalho2.addHeaderCell(new Cell().add(new Paragraph("DAV - DOCUMENTO AUXILIAR DE VENDA - "
                    + "NÃO É DOCUMENTO FISCAL").setFont(headerFont)));

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
            cabeçalhoCliente.addHeaderCell(new Cell().add(new Paragraph(
                    "Cliente: " + getDadosCliente(vm.getCliente()).getNome() + "\n"
                    + getDadosCliente(vm.getCliente()).getCNPJ() + " - " + getDadosCliente(vm.getCliente()).getFone1()+"\n")
                    .setFont(font)));

            //Sobre a placa
            Table cabeçalhoPlaca = new Table(new float[]{1});
            cabeçalhoPlaca.setWidth(UnitValue.createPercentValue(100));
            
            if (exibirPlaca) {
                cabeçalhoPlaca.addHeaderCell(new Cell().add(new Paragraph(
                    "Placa: " + vm.getPlaca() + " - " + getDadosPlaca(vm.getPlaca()).getNome()).setFont(font)));
            } else {
                cabeçalhoPlaca.addHeaderCell(new Cell().add(new Paragraph(
                    "Placa: ")).setFont(font));
            }

            //Tabela de produtos
            Table tabelaProdutos = new Table(new float[]{1, 4, 4, 4, 4, 4});
            tabelaProdutos.setWidth(UnitValue.createPercentValue(100));

            // Adicionando cabeçalho produtos
            tabelaProdutos.addHeaderCell(new Cell().add(new Paragraph("EAN").setFont(headerFont)));
            tabelaProdutos.addHeaderCell(new Cell().add(new Paragraph("Produto").setFont(headerFont)));
            tabelaProdutos.addHeaderCell(new Cell().add(new Paragraph("Valor").setFont(headerFont)));
            tabelaProdutos.addHeaderCell(new Cell().add(new Paragraph("Desconto").setFont(headerFont)));
            tabelaProdutos.addHeaderCell(new Cell().add(new Paragraph("Qtd").setFont(headerFont)));
            tabelaProdutos.addHeaderCell(new Cell().add(new Paragraph("Total").setFont(headerFont)));
            
            if (exibirProdutos) {
                int contador = 0;
                for (VendasItensModel produto : p) {
                    contador++;
                    tabelaProdutos.addCell(new Cell().add(new Paragraph(Integer.toString(produto.getCod())).setFont(font)));
                    tabelaProdutos.addCell(new Cell().add(new Paragraph(produto.getNome()).setFont(font)));
                    tabelaProdutos.addCell(new Cell().add(new Paragraph(Double.toString(produto.getValorunitario())).setFont(font)));
                    tabelaProdutos.addCell(new Cell().add(new Paragraph(Double.toString(produto.getValordesconto())).setFont(font)));
                    tabelaProdutos.addCell(new Cell().add(new Paragraph(Double.toString(produto.getQuantidade())).setFont(font)));
                    tabelaProdutos.addCell(new Cell().add(new Paragraph(Double.toString(produto.getValortotal())).setFont(font)));
                }
                //Linhas restantes de produtos
                int i;
                for (i = contador; i < 15; i++) {
                    tabelaProdutos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                    tabelaProdutos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                    tabelaProdutos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                    tabelaProdutos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                    tabelaProdutos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                    tabelaProdutos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                }
                tabelaProdutos.addFooterCell(new Cell().add(new Paragraph(contador + " itens.").setFont(headerFont)));
                tabelaProdutos.addFooterCell(new Cell().setFont(headerFont));
                tabelaProdutos.addFooterCell(new Cell().add(new Paragraph("R$ " + vm.getValorTotalBruto()).setFont(headerFont)));
                tabelaProdutos.addFooterCell(new Cell().add(new Paragraph("R$ " + vm.getValorTotalDesconto()).setFont(headerFont)));
                tabelaProdutos.addFooterCell(new Cell().setFont(headerFont));
                tabelaProdutos.addFooterCell(new Cell().add(new Paragraph("R$ " + vm.getValorTotal()).setFont(headerFont)));
            } else {
                for (int i = 0; i < 15; i++) {
                    tabelaProdutos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                    tabelaProdutos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                    tabelaProdutos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                    tabelaProdutos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                    tabelaProdutos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                    tabelaProdutos.addCell(new Cell().add(new Paragraph().setHeight(18)));
                }
                tabelaProdutos.addFooterCell(new Cell().setHeight(18));
                tabelaProdutos.addFooterCell(new Cell().setHeight(18));
                tabelaProdutos.addFooterCell(new Cell().setHeight(18));
                tabelaProdutos.addFooterCell(new Cell().setHeight(18));
                tabelaProdutos.addFooterCell(new Cell().setHeight(18));
                tabelaProdutos.addFooterCell(new Cell().setHeight(18));
            }
            //Observações
            Table obs = new Table(new float[]{1});
            obs.setWidth(UnitValue.createPercentValue(100));
            obs.setHeight(200);
            if (vm.getObs().isEmpty()) {
                obs.addHeaderCell(new Cell().add(new Paragraph("Observações:\n\n\n\n\n\n\n").setFont(font)));
            } else {
                obs.addHeaderCell(new Cell().add(new Paragraph("Observações:\n"+vm.getObs()).setFont(font)));
            }
            
            //Adicionar componentes
            document.add(cabeçalho);
            document.add(cabeçalho2);
            document.add(cabeçalhoEmpresa);
            document.add(cabeçalhoCliente);
            document.add(cabeçalhoPlaca);
            document.add(tabelaProdutos);
            document.add(obs);
            document.close();
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();  
            desktop.open(new File(getCaminho()+"orcamento"+vm.getCod()+".pdf"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        VendasModel vm = new VendasModel();
        vm.setCod(13);
        vm.setCliente(4);
        vm.setObs("observações\n\n");
        vm.setPlaca("DFK-4002");
        vm.setValorTotal(100.0);
        vm.setValorTotalBruto(250.0);
        vm.setValorTotalDesconto(100.0);
        VendasItensModel p = new VendasItensModel();
        List<VendasItensModel> produtos = new ArrayList<>();
        p.setCod(1);
        p.setNome("Produto teste");
        p.setValorunitario(10.0);
        p.setValordesconto(5.0);
        p.setQuantidade(10.0);
        p.setValortotal(50.0);
        produtos.add(p);
        produtos.add(p);
        Orcamento(vm, true, true, produtos);
    }
}
