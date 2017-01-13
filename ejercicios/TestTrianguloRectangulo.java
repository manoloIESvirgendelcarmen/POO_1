import javax.swing.JOptionPane;

public class TestTrianguloRectangulo {

	public static void main(String[] args) {
		// creamos un objeto TrianguloRectangulo
		String inputCateto1 = JOptionPane.showInputDialog("Valor del cateto 1");
		String inputCateto2 = JOptionPane.showInputDialog("Valor del cateto 2");
		TrianguloRectangulo t = 
				new TrianguloRectangulo(Double.parseDouble(inputCateto1),
						Double.parseDouble(inputCateto2));
		//System.out.println(t);
		/*System.out.printf("Hipotenusa %.2f, área %.2f y perímetro "
				+ "%.2f%n", t.calcularHipotenusa(), t.calcularArea(),
				t.calcularPerimetro());*/
		String mensaje = "Hipotenusa " + t.calcularHipotenusa()+ "\n" + 
				"Área " + t.calcularArea() + "\n" +
				"Perímetro " + t.calcularPerimetro();
		JOptionPane.showMessageDialog(null, t,
		        "Triangulo Rectángulo", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,  mensaje,
		        "Triangulo Rectángulo", JOptionPane.INFORMATION_MESSAGE);
	}

}
