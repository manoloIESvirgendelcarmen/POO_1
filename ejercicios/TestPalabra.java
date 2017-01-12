import java.util.Scanner;

public class TestPalabra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabraPrueba;
		if (args.length == 0){
			System.out.println("Introduce una palabra");
			Scanner sc = new Scanner(System.in);
			palabraPrueba = sc.next();
			sc.close();
		}
		else
			palabraPrueba = args[0];
		if (palabraPrueba.trim().length() == 0){
			System.out.println("Palabra sin contenido");
			System.exit(1);
		}
		Palabra palabra = new Palabra(palabraPrueba.trim());
		System.out.printf("%s%n", palabra);
		System.out.printf("Palabra en mayúscula %s%n",
				palabra.convetirContenidoMayuscula());
		System.out.printf("Palabra en minúscula %s%n",
				palabra.convetirContenidoMinuscula());
		System.out.printf("Longitud de la palabra %d%n",
				palabra.contarLetrasDeContenido());
		System.out.printf("Última letra en mayúscula %c%n",
				palabra.obtenerUltimaLetraDeContenido());
		System.out.printf("Última letra en minúscula %c%n",
				palabra.obtenerPrimeraLetraDeContenido());
		System.out.printf("Reemplazar letras %s%n",
				palabra.reemplazarLetrasDeContenido('u', 'Z'));

	}

}
