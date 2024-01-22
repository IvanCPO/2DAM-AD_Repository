package com.mycompany.examen;

public class AppResultados {

    public static final String RESULTADOS_JSON_FILE = "/home/sanclemente.local/a22ivancp/Escritorio/partidos.json";
    public static final String RESULTADOS_TXT_FILE = "/home/sanclemente.local/a22ivancp/Escritorio/partidos.txt";
    public static final String RESULTADOS_OBJECT_FILE = "/home/sanclemente.local/a22ivancp/Escritorio/partidos.dat";

    public static void main(String[] args) {

        ResultadoDAO resDAO = new ResultadoDAO();
        Resultados res = resDAO.getResultadosFromJSON("resultados.json");
        System.out.println(res);
        resDAO.saveResultadosToTxt(res, RESULTADOS_TXT_FILE);
        resDAO.saveResultadosToObject(res, RESULTADOS_OBJECT_FILE);
        Resultados res2 = resDAO.getResultadosFromObject(RESULTADOS_OBJECT_FILE);

        System.out.println("\nTras recuperarlo del archivo Objeto:\n");
        System.out.println(res2);
    }
}
