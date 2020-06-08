/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author James Ganley
 */
public class EVM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EVMGUI myGUI = new EVMGUI();
        myGUI.setVisible(true);
           
    try{
    
        String username = "scenic-doodad-262314:europe-north1:evmdata";
        String host = "35.228.170.103";
        String password="KleD7m3PIrOwl0b1";

        Connection con = DriverManager.getConnection( host, username, password );
    }
    catch( SQLException err){
        System.out.println(err.getMessage());
    }
}
}
