public class inventario 
{
    private int id;
    private String nombre;
    private String cantidad;
    private String precio;
    private String descripcion;

    public inventario(int id, String nombre, String cantidad, String precio, String descripcion)
    {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
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

    public String getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(String cantidad)
    {
        this.cantidad = cantidad;
    }

    public String getPrecio()
    {
        return precio;
    }

    public void setPrecio(String precio)
    {
        this.precio = precio;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }
}