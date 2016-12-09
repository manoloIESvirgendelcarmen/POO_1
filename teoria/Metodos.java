  import java.util.Scanner;
  public class Metodos
    {
      public static void main(String[] args)
        {
          //leemos por scanner dos números
          System.out.println("Introduce un número entero");
          Scanner sc = new Scanner(System.in);
          int numero = sc.nextInt();
          sc.close();
       //   System.out.println("Número introducido: " + numero);
          //llamar a un método que nos diga si es número primo o no
          boolean primo = esPrimo(numero);
          //mostramos por pantalla lo anterior
          System.out.printf("El número %d ¿es primo? %b%n", numero, primo);
          mostrarDivisores(numero);
          mostrarDivisores(numero,2);
        }
        //método que nos dice si un número es primo o no
      public static boolean esPrimo(int numero)
        {
          boolean primo = true;
          for (int i = 2; i <= numero/2; i++)
            {
              if (numero % i == 0) //divisible 
                {
                  primo = false;
                  break; //dejamos de comprobar
                }
            }
          return primo;
        }
      
      //método que nos muestre en pantalla los divisores
    public static void mostrarDivisores(int numero)
      {
       for (int i = 1; i <= numero/2; i++)
        if (numero % i == 0)
          System.out.println(numero + " es divisible por " + i);
      }
    
      //método que nos muestre en pantalla los divisores
    public static void mostrarDivisores(int numero, int columnas)
      {
       int contador = 0;
       for (int i = 1; i <= numero/2; i++)
        if (numero % i == 0)
          { 
            contador++;
            System.out.printf("%5d",i);
            if (contador % 2 == 0)
              System.out.println();
          }
        System.out.println();
      }
    
  }
 
    
