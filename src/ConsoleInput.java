import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInput {
	
	static Scanner keyboard = new Scanner(System.in);
	
	public static byte readByte() {
		
		byte result = 0;
		boolean y = true;
		do {
		try {
		result=keyboard.nextByte();
		y = false;
		}
		catch (InputMismatchException e) {
			y = true;
			System.out.println("Error, introduce un numero valido: ");
		} 
		finally { 
			keyboard.nextLine(); 
		}
		} while(y);
		return result;	
	}
	
	public byte readByteLessThan(byte upperBound) {
		byte result;
		System.out.println("Introduzca un número menor que " + upperBound);
		do {
			result=readByte();
			if (result>=upperBound) {
				System.out.println("Introduzca un número menor que " + upperBound);
			}
		}while(result>=upperBound);
		return result;
	}
	
	public byte readByteLessOrEqualThan(byte upperBound) {
		byte result;
		System.out.println("Introduzca un número menor o igual que " + upperBound);
		do {
			result=readByte();
			if (result>upperBound) {
				System.out.println("Introduzca un número menor o igual que " + upperBound);
			}
		}while(result>upperBound);
		return result;
				
	}

	public byte readByteGreaterThan(byte lowerBound) {
		byte result;
		System.out.println("Introduzca un número mayor que " + lowerBound);
		do {
			result=readByte();
			if (result<=lowerBound) {
				System.out.println("Introduzca un número mayor que " + lowerBound);
			}
		}while(result<=lowerBound);
		return result;
				
	}

	public byte readByteGreaterOrEqualThan(byte lowerBound) {
		byte result;
		System.out.println("Introduzca un número mayor o igual que " + lowerBound);
		do {
			result=readByte();
			if (result<lowerBound) {
				System.out.println("Introduzca un número mayor o igual que " + lowerBound);
			}
		}while(result<lowerBound);
		return result;	
		
		
		
	}
	
	public byte readByteInRangeInclusive(byte lowerBound, byte upperBound) {
		
		
		
	}
	
	

}
