
public class TestEcucacionSegundoGrado {

	public static void main(String[] args) {
		// Obtenemos los coeficientes de la ecuación
		if (args.length < 3){
			System.out.println("Faltan argumentos");
			System.exit(1);
		}
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		// Creamos un objeto de tipo EcuacionSegundoGrado
		EcuacionSegundoGrado e = new EcuacionSegundoGrado(a, b, c);
		//comprobamos si es resoluble
		if (!e.esResoluble())
			System.out.println("No se puede resolver");
		else {
			System.out.printf("Solución 1: %.2f%n", e.calcularX1());
			System.out.printf("Solución 2: %.2f%n", e.calcularX2());

		}
	}

}
