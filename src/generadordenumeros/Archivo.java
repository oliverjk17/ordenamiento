/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadordenumeros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author OLIVER
 */

public class Archivo {
    public static void Generar() throws IOException {
        HashSet<Integer> lista_numeros = new HashSet<>();
        while(lista_numeros.size()<1000000)
        {
            int random = ThreadLocalRandom.current().nextInt(-10000000,10000000+1);
            lista_numeros.add(random);
        }
        //System.out.println("Hay: "+lista_numeros.size()+" numeros en el array");
        
        String fichero = "generador.txt";
 
        try {
            File archivo= new File(fichero);
            FileWriter escribir= new FileWriter(archivo,true);
            PrintWriter imprimir=new PrintWriter(escribir);   
            imprimir.print(lista_numeros);
            imprimir.close();
            System.out.println("Numeros generados correctamente...");
 
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error: El fichero no existe. ");
        }
 
    }
    
    public static void Ordenar() throws IOException
    {
        
        File archivo = new File("Ordenados.txt");
        archivo.createNewFile();
        
        ArrayList<String> lineas = new ArrayList<>();
        Scanner leer = new Scanner(new File("generador.txt")).useDelimiter(",");
        while(leer.hasNext())
        {
            lineas.add(leer.next());
        }

        ArrayList<Integer> resultado = Pasar_Arr_Int(lineas);
        Collections.sort(resultado);
        
        FileWriter escribir = new FileWriter(archivo);
        PrintWriter imprimir=new PrintWriter(escribir);   
        imprimir.print(resultado);
        imprimir.close();
    }
    
    public static ArrayList<Integer> Pasar_Arr_Int(ArrayList<String>numeros){
        ArrayList<Integer> Convertir = new ArrayList<Integer>();
        for(String stringValue : numeros){
            try{
                Convertir.add(Integer.parseInt(stringValue.trim()));
            }catch (Exception ex) {
            }
        }
        return Convertir;
    }
    
    
    public static ArrayList<Integer> burbuja(ArrayList<Integer> arreglo)
    {
      int auxiliar;
      ArrayList<Integer> arregloOrdenado = new ArrayList<>();
      for(int i = 1; i < arreglo.size(); i++)
      {
        for(int j = 0;j < arreglo.size()-i;j++)
        {
          if(arreglo.get(j) > arreglo.get(j+1))
          {
            auxiliar = arreglo.get(j);
            arreglo.set(j, arreglo.get(j+1));
            arreglo.set(j+1,  auxiliar);
          }   
        }
      }
      arregloOrdenado = arreglo;
      return arregloOrdenado;
    }
}
