/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itarea;

/**
 *
 * @author root
 */
public class ITarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        LoadAutomata hola = new LoadAutomata("/root/Desktop/hola.txt");
        hola.cargar();
        // TODO code application logic here
    }
    
}
