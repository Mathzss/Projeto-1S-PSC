package dao;

import Conexao.conexao;
import java.sql.PreparedStatement;
import modelo.Amigo;

/**
 * Aqui vamos simular a persistência de dados.
 */
public class AmigoDAO {

public void cadastrarAmigo (amigos Amigo){
    String sql = "INSERT INTO AMIGO(NOME, NUMERO) VALUES(?, ?)"; 
        PreparedStatement ps = null;
        
        try { 
         ps = conexao.getconexao().PreparedStatement(sql); 
         ps.setString(parameterIndex: 1, Amigo.getnome());
         ps.setString(parameterIndex: 2, Amigo.getnumero());
        } 
        }
        
}
