import java.util.List;

/**
 * This is where our main class is located. All other classes come together here. This is where the program runs.
 */
public class Calculator {

    public static void main(String[] args) {
        Ui ui = new Ui();
        ui.greet();
        while(true) {
            String choice = ui.options().toUpperCase();
            if(choice.equals("C")) {
                List<Integer> compoundInfo = ui.getCompoundInfo();
                System.out.println(compoundInfo);
            }
            else if (choice.equals("Q")) {
                break;
            }
        }
    }
}
