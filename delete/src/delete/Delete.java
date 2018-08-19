
package delete;
import java.sql.*;

public class Delete {
       public static void main(String[] args){
         try{
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/6ceb","root","12345678");
            Statement st = con.createStatement();
            int rs = st.executeUpdate("Delete from STUDENT where NAME = 'yash'");
      if (rs!=0)
      {
          System.out.println("record deleted.....");
      }
      else
      {
          System.out.println("record  not deleted.....");
      }
      
        }
         catch(Exception e)
               {
             System.out.println("error is"+e.toString());
        }
       }
}

