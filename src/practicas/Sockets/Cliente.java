package practicas.Sockets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import practicas.*;
import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

 

/**
 *
 * @author Alumno
 */
public class Cliente {
    public static void main(String args[]){
        
        try {
            Socket cliente = new Socket("10.25.151",3000);
            //in
            //out
            BufferedReader in  = new BufferedReader(new InputStreamReader(cliente.getInputStream()));;
            
            System.out.println(in.readLine());
            
            cliente.close();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}