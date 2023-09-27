/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ProdutoDAO;
import Model.Produto;

/**
 *
 * @author Aluno
 */
public class ProdutoController {

    public void Salvar(Produto produto) {
        ProdutoDAO prodDAO = new ProdutoDAO();
        prodDAO.salvar(produto);
    }
    
}
