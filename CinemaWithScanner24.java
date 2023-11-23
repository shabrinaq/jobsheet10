import java.util.Scanner;

/**
 * CinemaWithScanner24
 */
public class CinemaWithScanner24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        int column;

        String[][] audience = new String[4][2];
        while (true) {
            System.out.print("Enter a name: ");
            String name = input.nextLine();
            System.out.print("Enter row number: ");
            row = input.nextInt();
            System.out.print("Enter column number: ");
            column = input.nextInt();
            input.nextLine();

            audience[row - 1][column - 1] = name;
            System.out.print("Are there any other audiences to be added? (y/n): ");
            String next = input.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;    
            }
        }
    }
}