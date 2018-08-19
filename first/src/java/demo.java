

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class demo extends HttpServlet {

  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        int enroll = Integer.parseInt(request.getParameter("enroll"));
        String fname = request.getParameter("fname");
        String sname = request.getParameter("sname");
         try
        {
      Class.forName("org.apache.derby.jdbc.ClientDriver");
             Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/6ceb","root","12345678");
             PreparedStatement pst = con.prepareStatement("insert into student values(?,?)");
             pst.setInt(2,enroll);
             pst.setString(1,fname );
             int rs= pst.executeUpdate();
             out.print("record inserted successfully"+rs);
             con.close();
             
        }
        catch(Exception e)
        {
             out.println("error is"+e.getMessage());
        }
   
        }
    }

    