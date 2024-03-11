/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import modelos.IProdutoCRUD;
import modelos.Produtos;
import java.util.ArrayList;
import java.util.List;
import modelos.CarrinhoDeCompras;
import modelos.Cliente;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import modelos.IProduto;

import persistencia.ProdutoDAO;

/**
 *
 * @author pcgamergab
 */
public class ProdutoControle implements IProdutoCRUD {
    
           int id = 0;
           IProdutoCRUD produtoPersistencia = null;
           Cliente cliente = Cliente.getInstance();
           CarrinhoDeCompras carrinho = CarrinhoDeCompras.getInstance();
           LocalDateTime momentoAtual = LocalDateTime.now();           
           DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
           String diaHoraFormatados = momentoAtual.format(formatter);

     public ProdutoControle() {
        produtoPersistencia = new ProdutoDAO(id);
    
     }
    
    @Override
    public void Incluir(Produtos objproduto) throws Exception {
        
        produtoPersistencia.Incluir(objproduto);
        
    }

  @Override
    public void Alterar(int id, Produtos objproduto) throws Exception {
        produtoPersistencia.Alterar(id, objproduto);
     }

    @Override
    public Produtos Consultar(Produtos objproduto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Produtos> ObterListagemDeProdutos() throws Exception {
       return produtoPersistencia.ObterListagemDeProdutos();
                
    }

    @Override
    public void Deletar(int id) throws Exception {
         produtoPersistencia.Deletar(id);
    }
    
    public void gerarRelatorioPDF(){
     //instancia do pdf   
    Document documento = new Document(PageSize.A4);
    //margens da pagina
    documento.setMargins(40, 40, 40, 40);
    //gerar documento
        try {
            PdfWriter.getInstance(documento, new FileOutputStream("Produtos.pdf"));
            documento.open();
            
            
            
            //adicionando logo tipo ao pdf
            String caminho = new File("src\\imagens\\logotipo.png").getCanonicalPath();
            Image image1 = Image.getInstance(caminho);
            image1.scaleAbsolute(120, 120);
            image1.setAbsolutePosition(10, 720);
            documento.add(image1);
            
            
             //adicionando hora e dia da compra
            Paragraph diaehora = new Paragraph("Data e Hora: "+diaHoraFormatados);
            diaehora.setAlignment(Element.ALIGN_RIGHT);
            documento.add(diaehora);
            
            
            //pulando alguns paragrafos
            documento.add(new Paragraph(" "));
            documento.add(new Paragraph(""));
            
            Paragraph paragrafoDireita = new Paragraph("Relatório do Pedido");
            paragrafoDireita.setAlignment(Element.ALIGN_RIGHT);
            documento.add(paragrafoDireita);
            documento.add(new Paragraph(" "));
            documento.add(new Paragraph(" "));
            documento.add(new Paragraph(" "));
            
            //linha de separação amarela
            documento.add(new LineSeparator(1, 100, BaseColor.YELLOW, 0, 0));
            documento.add(new Paragraph("Informações do cliente: "));
            documento.add(new Paragraph(" "));          
            documento.add(new Paragraph(cliente.toString()));
            documento.add(new Paragraph(" "));
            documento.add(new LineSeparator(1, 100, BaseColor.YELLOW, 0, 0));
            documento.add(new Paragraph(" "));
            
            
            //listar os produtos dentro do pdf via to string//
            // documento.add(new Paragraph(carrinho.listarProdutosNoCarrinhoString()+"\n"+"Valor Total: "+carrinho.calcularTotal()));
             documento.add(new Paragraph(" "));
             
             //criando tabela no pdf
            PdfPTable tabela = new PdfPTable(3);
            //nome para as colunas
            PdfPCell col1 = new PdfPCell(new Paragraph("Produto"));
            PdfPCell col2 = new PdfPCell(new Paragraph("Valor"));
            PdfPCell col3 = new PdfPCell(new Paragraph("Quantidade"));
            
            
            tabela.addCell(col1);
            tabela.addCell(col2);
            tabela.addCell(col3);
            
           //Listar produtos no pdf dentro de uma table//
           List<IProduto> lista = carrinho.listarProdutosNoCarrinhoTable();
            for (IProduto item : lista) {
                
                PdfPCell cell1 = new PdfPCell(new Paragraph(item.getNome()));
                PdfPCell cell2 = new PdfPCell(new Paragraph(String.valueOf(item.getPreco())));
                PdfPCell cell3 = new PdfPCell(new Paragraph(String.valueOf(item.getQuantidade())));
                  
                 tabela.addCell(cell1);
                 tabela.addCell(cell2);
                 tabela.addCell(cell3);
            }
            documento.add(tabela);
            documento.add(new Paragraph(" "));
            
            Paragraph valortotal = new Paragraph("Valor Total: "+carrinho.calcularTotal());
            valortotal.setAlignment(Element.ALIGN_RIGHT);
            documento.add(valortotal);
             
             
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            documento.close();
        }
        
        //abrir o documento pdf no leitor padrão do sistema
        try {
            Desktop.getDesktop().open(new File("Produtos.pdf"));
        } catch (Exception e2) {
            System.out.println(e2);
        }
        
    }

    
}


