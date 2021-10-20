/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author 2016122760066
 */
public interface Calculadora extends Remote{
    public long add(long a, long b) throws RemoteException; 

}
//Usar no prompt passando a pastabin do JDK
/*cd e:
cd Java \ jdk1.6.0_23 \ bin
javac Calculadora.java
javac CalculadoraImplem.java
javac Server.java
javac Client.java
rmic CalculadoraImplem
iniciar registro RMI
java Server
//Abrir outro prompt de comando e novamente ir para mesmo caminho e: \ java1 \ jdk1.6.0_23 \ bin
java Client*/