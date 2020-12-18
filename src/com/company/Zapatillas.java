package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Zapatillas extends Zapatos{
    private String estilo;

    public Zapatillas(String talla, String tipo, String estilo) {
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
        File archivo=new File("Zapatillas");
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
