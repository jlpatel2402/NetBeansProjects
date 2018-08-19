
package parameter;
import java.sql.*;
public class Parameter {
    
    public static void main(String[] args) {
        try
        {
      Class.forName("org.apache.derby.jdbc.ClientDriver");
             Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/6ceb","root","12345678");
             PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?)");
             pst.setString(1,"enroll");
             pst.setString(2,"fname" );
             pst.setString(3,"sname" );
             int rs= pst.executeUpdate();
             System.out.println("record inserted successfully"+rs);
             con.close();
             
        }
        catch(Exception e)
        {
             System.out.println("error is"+e.toString());
        }
    }
    
}
