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
     * Presents the user with possible options before proceeding.
     * @return result the chosen action of the user as a string.
     */
    public String options() {
        System.out.println("What would you like to do?");
        System.out.println("[C]ompounding calculation");
        String result = scan.next();
        return result;
    }

    public List<Integer> getCompoundInfo() {
        List<Integer> compoundInfo = new ArrayList<>();
        compoundInfo.add(1);
        return (compoundInfo);
    }
}
