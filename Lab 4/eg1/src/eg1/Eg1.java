/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg1;

import java.lang.String;
import java.util.Scanner;

/**
 *
 * @author jaknd
 */
public class Eg1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fraction x = new Fraction();
        Fraction y = new Fraction();
        Fraction z = new Fraction();
        String s;
        int num1, num2;
        boolean isZero;
        
        while (true)
        {
            System.out.print("Please enter a numerator: ");
            num1 = input.nextInt();
            System.out.print("Please enter a denominator: ");
            num2 = input.nextInt();
            x.InsertFraction(num1, num2);
            
            isZero = x.IsZero(x);
            if (isZero){
                break;
            }
            
            System.out.print("Please enter a second numerator: ");
            num1 = input.nextInt();
            System.out.print("Please enter a second denominator: ");
            num2 = input.nextInt();
            y.InsertFraction(num1, num2);
            
            isZero = y.IsZero(y);
            if (isZero){
                break;
            }
            
            s = x.ToString();
            System.out.print("Fraction 1: " + s + "\n");
            
            s = y.ToString();
            System.out.print("Fraction 2: " + s + "\n");
            
            System.out.print("Sum: ");
            z = x.Add(y);
            z.print();
            
            System.out.print("Product: ");
            z = x.Multiply(y);
            z.print();
            
            System.out.print("Quotient: ");
            z = x.Divide(y);
            z.print();
        }
        
        /*System.out.print("Add: ");
        z = x.Add(y);
        z.print();
        
        System.out.print("Multiply: ");
        z = x.Multiply(y);
        z.print();
        
        System.out.print("Divide: ");
        z = x.Divide(y);
        z.print();
        
        System.out.print("Simplify X: ");
        z = x.Simplify(x);
        z.print();
        
        System.out.print("Simplify Y: ");
        z = y.Simplify(y);
        z.print();
        
        s = x.ToString();
        System.out.println("String: " + s);
        
        t = y.ToString();
        System.out.println("String: " + t);*/
    }
    
}
