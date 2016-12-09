public class TestTriangulo {
  public static void main(String[] arg){
    Triangulo t1 = new Triangulo();
    t1.setLado1(10);
    t1.setLado2(100);
    t1.setLado3(19);
    mostrarDatosTriangulo(t1);
    Triangulo t2 = new Triangulo(2,3,4);
    mostrarDatosTriangulo(t2);
    Triangulo t3 = new Triangulo(5);
    mostrarDatosTriangulo(t3);
    Triangulo t4 = new Triangulo(15,21);
    mostrarDatosTriangulo(t4);
  }
    public static void mostrarDatosTriangulo(Triangulo t) {
    	System.out.printf("Triangulo con lados %d, %d y %d; y con perímetro %d%n", t.getLado1(), t.getLado2(), t.getLado3(),t.calcularPerimetro());
    }
}

