package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Zapatos {
    private String Talla;
    private String Tipo;
    ArrayList<String> datos=new ArrayList<>();

    public Zapatos(String talla, String tipo) {
        Talla = talla;
        Tipo = tipo;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String talla) {
        Talla = talla;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public String Calzar(){
      String a="Que bien me quedan estos"+getTipo()+"que son talla"+getTalla();
        return a;
    }



    public abstract void twoFile() throws IOException;
}
