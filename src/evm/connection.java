/*package evm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author James Ganley

public class connection {
    
    try{
    
        String username = "root";
        String host = "35.228.170.103";
        String password="KleD7m3PIrOwl0b1";

        Connection con = DriverManager.getConnection( host, username, password );
    }
    catch( SQLException err){
        System.out.println(err.getMessage());
    }
}
