public class Persona implements  IPersona {  // extends

    private int edad;
    private String nombre;
    private double altura;
    private char sexo;


     public Persona(int edad, String nombre, double altura, char sexo) {
        this.edad = edad;
        this.nombre = nombre;
        this.altura = altura;
        this.sexo = sexo;
    }



    public String ToString()
    {
        String aux="";
        aux=aux+nombre+edad+altura+sexo;
        return aux;
    }
    public boolean Equals(Persona aux)
    {
        if(nombre==aux.nombre&&edad==aux.edad&&altura==aux.altura&&sexo==aux.sexo)
        {
            return true;
        }
        else
            return false;

    }

  public int  getedad()
    {
        return edad;
    }
    public void Mostrar()
    {
        System.out.println("Persona:"+nombre+"\nAltura:"+altura+"\nSexo:"+sexo+"\nEdad:"+edad);

    }
    public void cantar()
    {
        System.out.println("La laa la raa laaa!");
    }


}