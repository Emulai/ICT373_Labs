/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderer;

/**
 *
 * @author jaknd
 */
public class IntOrderer implements Orderer {
    @Override
    public boolean isLOE(Object left, Object right)
    {
        if ((left instanceof Integer) && (right instanceof Integer))
        {
            if ((int)left < (int)right)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        //Exception thrown if not Integer
        return false;
    }
    
}
