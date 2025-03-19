package conexiobd;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexioBD
{
    public Connection getConnection()
    {
        Connection con = null;

        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ferreteria","root", "");
            JOptionPane.showMessageDialog(null,"conecion exitosa");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return con;

    }


}
