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
public class PairOrderer implements Orderer {

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
        if ((left instanceof Pair) && (right instanceof Pair))
        {
            Pair leftPair = (Pair)left;
            Pair rightPair = (Pair)right;
            if (leftPair.GetLeft() < rightPair.GetLeft())
            {
                return true;
            }
            else if ((leftPair.GetLeft() == rightPair.GetLeft()) && 
                     (leftPair.GetRight() <= rightPair.GetRight()))
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
