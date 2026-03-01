import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to calculator 'Masio'");
            System.out.println("1 For Addition");
            System.out.println("2 For Subtraction");
            System.out.println("3 For Multiplication");
            System.out.println("4 For Division");
            System.out.println("5 For Getting Modulus");
            System.out.println("6 To Exit the Calculator");
            int x = input.nextInt();
            double z = 0;
            double y = 0;
            switch (x) {
                
                case 1:
                    System.out.println("Enter the first num");
                    z = input.nextDouble();
                    System.out.println("Enter the second num");
                    y = input.nextDouble();
                    System.out.println(z + y);
                    break;
                
                case 2:
                    System.out.println("Enter the first num");
                    z = input.nextDouble();
                    System.out.println("Enter the second num");
                    y = input.nextDouble();
                    System.out.println(z - y);
                    break;
                
                case 3:
                    System.out.println("Enter the first num");
                    z = input.nextDouble();
                    System.out.println("Enter the second num");
                    y = input.nextDouble();
                    System.out.println(z * y);
                    break;
                
                case 4:
                    System.out.println("Enter the numerator");
                    z = input.nextDouble();
                    System.out.println("Enter the denomirator");
                    y = input.nextDouble();
                    System.out.println(z / y);
                    break;
                
                case 5:
                    System.out.println("Enter the numerator");
                    z = input.nextDouble();
                    System.out.println("Enter the denomirator");
                    y = input.nextDouble();
                    System.out.println(z % y);
                    break;
                
                case 6:
                    System.out.println("Exiting program...");
                    return;
                default:
                System.out.println("Invalid choice. Please select one number from 1 to 6.\n");
            }
        }     
    }
}
