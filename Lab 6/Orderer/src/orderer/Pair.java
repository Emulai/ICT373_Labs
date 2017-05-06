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
public class Pair {
    private int left;
    private int right;
    
    public Pair(int left, int right)
    {
        this.left = left;
        this.right = right;
    }
    
    public int GetLeft()
    {
        return left;
    }
    
    public int GetRight()
    {
        return right;
    }
    
    public void SetLeft(int left)
    {
        this.left = left;
    }
    
    public void SetRight(int right)
    {
        this.right = right;
    }
    
    @Override
    public String toString()
    {
        String out = ("(" + left + "," + right + ")");
        return out;
    }
    
}
