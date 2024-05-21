/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import dao.AmigoDAO;

/**
 *
 * @author 1072416651
 */
public class Amigo {
// Atributos

    private String Nome;
    private int Telefone;
    
// Construtor de Objeto Vazio

    public Amigo(String nome, int numero) {
        this(0, "");
    }
// Construtor de Objeto, com parâmetros

    public Amigo(int Telefone, String Nome) {
        this.Nome = Nome;
        this.Telefone = Telefone;
    }
// Métodos GET e SET



    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    /* ABAIXO OS MÉTODOS PARA USO JUNTO COM O DAO SIMULANDO
A ESTRUTURA EM CAMADAS PARA USAR COM BANCOS DE DADOS. */
// Retorna a Lista de Alunos(objetos)
    public cadastrarAmigo <Amigo> AmigorenciaAmigo() {
        return AmigoDAO.getGerenciaAmigo();
    }
// Cadastra novo aluno

    public boolean insertAmigoBD(String nome, int numero ) {
        Amigo objeto = new Amigo(nome, numero );
        getGerenciaAmigo().add(objeto);
        return true;
    }
// Deleta um aluno específico pelo seu campo ID

    public boolean deleteAmigoBD(String nome) {
        getGerenciaAmigo().remove(Nome);
        return true;
    }
// Edita um aluno específico pelo seu campo ID

    public boolean updateAmigoBD(int numero, String nome) {
        Amigo objeto = new Amigo(numero, nome);
        getGerenciaAmigo().set(Nome, objeto);
        return true;
    }

// carrega dados de um aluno específico pelo seu ID

    public Amigo carregaAmigo(String Nome) {
        return getGerenciaAmigo().get(Nome);
    }

}
