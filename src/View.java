import java.util.Scanner;

class View {
    static Scanner input = new Scanner(System.in);

    public static void printMenu() {
        //printLogo();
        System.out.println("[1] - Start game\n[2] - Exit");
        System.out.print("\n: ");
    }

    public static void printCard(Card topCard) {
        System.out.println(topCard.toString());
    }

    public static int getStatFromPlayer() {
        boolean validChoice = false;

        while (!validChoice) {
            System.out.print("Choose one stat from Your card by number: ");

            String userChoice = input.nextLine();
            int intUserChoice = Integer.parseInt(userChoice);
            try {
                if (intUserChoice < 1 || intUserChoice > 7) {
                    clearScreen();
                    System.out.println("Invalid number");
                } else {
                    validChoice = true;
                    clearScreen();
                    return intUserChoice;
                }
            } catch (NumberFormatException e) {
                clearScreen();
                System.out.println("Provide number!");
                e.printStackTrace();
            }
        }

        return -1;
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
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
                    System.out.println("Provide valid number!");
                }
            }
        } catch (NumberFormatException e) {
            clearScreen();
            System.out.println("FormatException");
            e.printStackTrace();
        }

        return -1;
    }


    //public static String pringLogo() {}
}
