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

    /**
     *
     * @param left
     * @param right
     * @return
     * @throws IllegalArgumentException
     */
    @Override
    public boolean isLOE(Object left, Object right) throws IllegalArgumentException
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
        throw new IllegalArgumentException();
    }
    
}
