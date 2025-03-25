public class clienteDAO
{
    private ConexionBD conexionBD = new ConexionBD();

    // Metodo para agregar un cliente
    public void agregar(cliente cliente)
    {
        Connection con = conexionBD.getConnection();
        String query = "INSERT INTO clientes (nombre, telefono, direccion, correo) VALUES (?, ?, ?, ?)";

        try
        {
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, cliente.getNombre());
            pst.setString(2, cliente.getTelefono());
            pst.setString(3, cliente.getDireccion());
            pst.setString(4, cliente.getCorreo());

            int resultado = pst.executeUpdate();
            if (resultado > 0)
            {
                JOptionPane.showMessageDialog(null, "Cliente agregado correctamente.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error al agregar cliente.");
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();



            
}