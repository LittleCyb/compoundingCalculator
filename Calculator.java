import java.util.InputMismatchException;
import java.util.List;

/**
 * This is where our main class is located. All other classes come together here. This is where the program runs.
 */
public class Calculator {

    public static void main(String[] args) throws RuntimeException {
        Ui ui = new Ui();
        ui.greet();

            while(true) {
                try {
                    String choice = ui.options().toUpperCase();
                    ui.space();
                    if(choice.equals("C")) {
                        String[] compoundQuestions = new String[] {
                                "What is your starting amount?",
                                "What is your monthly contribution? [>= 0]",
                                "What is the yearly interest rate? [in percent]",
                                "For how long would you like to save? [in years]"};
                        List<Integer> compoundInfo = ui.getInfo(compoundQuestions);
                        System.out.println(compoundInfo + "\n");
                    } else if (choice.equals("F")) {
                        String[] findQuestions = new String[] {
                                "What amount would you like to reach?",
                                "What is your starting amount?",
                                "What is your monthly contribution? [>= 0]",
                                "What is the yearly interest rate? [in percent]"};
                        List<Integer> findInfo = ui.getInfo(findQuestions);
                        System.out.println(findInfo + "\n");
                    } else if (choice.equals("Q")) {
                        break;
                    }
                } catch (InputMismatchException e) {
                    ui.printError(e);
                    ui.cleanInput();
                }
            }


    }
}
