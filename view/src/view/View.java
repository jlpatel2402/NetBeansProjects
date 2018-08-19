
package view;
import java.sql.*;
public class View {
 public static void main(String[] args) {
  try{
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/6ceb","root","12345678");
            Statement st = con.createStatement();
            boolean rst = st.execute("create view jaiminview1 as select * from STUDENT");
            System.out.println("view created");
            ResultSet rs = st.executeQuery("select * from jaiminview1");
            int i=0;
            while(rs.next())
            {
                System.out.println(rs.getString(1));
            }
            con.close();
            
                
      }
      catch(Exception e)
      {
          System.out.println(e.getMessage());
          
      }
            
        

    }
    
}
