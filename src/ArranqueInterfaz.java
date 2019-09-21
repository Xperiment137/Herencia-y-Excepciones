public class ArranqueInterfaz {
    public static void main(String[] args) {
      Trabajador Mercedes = new Trabajador(56, "Mercedes", 1.60, 'M',10,"Directora");
        Trabajador Paca = new Trabajador(34, "Mercedes", 1.50, 'M',10,"Secretaria");
        Trabajador Evaristo = new Trabajador(85, "Evaristo", 1.80, 'H',10,"Programador");
Paca.Mostrar();
Mercedes.Horas();
System.out.println(Paca.ToString());
System.out.println(Mercedes.equals(Paca));
System.out.println(Mercedes.getDinero());
Mercedes.Jubilarse();
Evaristo.Jubilarse();
    }
}
