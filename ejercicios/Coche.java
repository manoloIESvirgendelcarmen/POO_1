  public class Coche{
    //atributos lo hacemos private por el encapsulamiento
    private double cantidadCombustible = 5;
    private double consumoCombustible = 7; //consumo a los 100 km

    //generalmente los métodos serán públicos
    public void addCombustible(double cantidad){
      cantidadCombustible += cantidad;
    }
    public double getCantidadCombustible(){
      return cantidadCombustible;
    }
    public double conocerAutonomia(){
      return cantidadCombustible / consumoCombustible * 100;
    }
  }
