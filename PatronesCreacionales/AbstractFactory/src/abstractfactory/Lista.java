/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author chris
 */

import java.util.ArrayList;
public abstract class Lista
{
    private ArrayList<String> elementos = new ArrayList();
    // -------------------------------
    public String getElemento( int posicion ) {
        return this.elementos.get( posicion );
    }
    // -------------------------------
    public void insertarElemento( String texto ) {
        this.elementos.add( texto );
    }
    // -------------------------------
    public void dibujar()
    {
        System.out.println("Dibujando la lista...");
    }
    // -------------------------------
    // Método a implementar por las clases que hereden
     public abstract void configurar();
}