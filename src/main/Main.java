import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/ferreteria";
        String user = "root"; 
        String password = ""; 

        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void closeConnection(Connection con) {
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();


            public static void main(String[] args) {
                Connection con = ConexionDB.getConnection();
                if (con != null) {
                    System.out.println("Conexión exitosa");
                    ConexionDB.closeConnection(con);
                }
            }
    public class Main {
            public static void main(String[] args) {
                ClienteDAO clienteDAO = new ClienteDAO();

                // Insertar un cliente
                Cliente c = new Cliente(0, "Juan", "1234567890", "Calle 123", "
                clienteDAO.insertar(c);

                // Actualizar un cliente
                c.setNombre("Pedro");
                c.setTelefono("0987654321");
                c.setDireccion("Calle 456");
                c.setCorreo("jijj9i")
                clienteDAO.actualizar(c);


                }
            }
        }
}
