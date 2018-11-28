package poker;

import java.util.*;

public class TerminalTest {

	Scanner s;
	
	
	public static void main(String[] args) {
		TerminalTest t = new TerminalTest();
		//t.printCopy();
		t.repeatAfterMe();
	}

	public TerminalTest() {
		s = new Scanner(System.in);
	}


	public void printCopy() {
		System.out.println("\nYour string is:\n" + readStr());
	}

	public void repeatAfterMe() {
		while(s.hasNext()){
			String str = readStr();
			if(str.equals("stfu")) break;
			System.out.println("no you're a " + str);
		}
	}
	
	public String readStr() {
		try {
			return s.next();
		}
		catch (InputMismatchException e) {
			String token = s.next();
			throw new InputMismatchException("attempts to read an 'int' value from standard input, "
					+ "but the next token is \"" + token + "\"");
		}
		catch (NoSuchElementException e) {
			throw new NoSuchElementException("attemps to read an 'int' value from standard input, "
					+ "but no more tokens are available");
		}

	}



}
