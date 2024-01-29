package graalcli;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		String command = args[0];
		switch (command) {
			case "add" -> System.out.println(new BigDecimal(args[1]).add(new BigDecimal(args[2])));
			case "subtract" -> System.out.println(new BigDecimal(args[1]).subtract(new BigDecimal(args[2])));
			default -> System.err.println("Don't understand " + command);
		}
	}
}