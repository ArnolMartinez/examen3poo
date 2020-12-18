package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner entrada=new Scanner(System.in);
        char w='s';
while(w=='s'){

        System.out.println("1.Zapatillas");
        System.out.println("2.Chancletas");
        System.out.println("3.Tacos");
        System.out.println("Elija un tipo de zapato");
        int a =entrada.nextInt();
        entrada.nextLine();
        String b,c,d;
        switch (a){
            case 1:
                System.out.println("talla");
                 b=entrada.nextLine();
                System.out.println("tipo");
                c=entrada.nextLine();
                System.out.println("Estilo");
                d=entrada.nextLine();
                Zapatos zap=new Zapatillas(b,c,d);
                zap.Calzar();
                zap.twoFile();
                 break;
            case 2:
                System.out.println("talla");
                b=entrada.nextLine();
                System.out.println("tipo");
                c=entrada.nextLine();
                System.out.println("Estilo");
                d=entrada.nextLine();
                Zapatos cha=new Chancletas(b,c,d);
                cha.Calzar();
                cha.twoFile();
                break;
            case 3:
                System.out.println("talla");
                 b=entrada.nextLine();
                System.out.println("tipo");
                 c=entrada.nextLine();
                System.out.println("Estilo");
                 d=entrada.nextLine();
                Zapatos tac=new Tacos(b,c,d);
                tac.Calzar();
                tac.twoFile();
                break;


        }
    System.out.println("Desea agregar otro tipo de zapato? (s=Si/n=No");
    w=entrada.next().charAt(0);
}
    }
}
