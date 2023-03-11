import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
//       System.out.println(number_1 +""+ number_2);

        while (true){
            float number_1,number_2;
            System.out.print("Enter the first number => ");
            Scanner scan = new Scanner(System.in);
            number_1 = scan.nextFloat();
            System.out.print("Enter the second number => ");
            number_2 = scan.nextFloat();
            System.out.println("Enter\n1 to +\n2 to -\n3 to *\n4 to /\n5 to %\n0 to exit");
            System.out.println("Enter the choice => ");
            int choice = scan.nextInt();
            if( choice != 0){
                switch (choice){
                    case 1:
                        float c = number_1+number_2;
                        System.out.println("The addition of the numbers = "+ c);
                        break;
                    case 2:
                        c = number_1 - number_2;
                        System.out.println("The subtraction of the numbers = "+ c);
                        break;
                    case 3:
                        System.out.println("The multiplication of the numbers = "+number_1*number_2);
                        break;
                    case 4:
                        System.out.println("The division of the numbers = "+number_1/number_2);
                        break;
                    case 5:
                        System.out.println("The modulas of the numbers = "+number_1%number_2);
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;

                }
            }
            else{
                break;
            }
        }


    }

}
