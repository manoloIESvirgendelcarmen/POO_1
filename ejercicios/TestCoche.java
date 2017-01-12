  public class TestCoche{
    public static void main(String[] args){
       //creamos un objeto de clase coche
       Coche coche1 = new Coche();
       Coche coche2 = new Coche();
       coche1.addCombustible(5); //añadimos 5 l de combustible
       System.out.printf("Coche 1 tiene actualmente %.2f litro de combustible y una autonomía de %.2f kilómetros%n", coche1.getCantidadCombustible(), coche1.conocerAutonomia());
      // coche2.addCombustible(5); //añadimos 5 l de combustible
       System.out.printf("Coche 2 tiene actualmente %.2f litro de combustible y una autonomía de %.2f kilómetros%n", coche2.getCantidadCombustible(), coche2.conocerAutonomia());
    }
  }
