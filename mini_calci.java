import java.util.Scanner;

public class mini_calci {
    public static void main(String[] args) {
        float num_1, num_2;

        System.out.println("Enter the First Number: ");
        Scanner scan = new Scanner(System.in);
        num_1 = scan.nextFloat();

        System.out.println("Enter the Second Number: ");
        Scanner scan2 = new Scanner(System.in);
        num_2 = scan.nextFloat();
        
        System.out.print("You have entered ");
        System.out.print(num_1);
        System.out.print(" and ");
        System.out.println(num_2);

        String prompt = "Enter 0  for addition, 1 for subtraction, 2 for multiplication and 3 for division";
        System.err.println(prompt);

        int input = scan.nextInt();
        switch (input) {
            case 0:
                System.out.println("Adding the numbers");
                System.out.print("Result: ");
                System.out.println(num_1 + num_2);
                break;
            
            case 1:
                System.out.println("Subtracting the numbers");
                System.out.print("Result: ");
                System.out.println(num_1 - num_2);
                break;

            case 2:
                System.out.println("Multiply the numbers");
                System.out.print("Result: ");
                System.out.println(num_1 * num_2);
                break;

            case 3:
                System.out.println("Divide the numbers");
                System.out.print("Result: ");
                System.out.println(num_1 / num_2);
                break;
        
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}