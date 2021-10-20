/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Naming;

/**
 *
 * @author 2016122760066
 */
public class Server  
{ 
    Server() 
    { 
        try
        { 
            Calculadora c = new CalculadoraImplem(); 
            Naming.rebind("RMI://127.0.0.1:3306/Server", c); 
        }  
        catch (Exception e)  
        { 
            e.printStackTrace(); 
        } 
    } 
    public static void main(String[] args)  
    { 
        new Server(); 
    } 
}   
