/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.sql.*;


/**
 *
 * @author panasonic
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            
            Class.forName("jdbc:derby://localhost:1527/6ceb");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/6ceb"+"ROOT"+12345678);
            Statement st = con.createStatement();
            int rs = st.executeUpdate("Insert into STUDENT values ('yash',2244)");
            
            System.out.println("record inserted succesfully"+rs);
        }
        catch(Exception e){
            System.out.println("error is"+e.toString());
        }
        
            
        }
        // TODO code application logic here
    }
    

