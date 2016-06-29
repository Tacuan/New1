package shildt1;

public class Guess {

	public static void main(String[] args) throws java.io.IOException {
		char ch, answer = 'K';
		System.out.println("I`m thinking about letter between A and Z.");
		System.out.println("Can you guess it: ");
		
		ch = (char) System.in.read(); //чтение символа с клавиатуры
		if (ch == answer) System.out.println("... Right...");
		else { 
			System.out.print("...Sorry, you are ");
			if (ch < answer) System.out.println("too low");
			else System.out.println("too high");
		}

	}

}
