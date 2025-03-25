public class proveedorDAO
{
    public static void insertar(proveedor p)
    {
        Connection con = ConexionDB.getConnection();
        String query = "INSERT INTO proveedores (nombre, contacto, productos suministrados) VALUES (?, ?, ?, ?)";
        try
        {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getContacto());
            ps.setString(3, p.getProductosSuministrados());
            ps.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();

    public static void actualizar(proveedor p)

    {
        Connection con = ConexionDB.getConnection();
        String query = "UPDATE proveedores SET nombre = ?, contacto = ?, Productos suministrados = ?, WHERE id = ?";
        try
        {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getContacto());
            ps.setString(3, p.getProductosSuministrados());
            ps.setInt(4, p.getId());
            ps.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();

    public static void eliminar(int id)
    {
        Connection con = ConexionDB.getConnection();
        String query = "DELETE FROM proveedores WHERE id = ?";
        try
        {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();

    public static List<proveedor> listar()

    {
        List<proveedor> lista = new ArrayList<proveedor>();
        Connection con = ConexionDB.getConnection();
        String query = "SELECT * FROM proveedores";
        try
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
            {
                proveedor p = new proveedor(rs.getInt("id"), rs.getString("nombre"), rs.getString("telefono"), rs.getString("direccion"), rs.getString("correo"));
                lista.add(p);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();

        return lista;


}