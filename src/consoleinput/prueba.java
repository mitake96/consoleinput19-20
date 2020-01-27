package consoleinput;
import java.util.Scanner;
import consoleinput.ConsoleInput;
public class prueba {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		ConsoleInput consola = new ConsoleInput(keyboard);
		
		boolean numero;
		System.out.println("Introduce un boolean");
		numero = consola.readBooleanUsingChar();
		
		
		
		
		
	}

}
