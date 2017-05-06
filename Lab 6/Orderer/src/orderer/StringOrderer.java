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
public class StringOrderer implements Orderer {

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
        if ((left instanceof String) && (right instanceof String))
        {
            String leftString = (String)left;
            if (leftString.compareToIgnoreCase((String)right) < 0)
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
