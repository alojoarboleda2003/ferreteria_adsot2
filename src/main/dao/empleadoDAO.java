public class empleadoDAO
{
    public static void insertar(empleado e)
    {
        Connection con = ConexionDB.getConnection();
        String query = "INSERT INTO empleados (nombre, cargo, salario) VALUES (?, ?, ?, ?)";
        try
        {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getCargo());
            ps.setString(3, e.getSalario());
            ps.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();

    public static void actualizar(empleado e)
    {
        Connection con = ConexionDB.getConnection();
        String query = "UPDATE empleados SET nombre = ?, cargo = ?, salario = ?, WHERE id = ?";
        try
        {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getCargo());
            ps.setString(3, e.getSalario());
            ps.setInt(4, e.getId());
            ps.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();

    public static void eliminar(int id)
    {
        Connection con = ConexionDB.getConnection();
        String query = "DELETE FROM empleados WHERE id = ?";
        try
        {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();


}