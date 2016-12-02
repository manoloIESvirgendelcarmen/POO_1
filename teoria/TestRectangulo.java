  public class TestRectangulo{
    public static void main(String[] arg){
      //creamos objetos de tipo Rectangulo
      Rectangulo r1 = new Rectangulo();
      Rectangulo r2 = new Rectangulo();
     // System.out.println(r1.lado1); No tiene accesibilidad
     // System.out.println(r2.lado2); lado1 y lado2 son atributos private
     //cambiamos los valores por defecto del rectángulo r2
     r2.setLado1(100); //actualizo los valores del atributo lado1
     r2.setLado2(1000); //actualizo los valores del atributo lado2
      System.out.printf("Atributos del rectángulo 1, lado1: %d, lado2: %d y de área %d%n", r1.getLado1(), r1.getLado2(), r1.getArea());
      System.out.printf("Atributos del rectángulo 2, lado1: %d, lado2: %d y de área %d%n", r2.getLado1(), r2.getLado2(), r2.getArea());
    }
  }
