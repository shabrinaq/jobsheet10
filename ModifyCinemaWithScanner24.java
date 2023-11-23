import java.util.Scanner;

/**
 * ModifyCinemaWithScanner24
 */
public class ModifyCinemaWithScanner24 {

    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        String[][] audience = new String[4][2];
        int row;
        int column;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.println("=================================================");
            System.out.print("Enter your option: ");

        int option = input24.nextInt();
        input24.nextLine();

        switch (option) {
            case 1:
                System.out.print("Enter a name: ");
                String name = input24.nextLine();
                System.out.print("Enter row number: ");
                row = input24.nextInt();
                System.out.print("Enter column number: ");
                column = input24.nextInt();
                input24.nextLine();

                // Mendapatkan waktu saat ini 
                System.out.print("Enter current time: ");
                String manualTime = input24.nextLine();
                String dateNow = new String();

                // Menentukan studio berdasarkan waktu
                String studio;
                if (dateNow.compareTo("10.00") < 0) {
                    studio = "Studio 1";
                } else if (dateNow.compareTo("13.30") < 0) {
                    studio = "Studio 2";
                } else {
                    studio = "Studio 3";
                }

                // Menyimpan informasi audience
                if (row >= 1 && row <= audience.length && column >= 1 && column <= audience[0].length) {
                    audience[row - 1][column - 1] = name + " (" + studio + ") ";
                    System.out.println("Audience " + name + " placed on a chair " + row + column + " in " + studio);
                } else {
                    System.out.println("The row or column is not valid. Please enter valid row and column numbers");
                }
                break;

            case 2:
                System.out.println("Show audience list");
                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length; j++) {
                            if (audience[i][j] == null) {
                                System.out.print("***\t"); 
                            } else {
                                System.out.print(audience[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

            case 3:
                System.out.println("Exiting the program. Goodbye!");
                input24.close();
                System.exit(0);;
            
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3");
                break;
            }
        }
    }
}