public class empleado 
{
    private int id;
    private String nombre;
    private String cargo;
    private String salario;

    public empleado(int id, String nombre, String cargo, String salario)
    {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
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

    public String getCargo()
    {
        return cargo;
    }

    public void setCargo(String cargo)
    {
        this.cargo = cargo;
    }

    public String getSalario()
    {
        return salario;
    }

    public void setSalario(String salario)
    {
        this.salario = salario;
    }
}