import java.util.Random;

public class Biblia {
	public static void main(String[] args) {
		/*LibroBiblia libro = new LibroBiblia();
		System.out.print("Libros: ");
		int value=azar();
		print(libro.book(value) + " |__________| " + libro.book(value+2));*/

		//System.out.println(String.valueOf(azar()));

		print("**********MENU**********");
		PlayerFile p = new PlayerFile("sabado.txt");
		//p.writeFilePlayer("sabado.txt");
	}
	
	private static void print(String cadena) {
		System.out.println(cadena);
	}

	private static int azar() {
		Random numero = new Random();
		return numero.nextInt(65);
	}
}
