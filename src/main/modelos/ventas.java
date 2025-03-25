public class ventas 
{
    private int id;
    private String fecha;
    private String total;
    private String id_cliente;
    private String id_empleado;

    public ventas(int id, String fecha, String total, String id_cliente, String id_empleado)
    {
        this.id = id;
        this.fecha = fecha;
        this.total = total;
        this.id_cliente = id_cliente;
        this.id_empleado = id_empleado;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFecha()
    {
        return fecha;
    }

    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }

    public String getTotal()
    {
        return total;
    }

    public void setTotal(String total)
    {
        this.total = total;
    }

    public String getId_cliente()
    {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente)
    {
        this.id_cliente = id_cliente;
    }

    public String getId_empleado()
    {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado)
    {
        this.id_empleado = id_empleado;
    }
}