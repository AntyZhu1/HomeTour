import java.util.Scanner;  // Import the Scanner class

public class TestingInput {

	public static void main(String[] args) {
		System.out.println(
				"To navigate between rooms, enter 'go <direction>'. For example: 'go north'."
				+ "\n"
				+ "To Interact with an object, enter 'examine <object>'. For example: 'examine chair'."
				+ "\n"
				+ "To check exits again, use 'check exits'."
				+ "\n"
				+ "To check a specific direction for an exit, use 'check <direction>'. For example: 'check north'."
				+ "\n"
				+ "To see this message again, use 'print help'.");
		Scanner s = new Scanner(System.in);
		String in = s.nextLine();
		String holder[] = in.split(" ");
		String part1 = holder[0];
		String part2 = holder[1];
		System.out.println(in);
		System.out.println(part1);
		System.out.println(part2);

	}

}
