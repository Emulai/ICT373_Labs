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
        // TODO code application logic here
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
