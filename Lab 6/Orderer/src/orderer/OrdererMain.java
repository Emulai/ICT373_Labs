/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderer;
import java.util.ArrayList;
/**
 *
 * @author jaknd
 */
public class OrdererMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Orderer stringOrder = new StringOrderer();
        ArrayList stringList = new ArrayList();
        stringList.add("Cat");
        stringList.add("Dog");
        stringList.add("Antelope");
        stringList.add("Aardvark");
        stringList.add("Apple");
        stringList.add("Zebra");
        stringList.add("Horse");
        
        System.out.println(minOf(stringList, stringOrder));
        
        Orderer intOrder = new IntOrderer();
        ArrayList intList = new ArrayList();
        intList.add(50);
        intList.add(60);
        intList.add(0);
        intList.add(100);
        intList.add(23);
        intList.add(-37);
        
        System.out.println(minOf(intList, intOrder));
    }
    
    public static Object minOf(ArrayList list, Orderer order)
    {
        Object min = null;
        
        for (Object temp : list)
        {
            if (min == null)
            {
                min = temp;
            }
            if (order.isLOE(temp, min))
            {
                min = temp;
            }
        }
        return min;
    }
    
}
