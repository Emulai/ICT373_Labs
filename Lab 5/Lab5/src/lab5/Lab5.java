/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author jaknd
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarOwner g_carOwner[] = new CarOwner[10];
        CarOwner g_carOwner2 = new CarOwner("Bob", "Car Lane");
        for (int i = 0; i < 10; i++)
        {
            g_carOwner[i] = g_carOwner2;
        }
    }
    
}
