/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Racine;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author franc
 */
public class UtiliseRacine {
    public static void main(String[] argv)
{
        try {
           
            Racine extracteur = new Racine(0.01);
            
            // Prélèvement de l'argument 
            double operande= (Double.valueOf(argv[0]));
            double valeurRacine;
            
            valeurRacine=extracteur.racine(operande);
            
            System.out.println(valeurRacine);
            System.out.println("precision "+extracteur.getPrecision() + " , erreur =" +
                    (valeurRacine-Math.sqrt(operande)));
            extracteur.setPrecision(0.00001);
            
            valeurRacine=extracteur.racine(operande);
            
            System.out.println(valeurRacine);
            System.out.println("precision "+extracteur.getPrecision() + " , erreur =" +
                    (valeurRacine-Math.sqrt(operande)));
        } catch (NegativeNumberException ex) {
            ex.printStackTrace();
        }
}
    
}
