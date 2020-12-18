package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Chancletas extends Zapatos{
    private String estilo;

    public Chancletas(String talla, String tipo, String estilo) {
        super(talla, tipo);
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void twoFile() throws IOException {
        File archivo=new File("Chancletas");
        boolean a=archivo.createNewFile();
        if(!archivo.createNewFile()){
            archivo.createNewFile();
        }
        FileWriter escribir=new FileWriter ("Tacos",true);
        String d="Talla"+getTalla()+"Tipo"+getTipo()+"Estilo"+getEstilo();
        escribir.write(d);
        escribir.close();
        datos.add(d);
    }
}
