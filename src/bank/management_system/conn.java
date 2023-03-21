package bank.management_system;
import java.sql.*;

//register the driver
//create connection
//create statement
//execute query
//close connection

public class conn {
    
    Connection c;
    Statement s;
    public conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","root");
            s = c.createStatement();
            
            
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
