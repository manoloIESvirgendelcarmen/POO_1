
public class NumerosAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generamos 10 números aleatorios
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		}
		System.out.println("_____________________");
		//generar 10 números eneteros entre el 1 y el 100
		for (int i = 0; i < 10; i++) {
			int numero = (int) (Math.random() * 100) + 1;
			System.out.println(numero);
		}
		System.out.println("_____________________");
		//generar 10 números eneteros entre el 0 y el 100
		for (int i = 0; i < 10; i++) {
			int numero = (int) (Math.random() * 101) ;
			System.out.println(numero);
		}
	}

}
