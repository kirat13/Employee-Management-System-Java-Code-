
package employee.management.system;
import java.sql.*;

import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
   Statement s;
   Connection c;
    public Conn()
    {
             try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagementsystem","root","mypass");
             s=c.createStatement();
                    }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}