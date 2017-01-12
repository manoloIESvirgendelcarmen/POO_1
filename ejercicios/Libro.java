  public class Libro{
    //atributos
    private String titulo;
    private String autor;
    private String editorial;
    private String isbn;
    //constructor
    public Libro(String titulo, String autor, String editorial, String isbn){
      this.titulo    = titulo;
      this.autor     = autor;
      this.editorial = editorial;
      this.isbn      = isbn;
    }
    //getter
    public String getTitulo(){
      return titulo;
    }
    public String getIsbn(){
      return isbn;
    }
    //setter
    public void setTitulo(String titulo){
      this.titulo = titulo;
    }


    /*método que comprueba que un ISBN es correcto
    public static boolean comprobarISBN(String isbn){
      //CÓDIGO
    } */
  }

