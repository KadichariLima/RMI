/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author 2016122760066
 */
public class CalculadoraImplem extends UnicastRemoteObject implements Calculadora 
{ 
    protected CalculadoraImplem() throws RemoteException  
    { 
        super(); 
    } 
    public long add(long a, long b) throws RemoteException  
    { 
        return a+b; 
    } 
}