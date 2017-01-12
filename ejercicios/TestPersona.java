
public class TestPersona {
	public static void main(String[] args) {
		Persona persona1 = new Persona("jacinto", 35);
		System.out.println("persona 1: " + persona1.getNombre() + 
				" de edad " + persona1.getEdad());
		//cambio la edad
		persona1.setEdad(45);
		System.out.println("persona 1: " + persona1.getNombre() + 
				" de edad " + persona1.getEdad());
		System.out.println(persona1);
	}
}

