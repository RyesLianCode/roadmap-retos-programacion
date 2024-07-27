

public class ryesliancode {
  //Pagina principal del lenguaje: https://www.java.com/es/

  //Comentario en una linea

  /*Este es un comentario
   * en varias lineas
   */

    public static void main(String[] args) {
      
      //Variables
      String saludo = "Hola Mundo";
      String name    = "Liandrison";
      String leguaje = " Java";
      int myEdad     = 30;
      float myDinero = 19;
      char myLetra   = 'C';
      boolean myBool = true;

      System.out.println(name + " edad "+ myEdad + " Dinero " + myDinero + myLetra + myBool);
      System.out.println(leguaje);

      //tipos de numeros
      byte  myCheck    = 127;
      short myBank     = 5000;
      int   myPhone    = 65626558;
      long  myWater    = 1500000000L;
      float myWeight   = 5.7f;
      double myDweight = 11.5d;

      System.out.println("Cuenta " + 
      myCheck + 
      myBank +            " Telefono "+
      myPhone +        " Peso "+
      myWeight +         " Peso Doble " +
      myDweight +           " Agua " +
      myWater);

      System.out.println("Hello My Name is " + name  );
      System.out.println("Tengo " + myEdad +" años de edad");
      System.out.println("Calificacion " + myLetra);
      System.out.println(myBool);
      System.out.println(myDinero);
      System.out.println(saludo);
      
      
    }
}