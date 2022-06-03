/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Produto {

    protected int id;
    protected int quantidade;
    protected String modelo;
    protected String marca;
    protected double preco;

    public Produto(int id) {
        if(id>0){
            String sql = "SELECT * FROM produto WHERE id = ?";
            
            try{
                Connection con = DB.conexao();
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, id);
                ResultSet registro = stmt.executeQuery();
                
                while(registro.next()){
                    this.setId(registro.getInt("id"));
                    this.setModelo(registro.getString("modelo"));
                    this.setMarca(registro.getString("marca"));
                    this.setPreco(registro.getDouble("preco"));
                    this.setQuantidade(registro.getInt("quantidade"));
                }
                
            }catch(SQLException e){
                System.out.print("Erro na consulta de Produto: "+e.toString());
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }
   
}

