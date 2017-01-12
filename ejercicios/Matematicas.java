
public class Matematicas {
	//atributos
	private double numero;
	//getters y setters

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}
	//método que devuelve la raiz cuadrada del numero
	public double hacerRaizCuadradaNumero(){
		return Math.sqrt(numero);
	}
	//método que devuelve la raiz cúbica del numero
		public double hacerRaizCubicaNumero(){
			return Math.cbrt(numero);
	}
	//método que devuelve un entero redondeado del número
	public long redondearAEnteroNumero(){
		return Math.round(Math.abs(numero));
	}
	//método que devuelve números aleatorios entre 0 y N (entero)
	public long devolverAleatorio(){
		//redondeo a entero:   5.5  pasaría a 6
		long numeroRedondeado =  Math.round(numero);
		if (numeroRedondeado < 0)
			return  (long) (Math.random() * (numeroRedondeado - 1));
		else
			return (long) (Math.random() * (numeroRedondeado + 1));
	}
		
		
		
		
		
	@Override
	public String toString() {
		return "Matematicas [numero=" + numero + "]";
	}
	public static void main(String[] args) {
		Matematicas m = new Matematicas();
		System.out.println(m);
		m.setNumero(5.5);
		System.out.println(m);
	}
}
