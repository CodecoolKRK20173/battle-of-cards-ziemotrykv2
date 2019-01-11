import java.util.Scanner;

public class View {
    static Scanner input = new Scanner(System.in);

    public static void printMenu() {
        printString("[1] - Start game\n[2] - Exit");
        printString(": ");
    }

    public static void printCard(Card topCard) {
        printString(topCard.toString());
    }

    public static void printString(String string) {
        System.out.println(string);
    }

    public static int getStatFromPlayer() {
        boolean validChoice = false;

        while (!validChoice) {
            printString("\nChoose one stat from Your card by number: ");
            try {
                String userChoice = input.nextLine();
                int intUserChoice = Integer.parseInt(userChoice);
                if (intUserChoice < 1 || intUserChoice > 7) {
                    clearScreen();
                    printString("Invalid number\n");
                } else {
                    validChoice = true;
                    clearScreen();
                    return intUserChoice;
                }
            } catch (NumberFormatException e) {
                clearScreen();
                printString("Provide number!\n");
                //e.printStackTrace(); No exception swallowing!
            }
        }
        return -1;
    }

    public static void clearScreen() {
        printString("\033[H\033[2J");
        System.out.flush();
    }

    public static int getInput() {
        boolean validChoice = false;
        try {
            while (!validChoice) {
                String userInput = input.nextLine();
                int intUserInput = Integer.parseInt(userInput);
                if (intUserInput >= 1 || intUserInput <= 2) {
                    validChoice = true;
                    clearScreen();
                    return intUserInput;
                } else {
                    clearScreen();
                    printString("Provide valid number!");
                }
            }
        } catch (NumberFormatException e) {
            clearScreen();
            printString("FormatException");
            //e.printStackTrace(); No exception swallowing!
        }

        return -1;
    }
}
