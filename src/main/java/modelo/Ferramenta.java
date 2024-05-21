/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import dao.AmigoDAO;

public class Ferramenta {

    private int id;
    private String Nome;
    private int Custo;
    private String Marca;
// Construtor de Objeto Vazio

    public Ferramenta() {
        this(0, "", 0, "");
    }
// Construtor com parâmetro

    public Ferramenta(int id, String Nome, int Custo, String Marca) {
        this.id = id;
        this.Marca = Marca;
        this.Custo = Custo;
        this.Nome = Nome;
    }
// Métodos GET e SET

    public int getid() {
        return id;
    }
     public void setid(int id) {
        this.id = id;

    }
    public String getNome() {
        return Nome;
    }

    
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
     
    public String getMarca() {
        return Marca;
    }

    
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getCusto() {
        return Custo;
    }

    public void setCusto(int Custo) {
        this.Custo = Custo;

    }

    @Override
    public String toString() {
        return "id=" + id + ", Nome=" + Nome + ", Marca=" + Marca + ", Custo=" + Custo;
    }
}