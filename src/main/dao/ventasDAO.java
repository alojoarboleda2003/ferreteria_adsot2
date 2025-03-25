public class ventasDAO
{
    public static void insertar(ventas v)
    {
        Connection con = ConexionDB.getConnection();
        String query = "INSERT INTO ventas (fecha, total, id_cliente) VALUES (?, ?, ?)";
        try
        {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setDate(1, v.getFecha());
            ps.setDouble(2, v.getTotal());
            ps.setInt(3, v.getId_cliente());
            ps.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();

    public static void actualizar(ventas v)
    {
        Connection con = ConexionDB.getConnection();
        String query = "UPDATE ventas SET fecha = ?, total = ?, id_cliente = ? WHERE id = ?";
        try
        {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setDate(1, v.getFecha());
            ps.setDouble(2, v.getTotal());
            ps.setInt(3, v.getId_cliente());
            ps.setInt(4, v.getId());
            ps.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();

    public static void eliminar(int id)
    {
        Connection con = ConexionDB.getConnection();
        String query = "DELETE FROM ventas WHERE id = ?";
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