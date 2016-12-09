  /** Clase que nos sirve 
  * para creas objetos de
  * tipo Triangulo
  * @author Manuel Molino
  * @version 1.0
  */

  public class Triangulo {
    //atributos
    private int lado1;
    private int lado2;
    private int lado3;
    //constructor o constructores
    /**constructor por defecto inicializa los lados a valor cero*/
    public Triangulo(){
      System.out.println("Creado triangulo con lados igual a 0");
    }
    /**constructor que inicializa
    * un triangulo dado los tres lados
    * @param lado1 lado primero
    * @param lado2 lado segundo
    * @param lado3 lado tercero
    */
    public Triangulo (int lado1, int lado2, int lado3){
      this.lado1 = lado1;
      this.lado2 = lado2;
      this.lado3 = lado3;
      System.out.println("Creado triangulo");
    }
    /**constructor que inicializa
    * un triangulo equilatero
    * @param lado lado uno, lado dos y lado tres
    */
    public Triangulo(int lado){
      this.lado1 = lado;
      this.lado2 = lado;
      this.lado3 = lado;
      System.out.println("Creado triangulo equilatero");
    }
    /**constructor que inicializa
    * un triangulo isósceles
    * @param lado1 lado uno y lado dos
    * @param lado2 lado tres
    */
    public Triangulo(int lado1, int lado2){
      this.lado1 = lado1;
      this.lado2 = lado1;
      this.lado3 = lado2;
      System.out.println("Creado triangulo isósceles");
    }
    //getters y setters
    /**getter de lado1
    * @return lado1
    */
    public int getLado1(){
      return lado1;
    }
    /**getter de lado2
    * @return lado2
    */
    public int getLado2(){
      return lado2;
    }
    /**getter de lado3
    * @return lado3
    */
    public int getLado3(){
      return lado3;
    }
    /**setter lado1
    * @param lado1 set del lado1
    */
    public void setLado1(int lado1){
      this.lado1 = lado1;
    }
    /**setter lado2
    * @param lado2 set del lado2
    */
    public void setLado2(int lado2){
      this.lado2 = lado2;
    }
    /**setter lado3
    * @param lado3 set del lado3
    */
    public void setLado3(int lado3){
      this.lado3 = lado3;
    }
    
    /**método que calcula el perímetro
    * del triangulo
    * @return el valor del périmetro del triangulo
    */
    public int calcularPerimetro(){
      return lado1 + lado2 + lado3;
    }




  }
