/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.chiste;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author a22ivancp
 */
public interface IChisteDAO {
    public URL getChiste() throws MalformedURLException;
    public URL getChisteByLang(String lang)throws MalformedURLException;
    public URL getChisteByCategory(String category)throws MalformedURLException;
    public Chiste readChisteJSON(String json);
}
