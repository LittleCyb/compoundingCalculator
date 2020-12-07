import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * Takes care of the user interface of the compounding calculator.
 */
public class Ui {
    Scanner scan = new Scanner(System.in);

    /**
     * Greets the user.
     */
    public void greet() {
        System.out.println("Welcome to Compounding Calculator!\n");
    }

    /**
     * Adds a space to the user interface, making the program more readable.
     */
    public void space() {System.out.println("\n");}

    /**
     * Cleans the "input tape" of the scanner. Making sure old input
     * is not re-read.
     */
    public void cleanInput() {scan.next();}

    /**
     * Prints the error message e.
     * @input e error message to be printed.
     */
    public void printError(Exception e) {
        System.out.println("-----------");
        System.out.println(e);
        System.out.println("-----------\n");
    }

    /**
     * Presents the user with possible options before proceeding.
     * @return result the chosen action of the user as a string.
     */
    public String options() {
        System.out.println("What would you like to do?");
        System.out.println("[C]ompound starting from X");
        System.out.println("[F]ind time required to reach X");
        System.out.println("[Q]uit");
        String result = scan.next();
        return result;
    }

    /**
     * Retrieves information for a given menu option to input into a Computation in Calculator.
     *
     * @return a list containing the information gathered by the method.
     */
    public List<Integer> getInfo(String[] questions) {
        List<Integer> info = new ArrayList<>();
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            int answer = 0;
            do {
                if (answer < 0) {
                    System.out.println("Please enter a positive value");
                }
                answer = scan.nextInt();
            } while (answer < 0);
            info.add(answer);
        }
        return (info);
    }
}
