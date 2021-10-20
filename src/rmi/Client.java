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
public class Client {
     public static void main(String[] args)  
    { 
        try
        { 
            Calculadora c = (Calculadora) Naming.lookup("//127.0.0.1:3306/Server"); 
            System.out.println("Adição : "+c.add(20, 15)); 
        }  
        catch (Exception e)  
        { 
            System.out.println(e); 
        } 
    } 
}
