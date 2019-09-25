/*
 * File: Add2Dialog.java
 * --------------------- 
 * This program adds two numbers and prints their sum.  Because
 * this version is a DialogProgram, the input and output appear
 * as popup dialogs.
 */
 
import acm.program.*;
 
public class Add2Dialog extends DialogProgram {
 
   public void run() {
      println("This program adds two numbers.");
      int n1 = readInt("Enter n1: ");
      int n2 = readInt("Enter n2: ");
      int total = n1 + n2;
      println("The total is " + total + ".");
   }
 
} 