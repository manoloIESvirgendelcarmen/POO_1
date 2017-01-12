
public class EcuacionSegundoGrado {
	//atributos
	private int a;
	private int b;
	private int c;
	//constructor
	public EcuacionSegundoGrado(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	//método que nos dice si es resoluble o no
	public boolean esResoluble(){
		return (b * b) - (4 * a * c) >=0;
	}
	//método que calcula la primera solución
	public double calcularX1(){
		return (- b  + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) /
				(2 * a);
	}
	//método que calcula la segunda solución
		public double calcularX2(){
			return (- b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) /
					(2 * a);
		}
	
	
}
