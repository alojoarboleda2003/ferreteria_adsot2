public class inventarioDAO
{
    public static void insertar(inventario i)
    {
        Connection con = ConexionDB.getConnection();
        String query = "INSERT INTO inventario (nombre, categoria, precio, cantidad disponible, proveedor asociado= ?) VALUES (?, ?, ?, ?, ?)";
        try
        {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, i.getNombre());
            ps.setDouble(2, i.getCategoria());
            ps.setInt(3, i.getPrecio());
            ps.setInt(4, i.getCantidadDisponible());
            ps.setInt(5, i.getProveedorAsociado());
            ps.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();

    public static void actualizar(inventario i)
    {
        Connection con = ConexionDB.getConnection();
        String query = "UPDATE inventario SET nombre = ?, categoria = ?, precio= ?, cantidad disponible= ?, proveedor asociado= ?  WHERE id = ?";
        try
        {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, i.getNombre());
            ps.setDouble(2, i.getCategoria());
            ps.setInt(3, i.getPrecio());
            ps.setInt(4, i.getCantidadDisponible());
            ps.setInt(5, i.getProveedorAsociado());
            ps.setInt(6, i.getId());
            ps.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();

    public static void eliminar(int id)
    {
        Connection con = ConexionDB.getConnection();
        String query = "DELETE FROM inventario WHERE id = ?";
        try
        {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();

    public static List<inventario> listar()
    {
        Connection con = ConexionDB.getConnection();
        String query = "SELECT * FROM inventario";
        List<inventario> inventarios = new ArrayList<>();
        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
            {
                inventario i = new inventario(rs.getInt("id"), rs.getString("nombre"), rs.getDouble("categoria"), rs.getInt("precio"), rs.getInt("cantidad disponible"), rs.getInt("proveedor asociado"));
                inventarios.add(i);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();

        return inventarios;

    public static inventario buscar(int id)
    {
        Connection con = ConexionDB.getConnection();
        String query = "SELECT * FROM inventario WHERE id = ?";
        try
        {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                inventario i = new inventario(rs.getInt("id"), rs.getString("nombre"), rs.getDouble("categoria"), rs.getInt("precio"), rs.getInt("cantidad disponible"), rs.getInt("proveedor asociado"));
                return i;
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();

        return null;


}