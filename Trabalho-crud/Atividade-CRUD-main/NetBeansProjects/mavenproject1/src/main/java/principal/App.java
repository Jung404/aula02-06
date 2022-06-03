/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
import classes.Cliente;
import classes.Produto;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import layout.Centro;
import layout.Direita;
import layout.Esquerda;
import layout.Rodape;
import layout.Topo;

public class App {
   public static void main(String[] args){
       
       JFrame janela = new JFrame("Meu primeiro programa");
       janela.setSize(100,100);
       janela.setLocationRelativeTo(null);
       janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       JFrame janela - new JFrame("");
       janela.set.Size(100, 100);
       janela.setLocationRelativeTo(null);
       janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       JPanel conteudo = new JPanel();
       janela.add(conteudo);
       
       JLabel label = new JLabel("Nome");
       conteudo.add(label);
       
       JLabel label_nome = new JLabel("Nome");
       JTextField input_nome = new JTextField(20);
       
       conteudo.add(label_nome);
       conteudo.add(input_nome);
      
       JLabel label_senha = new JLabel("Senha");
       conteudo.add(label_senha);
      
       JLabel label_observacao = new JLabel("Observacao");
       conteudo.add(label_observacao);
       
       JTextArea input_observacao = new JTextArea();
       conteudo.add(input_observacao);
       
       JLabel label_sexo = new JLabel("Qual seu sexo?");
       conteudo.add(label_sexo);
       
       JRadioButton input_masculino = new JRadioButton("Masculino");
       conteudo.add(input_masculino);
       
       JRadioButton input_feminino = new JRadioButton("Feminino");
       conteudo.add(input_feminino);
       
       JButton btn_salvar = new JButton("Clique para salvar");
       conteudo.add(btn_salvar);
       
       //private String[] lista = {"Austria", "Cape Verde", "Denmark", "Nigeria", "Ghana", "Brazil"};
       //JList paises = new JList(lista);
       //conteudo.add(paises);
       //colocar no listar
       
       BorderLayout layout = new BorderLayout();
       conteudo.setLayout(layout);
       
       conteudo.add(new Topo(), BorderLayout.NORTH);
       conteudo.add(new Rodape(), BorderLayout.SOUTH);
       conteudo.add(new Esquerda(), BorderLayout.EAST);
       conteudo.add(new Direita(), BorderLayout.WEST);
       conteudo.add(new Centro(), BorderLayout.CENTER);
       
       
     
       
       
       /*
       Produto produto = new Produto(0);
       Produto p = new Produto(0);
        p.setMarca("Post-it");
        p.setPreco(3.00);
        p.setQuantidade(5);
        p.setModelo("Bloco de Notas");
        p.adicionar();
        
        ArrayList<Produto> produtos = Produto.listar();
        for(Produto produto1: produtos){
        String marca = produto1.getMarca();
        double preco = produto1.getPreco();
        int id = produto1.getId();
        int quantidade = produto1.getQuantidade();
        String modelo = produto1.getModelo();
        System.out.print(marca + preco + id + quantidade + modelo);
        }

        Produto p1 = new Produto(0);
        p1.setMarca("Post-it");
        p1.setPreco(3.00);
        p1.setQuantidade(5);
        p1.setModelo("Bloco de Notas");
        p1.atualizar();
        
        
        Produto p2 = new Produto(0);
        p2.excluir();
        
        
        Cliente c = new Cliente(0);
        c.setNome("Marinalva");
        c.setEmail("marimari@bol.com");
        c.setIdade(34);
        c.setUsername("MariahTodaLindah");
        c.adicionar();
        
        ArrayList<Cliente>clientes = Cliente.listar();
        for(Cliente cliente1: clientes){
            int id = cliente1.getId();
            String nome = cliente1.getNome();
            String email = cliente1.getEmail();
            int idade = cliente1.getIdade();
            String username = cliente1.getUsername();
            System.out.print(id + nome + email + idade + username);
        }
        
        Cliente c1 = new Cliente(0);
        c1.setNome("Marinalva");
        c1.setEmail("marimari@ifap.edu.br");
        c1.setIdade(34);
        c1.setUsername("MariahTodaLindah");
        c1.atualizar();
        
        Cliente c2 = new Cliente(0);
        c2.excluir();
        */

    }
   
}
