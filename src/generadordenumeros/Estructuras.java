/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadordenumeros;

import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author OLIVER
 */
public class Estructuras {
    
   
    public Stack<Integer> Generar_pila() {
        HashSet<Integer> lista_numeros = new HashSet<>();
        Stack<Integer> pila = new Stack<>();
        while(pila.size()<1000000)
        {
            int random = ThreadLocalRandom.current().nextInt(-10000000,10000000+1);
           
            pila.push(random);
        }
        System.out.println("Numeros en PILA generados correctamente, hay "+pila.size()+" Elementos");
        return pila;
    }
    
    public void Eliminar_pila(Stack <Integer> pila1)
    {
        try
        {
            
            do
            {
                pila1.pop();
            }while(pila1.size()>0);
            System.out.println("La PILA ha sido vaciada, quedan: "+pila1.size()+" Elementos");
        }catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    
    
    //          COLAS   COLAS   COLAS   COLAS   COLAS   COLAS   
    
    public Queue<Integer> Generar_Cola() {
        Queue<Integer> cola = new LinkedList();
        while(cola.size()<1000000)
        {
            int random = ThreadLocalRandom.current().nextInt(-10000000,10000000+1);
            //lista_numeros.add(random);
            cola.add(random);
        }
        System.out.println("Numeros en COLA generados correctamente, hay "+cola.size()+" Elementos");
        return cola;
    }
    
    public void Eliminar_Cola(Queue<Integer> Cola)
    {
        try
        {
            do
            {
                Cola.poll();
            }while(Cola.size()>0);
            System.out.println("La COLA ha sido vaciada, quedan "+Cola.size()+" Elementos");
        }catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}
