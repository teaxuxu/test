import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// TODO Exceptions (A-Z, a-z)
// TODO Exception (File Name arg.)
// TODO Exception (File empty)

// TODO Scanner char, int 

// TODO try same project as an Array not List  
//TODO Reverse outprint without changing original
// TODO read whole sentences out of file - how?
// TODO commands each letter individual; schere = s c h e r e 
// TODO check each letter, if e print e if not make stars 

public class SchereSteinPapier {

	// ************************* Main

	public static void main(String[] args) {

		try {
			List<String> schereSteinPapier = new ArrayList<>();
			String commandsFilePath;
			try {
				commandsFilePath = args[0];
			} catch (ArrayIndexOutOfBoundsException error) {
				throw new SchereSteinPapierException("Commands file must be specified.");
			}
			schereSteinPapier = commands(commandsFilePath);

			isFirstMethod(schereSteinPapier, "Das sind alle möglichen Befehle: ");

			// *************** reverse order (changes with reverse the original list)

			Collections.reverse(schereSteinPapier);
			System.out.println();
			isFirstMethod(schereSteinPapier, "Das sind alle möglichen Befehle verkehrt rum: ");

			// ************** game play method call

			playTheGame(schereSteinPapier);

		} catch (IOException | SchereSteinPapierException error) { // throws method - change it back
			System.out.println(error.getMessage());
		}
	}

	// ************************ play the game method

	private static void playTheGame(List<String> schereSteinPapier) {

		Scanner scanner = new Scanner(System.in);

		try {
			String command = "";
			String computerCommand = "";

			while (!(command = nextCommand(scanner)).equals("beenden")) {
				System.out.println();

				Collections.shuffle(schereSteinPapier);
				computerCommand = schereSteinPapier.get(0);
				System.out.println("Computer hat: " + computerCommand);

				// TODO UpperCase Sensitivity Problem if equals.

				if (command.equals(computerCommand)) {
					System.out.println("Gleichstand");

				} else if (command.equals("schere") && computerCommand.equals("papier")) {
					System.out.println("Du gewinnst");

				} else if (command.equals("schere") && computerCommand.equals("stein")) {
					System.out.println("Du verlierst");

				} else if (command.equals("stein") && computerCommand.equals("papier")) {
					System.out.println("Du verlierst");

				} else if (command.equals("stein") && computerCommand.equals("schere")) {
					System.out.println("Du gewinnst");

				} else if (command.equals("papier") && computerCommand.equals("schere")) {
					System.out.println("Du verlierst");

				} else if (command.equals("papier") && computerCommand.equals("stein")) {
					System.out.println("Du gewinnst");
				}

			}
			
		} finally {
			scanner.close();
		}
		// closes but gives one more time computer hat: need to be fixed
	}

	// ************************ is first method

	private static void isFirstMethod(List<String> schereSteinPapier, String message) {

		boolean isFirst = true;
		
		System.out.print(message);
		for (int listIndex = 0; listIndex < schereSteinPapier.size(); listIndex++) {
			String commandsList = schereSteinPapier.get(listIndex);

			if (isFirst) {
				isFirst = false;
			} else {
				System.out.print(", ");

			}
			System.out.print(commandsList);

		}
	}

	// ************************** Buffered Reader

	static List<String> commands(String commandPath) throws IOException {

		List<String> resultCommandsInList = new LinkedList<>();
		BufferedReader commandReader;
		try {
			commandReader = new BufferedReader(new FileReader(commandPath)); // automatically IO E. if
		} catch (IOException error) {
			throw new IOException("Can not find commands file: " + error.getMessage());
			// is unchecked don't need to communicate it outside to caller - doesn't need
			// throws
		}

		try {
			String line;
			while ((line = commandReader.readLine()) != null) { // automatically IO E. if file not readable
				if (!line.equals("")) {
					resultCommandsInList.add(line);
				}
			}
		} catch (IOException error) {
			throw new IOException("Can not read commands from file: " + error.getMessage());
			// is unchecked don't need to communicate it outside to caller - doesn't need
			// throws
		} finally {
			try {
				commandReader.close();
			} catch (IOException error) {
				// Do nothing because we already read the data or threw an IOException.
				System.out.println("Warning: cannot close command file, continuing");
			}
		}
//		}
		return resultCommandsInList;
	}

	// ************************ Scanner command

	public static String nextCommand(Scanner scanner) {

		String command;
		boolean isValidCommand;

		do {
			System.out.println();
			System.out.println("-".repeat(80));
			System.out.println("Wähle und tippe ein: ");
			System.out.println();
			System.out.println("  \"schere\"");
			System.out.println("  \"stein\"");
			System.out.println("  \"papier\"");
			System.out.println("  \"beenden\"");
			System.out.println();
			System.out.println("-".repeat(80));
			System.out.print(">  ");

			command = scanner.nextLine().toLowerCase();
			isValidCommand = command.equals("schere") || command.equals("stein") || command.equals("papier")
					|| command.equals("beenden");
			//TODO titelCase

		} while (!isValidCommand);
		return command;
	}

}
