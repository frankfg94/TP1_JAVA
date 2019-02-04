/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Racine;

/**
 *
 * @author franc
 */
public class NegativeNumberException extends Exception 
{
        double n;
       public NegativeNumberException(double number)
       {
           n = number;
       }
       
      @Override
     public String toString() {
      return "Le nombre "  +  n + " ne est négatif";
     }
     
}
