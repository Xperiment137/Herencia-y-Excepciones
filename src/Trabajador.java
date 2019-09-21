
public class Trabajador extends Persona implements ITrabajador {
    private int dinero;
    private String puesto;
public Trabajador(int edad, String nombre, double altura, char sexo, int dinero, String puesto){
    super(edad,nombre,altura,sexo);
    this.dinero=dinero;
    this.puesto=puesto;
    }
    public void Horas()
    {
        int horas = (int)(Math.random()*9);
        setDinero(horas*100);
    }
    public int Jubilarse(){  // throws Exceptions; solo si la lanzas en el principal
try {
if(getedad()>=85)
{
SetPuesto("Jubilado");
System.out.println(GetPuesto());
return 1;
}
throw new Exceptions();
}catch (Exceptions ex)
{
    System.out.println(ex.ExcepcionEdad());

}
        return -999;
    }
    public void setDinero(int dinero)
    {
        this.dinero=dinero;
    }
    public int getDinero()
    {
        return dinero;
    }
    public void SetPuesto(String puesto)
    {
        this.puesto=puesto;
    }
    public String GetPuesto()
    {
        return puesto;
    }
}

