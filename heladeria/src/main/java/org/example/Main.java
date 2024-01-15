package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DATOS DE ENTRADA HELADERIA

        Scanner leerDatos = new Scanner(System.in);
        String nombreVendedor;
        String nombreHeladoUno = "Mango";
        String nombreHeladoDos = "Coco";
        String nombreHeladoTres = "fresa";
        int cedulaVendedor;
        int precioHeladoCoco = 3000;
        int precioHeladoMango = 4000;
        int precioHeladoFresa = 4500;
        int cantidadVentaMango ;
        int cantidadVentacoco;
        int cantidadVentaFresa;
        int totalVentasGeneral;

        // pedir datos al vendedor

        System.out.println("cual es tu nombre");
        nombreVendedor=leerDatos.next();

        System.out.println("ingresa cedula");
        cedulaVendedor=leerDatos.nextInt();


        System.out.println("cantidad de venta mango");
        cantidadVentaMango=leerDatos.nextInt();

        System.out.println("cantidad de venta coco");
        cantidadVentacoco=leerDatos.nextInt();

        System.out.println("cantidad de venta fresa");
        cantidadVentaFresa=leerDatos.nextInt();

      int totalventaMango=precioHeladoMango*cantidadVentaMango;
      System.out.println("su venta total de Mango es:"+totalventaMango);

      int totalVentaCoco=precioHeladoCoco*cantidadVentacoco;
      System.out.println("su venta total de coco es: "+totalVentaCoco);

      int totalVentaFresa=precioHeladoFresa*cantidadVentaFresa;
      System.out.println("Su venta total de fresa es: "+totalVentaFresa);

      int totalventageneral=totalVentaCoco+totalVentaFresa+totalventaMango;
      System.out.println("Total general de vemtas es "+totalventageneral);





    }
}