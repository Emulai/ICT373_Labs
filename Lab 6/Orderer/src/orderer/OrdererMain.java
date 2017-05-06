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
        
        Orderer pairOrder = new PairOrderer();
        ArrayList pairList = new ArrayList();
        Pair pair1 = new Pair(5, 8);
        pairList.add(pair1);
        
        Pair pair2 = new Pair(67, 90);
        pairList.add(pair2);
        
        Pair pair3 = new Pair(-34, 66);
        pairList.add(pair3);
        
        Pair pair4 = new Pair(-34, 65);
        pairList.add(pair4);
        
        Pair pair5 = new Pair(25, 27);
        pairList.add(pair5);
        
        Pair pair6 = new Pair(54, 89);
        pairList.add(pair6);
        
        Pair pair7 = new Pair(-20, 20);
        pairList.add(pair7);
        
        Pair pair8 = new Pair(55, 45);
        pairList.add(pair8);
        
        System.out.println(minOf(pairList, pairOrder));
        
    }
    
    public static Object minOf(ArrayList list, Orderer order)
    {
        Object min = null;
        
        try{
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
        }catch(IllegalArgumentException i)
        {
            System.out.println("Incorrect argument type: " + i);
            return null;
        }
        return min;
    }
    
}
