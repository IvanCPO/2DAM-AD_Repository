package com.a22ivancp.biblioteca.model;

import com.a22ivancp.biblioteca.model.h2DAO.BookDAO;
import com.a22ivancp.biblioteca.model.hibernate.BookDAOFactory;

public class EntitiesDAOFactory {

    public enum OptionsDAO{
        H2,HIBERNATE;
    }

    public static DAO<Book> getBookManager(OptionsDAO OPTION){
        DAO dao;
        switch (OPTION){
            case H2:
                dao = new BookDAO(BibliotecaConnectionMaganer.getInstance().getConnection());
                break;
            case HIBERNATE:
                dao = new BookDAOFactory();
                break;
            default:
                dao = null;
                break;
        }
        return dao;

    }
}
