/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import exceptions.DataSourceException;
import exceptions.VendaException;
import models.Venda;
import modelvalidador.ValidadorVenda;
import dao.DaoVenda;
/**
 *
 * @author Danilo
 */
public class ServiceVenda {
    public static int inserirVenda(Venda venda) throws VendaException,DataSourceException{
        int id = 0;
        try{
            ValidadorVenda.validaVenda(venda);
            id = DaoVenda.inserirVenda(venda);
        } catch(Exception e){
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
        return id;
    }
}
