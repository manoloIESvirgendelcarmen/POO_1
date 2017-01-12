
public class Palabra {
	//atributos
	private String contenido;
	//constructor
	public Palabra(String contenido) {
		this.contenido = contenido;
	}
	
	@Override
	public String toString() {
		return "Contenido de la palabra: " + contenido;
	}

	//Un metodo que devuelva la palabra en mayúscula
	public String convetirContenidoMayuscula(){
		return contenido.toUpperCase();
	}
	//Un metodo que devuelva la palabra en minúscula
	public String convetirContenidoMinuscula(){
			return contenido.toLowerCase();
	}
	//Un métod que devuelva el número de letras
	public int contarLetrasDeContenido(){
		return contenido.length();
	}
	//Un método para reemplazar letras
	public String reemplazarLetrasDeContenido(char oldChar, char newChar){
		return contenido.replace(oldChar, newChar);
	}
	
	
	//devolvemos la primera letra del contenido en minúscula
	public char obtenerPrimeraLetraDeContenido(){
		return contenido.toLowerCase().charAt(0);
	}
	
	//devolvemos la última letra del contenido en mayúscula
		public char obtenerUltimaLetraDeContenido(){
			return contenido.toUpperCase().charAt(contenido.length() - 1);
		}
	
	//crear una main para comprobar que funciona
		public static void main(String[] args) {
			Palabra p = new Palabra("prueba");
			System.out.println();
		}
	
	
}
