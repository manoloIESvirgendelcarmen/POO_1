  public class TestLibro{
    public static void main(String[] args){
     // Libro libro1 = new Libro(); ahora no funciona, ya hay un constructor
	      Libro libro1 = new Libro("el quijote","miguel de cervantes saavedra", "S.L.U. ESPASA LIBROS", "9788467041927");
        System.out.printf("Título del libro %s - %s%n", libro1.getTitulo(), libro1.getIsbn());	
        libro1.setTitulo("El Quijote");
        System.out.printf("Título del libro %s - %s%n", libro1.getTitulo(), libro1.getIsbn());	
    }
  }
