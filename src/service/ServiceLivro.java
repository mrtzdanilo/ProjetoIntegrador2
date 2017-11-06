/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import exceptions.DataSourceException;
import exceptions.LivroException;
import mocks.MockLivro;
import models.Livro;
import modelvalidador.ValidadorLivro;

/**
 *
 * @author Danilo
 */
public class ServiceLivro {
    public static void cadastrarLivro(Livro livro)throws LivroException, DataSourceException{
        ValidadorLivro.validarLivro(livro);
        try{
            
            MockLivro.inserirLivro(livro);
        } catch(Exception e){
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    
    public static void atualizarCadastro(Livro livro)throws LivroException, DataSourceException{
        ValidadorLivro.validarLivro(livro);
        try{
            
            MockLivro.atualizarLivro(livro);
        } catch(Exception e){
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    
}