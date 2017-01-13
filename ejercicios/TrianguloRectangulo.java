
public class TrianguloRectangulo {
	//atributos
	private double cateto1;
	private double cateto2;
	//constructor 
	public TrianguloRectangulo(double cateto1, double cateto2) {
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
	}
	//calculo de la hipotenusa
	public double calcularHipotenusa(){
		return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
	}
	//calculo del área
	public double calcularArea(){
		return cateto1 * cateto2 / 2.0;
	}
	//calculo del perímetro
	public double calcularPerimetro(){
		return cateto1 + cateto2 + calcularHipotenusa();
	}
	@Override
	public String toString() {
		return "Triangulo Rectangulo: " + cateto1 +", "+ cateto2
				+", "+ (Math.round(calcularHipotenusa() * 100)) / 100.0;
	}
	
}
