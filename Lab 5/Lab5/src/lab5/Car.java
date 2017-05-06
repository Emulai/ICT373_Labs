/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.lang.String;

/**
 *
 * @author jaknd
 */
public class Car {
    private String m_licence;
    
    Car (String l_licence)
    {
        m_licence = l_licence;
    }
    
    void SetLicence (String l_licence)
    {
        m_licence = l_licence;
    }
    
    String GetLicence ()
    {
        return m_licence;
    }
    
}
