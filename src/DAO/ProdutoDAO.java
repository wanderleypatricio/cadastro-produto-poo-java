/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Produto;
import db.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ProdutoDAO {
    private Connection con;  //Conecta com banco
    private PreparedStatement stm; //prepara a ação no banco
    private ResultSet rs; //retorna dados do banco
    
    public boolean salvar(Produto produto){
        try{
            String sql = "insert into produtos values(?,?,?,?,?)";
            con = Conexao.getConnection();
            stm = con.prepareStatement(sql);
            stm.setLong(1, produto.getCodigo());
            stm.setString(2, produto.getNome());
            stm.setString(3, produto.getDescricao());
            stm.setDouble(4, produto.getPreco());
            stm.setInt(5, produto.getQtde());
            if(stm.execute()){
                return true;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return false;
    }
}
