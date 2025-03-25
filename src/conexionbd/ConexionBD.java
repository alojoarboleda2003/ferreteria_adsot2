package conexionbd;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD
{
    public Connection getConnection()
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ferreteria","root","");
        }
        catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
        return con;
    }
}