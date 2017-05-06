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
public class CarOwner {
    private String m_name;
    private String m_address;
    private Car m_car[];
    private int m_count;
    
    CarOwner (String p_name, String p_address)
    {
        m_name = p_name;
        m_address = p_address;
        m_car = new Car[10];
        m_count = 0;
    }
    
    CarOwner (String p_name, String p_address, Car p_car[], int p_count)
    {
        m_name = p_name;
        m_address = p_address;
        m_car = p_car;
        m_count = p_count;
    }
    
    void AddCar (String p_licence)
    {
        m_car[m_count].SetLicence(p_licence);
        m_count ++;
    }
    
    void RemoveCar (String p_licence)
    {
        for (int i = 0; i < m_count; i++) {
            String l_temp = m_car[i].GetLicence();
            if (l_temp.equals(p_licence))
            {
                m_car[i].SetLicence("");
            }
        }
        
    }
    
    Car GetCar (String p_licence)
    {
        for (int i = 0; i < m_count; i++)
        {
            String l_temp = m_car[i].GetLicence();
            if (l_temp.equals(p_licence))
            {
                return m_car[i];
            }
        }
        return null;
    }
    
    
}
