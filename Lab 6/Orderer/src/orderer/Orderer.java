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
public interface Orderer {
    boolean isLOE(Object left, Object right) throws IllegalArgumentException;
}
