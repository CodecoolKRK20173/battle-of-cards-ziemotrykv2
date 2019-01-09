import java.util.Scanner;

class View {
    Scanner input = new Scanner(System.in);

    public static String printMenu() {
        //printLogo();
        System.out.println("[1] - Start game\n
        [2] - How to play\n
        [3] - Exit");
        System.out.print("\n: ");
    }

    public static String printCard(Card topCard) {
        System.out.println(topCard.toString());
    }

    public static String getStatFromPlayer() {
        validChoice = false;

        while (validChoice!) {
            System.out.print(Choose one stat from Your card by number: );

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
                System.out.println("Provide number!");
                e.printStackTrace();
            }
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    //public static String pringLogo() {}
}
