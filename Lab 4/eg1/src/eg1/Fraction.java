/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eg1;

import java.lang.String;

/**
 *
 * @author jaknd
 */
public class Fraction {
    
    private int numerator, denominator;
    
    public Fraction(){
        numerator = 0;
        denominator = 0;
    }
    
    public Fraction(int a, int b){
        numerator = a;
        denominator = b;
    }
    
    public void InsertFraction(int p_num, int p_den){
        numerator = p_num;
        denominator = p_den;
    }
    
    public Fraction Add(Fraction p_frac){
        
        Fraction l_frac = new Fraction();
        
        l_frac.numerator = (numerator * p_frac.denominator + 
                          denominator * p_frac.numerator);
        l_frac.denominator = (denominator * p_frac.denominator);
        
        return Simplify(l_frac);
    }
    
    public Fraction Multiply(Fraction p_frac){
        
        Fraction l_frac = new Fraction();
        
        l_frac.numerator = numerator * p_frac.numerator;
        l_frac.denominator = denominator * p_frac.denominator;
        
        return Simplify(l_frac);
    }
    
    public Fraction Divide(Fraction p_frac){
        
        Fraction l_frac = new Fraction();
        
        l_frac.numerator = numerator * p_frac.denominator;
        l_frac.denominator = denominator * p_frac.numerator;
        
        return Simplify(l_frac);
    }
    
    /*private*/public Fraction Simplify(Fraction p_frac){
        
        Fraction l_frac = new Fraction();
        
        for (int i = p_frac.numerator * p_frac.denominator; i > 1; i--){
            if ((p_frac.denominator % i == 0) && (p_frac.numerator % i == 0)){
                l_frac.numerator = p_frac.numerator / i;
                l_frac.denominator = p_frac.denominator / i;
                return l_frac;
            }else{
                l_frac.numerator = p_frac.numerator;
                l_frac.denominator = p_frac.denominator;
            }
        }
        return l_frac;
    }
    
    public String ToString(){
        
        String l_string = numerator + "/" + denominator;
        
        return l_string;
        
    }
    
    public boolean IsZero(Fraction p_frac){
        
        if ((p_frac.numerator == 0) || (p_frac.denominator == 0)){
            return true;
        }else{
            return false;
        }
    }
    
    public void print(){
        System.out.println( numerator + "/" + denominator );
    }
}
