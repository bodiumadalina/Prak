import java.util.Scanner;

public class Main {
    public static void printMenu()
    {
        System.out.println("What would you like to do ?");
        System.out.println("1.Add ");
        System.out.println("2.Update ");
        System.out.println("3.Remove ");
        System.out.println("4.Remove ");
        System.out.println("5.Vew ");



    }
    public static void main(String[] args) {
        while (true) {
            printMenu();
            Scanner in = new Scanner(System.in);
            String option = in.nextLine();

            switch(option){
                case "1":
                    break;
                case "2":
                    break;

                case "3":
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Invalid option");
            }

        }
    }
}
