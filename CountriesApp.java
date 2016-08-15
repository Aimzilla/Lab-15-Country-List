//the selections work, but need to create a while loop

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		int userSelection;

		Path filePath = Paths.get("countries.txt");
		File myCountriesFile = filePath.toFile();

		System.out.println("Welcome to the Countries Maintenance Application!");
		System.out.println();
		System.out.println("Select '1' to see a list of the countries.");
		System.out.println("Select '2' to add a country to the list.");
		System.out.println("Select '3' to exit the program.");
		System.out.println();
		System.out.print("Please enter your selection: ");

		// capture/store userSelection:
		userSelection = scan1.nextInt();
		scan1.nextLine();

		CountriesTextFile ctf = new CountriesTextFile();

		if (userSelection == 1) {
			// 1 = display list of countries
			ctf.writeToFile(myCountriesFile);
			ctf.readFile(myCountriesFile);

		} else if (userSelection == 2) {
			// 2 = allows user to add to the list
			ctf.writeToFileAppend(myCountriesFile);// pass user input into method
		} else if (userSelection == 3) {
			// 3 = display goodbye message and end
			System.out.println("Goodbye");
		} else {
		}
		scan1.close();
	}
}
