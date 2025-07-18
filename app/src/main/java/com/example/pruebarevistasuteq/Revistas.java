package com.example.pruebarevistasuteq;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Revistas {
    private String anio;
    private String mes;
    private String urlportada;
    private String urlpdf;




    public Revistas(JSONObject a) throws JSONException {

        anio = a.getString("anio").toString() ;
        mes = a.getString("mes").toString() ;
        urlportada = "https://uteq.edu.ec/assets/images/newspapers/" + a.getString("urlportada").toString()  ;
        urlpdf = a.getString("urlpw").toString() ;
    }
    public static ArrayList<Revistas> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Revistas> revistas = new ArrayList<>();
        for (int i = 0; i < datos.length() && i<20; i++) {
            revistas.add(new Revistas(datos.getJSONObject(i)));
        }
        return revistas;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getUrlportada() {
        return urlportada;
    }

    public void setUrlportada(String urlportada) {
        this.urlportada = urlportada;
    }

    public String getUrlpdf() {
        return urlpdf;
    }

    public void setUrlpdf(String urlpdf) {
        this.urlpdf = urlpdf;
    }
}
