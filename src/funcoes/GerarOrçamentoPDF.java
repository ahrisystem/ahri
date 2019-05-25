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
import com.itextpdf.layout.element.LineSeparator;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.UnitValue;
import controller.cadastros.entidades.EntidadeController;
import controller.cadastrosUnicos.EmpresaController;
import java.util.ArrayList;
import java.util.List;
import model.cadastros.entidades.EntidadeModel;
import model.cadastros.produtos.ProdutoModel;
import model.cadastrosUnicos.EmpresaModel;
import model.vendas.VendasItensModel;

public class GerarOrçamentoPDF {
    static EmpresaController ec = new EmpresaController();
    static EntidadeController enc = new EntidadeController();
    
    private static String caminho = "C:/AHRI/teste.pdf";

    public static String getCaminho() {
        return caminho;
    }

    public static void setCaminho(String caminho) {
        GerarOrçamentoPDF.caminho = caminho;
    }
    
    //Dados da empresa
    public static EmpresaModel getDadosEmpresa(){
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
    
    /**
     *
     * @param codCliente
     * @param exibirProdutos Indica se irá imprimir a lista de produtos no PDF.
     * @param p Lista de produtos tipo VendasItensModel.
     */
    public static void Orcamento(int codCliente, boolean exibirProdutos, List<VendasItensModel> p) {
        PdfWriter writer;
        try {
            writer = new PdfWriter(new FileOutputStream(getCaminho()));
            PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            //Adicionar Titulo
            Text title = new Text("Orçamento").setFont(font).setBold();
            title.setHorizontalAlignment(HorizontalAlignment.CENTER);
            //Adicionar linha separadora
            final SolidLine lineDrawer = new SolidLine(1f);
            //Sobre a empresa
            Text dadosEmpresa = new Text(
                    " "+getDadosEmpresa().getxFant()+"\n"+getDadosEmpresa().getxLgr()
            ).setFont(font);
            //Sobre o cliente
            Text dadosCliente = new Text(
                    " "+getDadosCliente(codCliente).getNome()
            ).setFont(font);
            //Tabela de produtos
            PdfFont headerFont = PdfFontFactory.createFont(StandardFonts.HELVETICA_BOLD);
            // Criar 6 colunas com tabamnho igual
            Table table = new Table(new float[]{4,4,4,4,4,4});
            table.setWidth(UnitValue.createPercentValue(100));
            // Adicionando cabeçalho
            table.addHeaderCell(new Cell().add(new Paragraph("EAN").setFont(headerFont)));
            table.addHeaderCell(new Cell().add(new Paragraph("Produto").setFont(headerFont)));
            table.addHeaderCell(new Cell().add(new Paragraph("Valor").setFont(headerFont)));
            table.addHeaderCell(new Cell().add(new Paragraph("Desconto").setFont(headerFont)));
            table.addHeaderCell(new Cell().add(new Paragraph("Qtd").setFont(headerFont)));
            table.addHeaderCell(new Cell().add(new Paragraph("Total").setFont(headerFont)));
            // Adicionando linhas/celulas
            for (VendasItensModel produto : p) {
                table.addCell(new Cell().add(new Paragraph(Integer.toString(produto.getCod())).setFont(font)));
                table.addCell(new Cell().add(new Paragraph(produto.getNome()).setFont(font)));
                table.addCell(new Cell().add(new Paragraph(Double.toString(produto.getValorunitario())).setFont(font)));
                table.addCell(new Cell().add(new Paragraph(Double.toString(produto.getValordesconto())).setFont(font)));
                table.addCell(new Cell().add(new Paragraph(Double.toString(produto.getQuantidade())).setFont(font)));
                table.addCell(new Cell().add(new Paragraph(Double.toString(produto.getValortotal())).setFont(font)));
            }

            //Adicionar componentes
            document.add(new Paragraph(title));
            document.add(new LineSeparator(lineDrawer));
            document.add(new Paragraph(dadosEmpresa));
            document.add(new LineSeparator(lineDrawer));
            document.add(new Paragraph(dadosCliente));
            document.add(table);
            document.close();
            

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    public static void main(String[] args){
        VendasItensModel p = new VendasItensModel();
        List<VendasItensModel> produtos = new ArrayList<>();
        p.setCod(1);
        p.setNome("Produto teste");
        p.setValorunitario(10.0);
        p.setValordesconto(5.0);
        p.setQuantidade(10.0);
        p.setValortotal(50.0);
        produtos.add(p);
        Orcamento(3, true, produtos);
    }
}
