package com.educacionit.clase24.clase24;

import java.io.*;

public class AppPrincipal {
    public static void main(String[] args) throws IOException {
        //System.out.println("Hello");
        //leer archivo
        File ruta = new File("c:/junio");
        File archivo = new File(ruta, "miArchivo.txt");
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        boolean flag = true;
        String texto ="";
        while(flag){
            String linea = br.readLine();
            if(linea!=null)
                texto += linea + "\n";
            else
                flag = false;
        }

        System.out.println(texto);

    }
}
