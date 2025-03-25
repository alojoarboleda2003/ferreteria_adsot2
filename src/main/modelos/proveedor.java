public class proveedor 
{
    private int id;
    private String nombre;
    private String contacto;
    private String productos_suministrados;

    public proveedor(int id, String nombre, String contacto, String productos_suministrados)
    {
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
        this.productos_suministrados = productos_suministrados;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getContacto()
    {
        return contacto;
    }

    public void setContacto(String contacto)
    {
        this.contacto = contacto;
    }

    public String getProductos_suministrados()
    {
        return productos_suministrados;
    }

    public void setProductos_suministrados(String productos_suministrados)
    {
        this.productos_suministrados = productos_suministrados;
    }


}