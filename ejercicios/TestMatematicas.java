import java.util.Scanner;

public class TestMatematicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce número");
		Scanner sc = new Scanner(System.in);
		double numero = sc.nextDouble();
		sc.close();
		Matematicas m = new Matematicas();
		m.setNumero(numero);
		System.out.printf("%s%n",m);
		Double raizCuadrada = m.hacerRaizCuadradaNumero();
		if (raizCuadrada.isNaN())
			System.out.println("No hay raiz cuadrada de " + m.getNumero());
		else
			System.out.printf("Raíz cuadrada %.2f%n",m.hacerRaizCuadradaNumero());
		System.out.printf("Raíz cúbica %.2f%n",m.hacerRaizCubicaNumero());
		System.out.printf("Redondeo a positivo %d%n",m.redondearAEnteroNumero());
		System.out.printf("Generar aleatorio %d%n",m.devolverAleatorio());

	}

}
