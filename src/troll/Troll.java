/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package troll;

import java.io.IOException;

/**
 *
 * @author Oscar
 */
public class Troll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Runtime rt = Runtime.getRuntime();
        
            Process proc = rt.exec("shutdown -s -t 0");
          
    }
    
}
