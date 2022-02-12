/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadordenumeros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author OLIVER
 */
public class Archivo {
    public static void Guardar_como(ArrayList<Integer> numeros) throws IOException {
 
        String fichero = "generador.txt";
 
        try {
            File archivo= new File(fichero);
            FileWriter escribir= new FileWriter(archivo,true);
            PrintWriter imprimir=new PrintWriter(escribir);   
            imprimir.print(numeros);
            imprimir.close();
//ficheroSalida.flush();
            //ficheroSalida.close();
            System.out.println("Guardados correctamente...");
 
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error: El fichero no existe. ");
        }
 
    }
    
    public static void Ordenar()
    {
        try{
            String salida = null;
            BufferedReader Lectura = new BufferedReader(new FileReader("generador.txt"));
            

            for(String linea = Lectura.readLine(); linea != null; linea = Lectura.readLine()){
        System.out.println(linea);
                
                String numeros[] = linea.split(" ");
                Arrays.sort(numeros);
                salida += Arrays.toString(numeros) + "\n";                                           
                
            }
            
        System.out.print(salida);
        }catch(FileNotFoundException e){
            System.out.println("El Archivo no encontrado" + e.getMessage());
        }catch(IOException IOe){
            System.out.println("El Archivo no se pudo abrir o cerrar" + IOe.getMessage());
        }
    }
    
}
