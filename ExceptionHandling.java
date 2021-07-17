import java.util.Scanner;

public class ExceptionHandling
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        
        System.out.println("Enter number : ");
        int d = sc.nextInt();

            try {
                int x = d / 0;
                System.out.println("Result : " + x);
            }

            catch (ArithmeticException e)
            {
                System.out.println("Error due to --> "+e);
            }
        System.out.println("The end of program.");

        }
    }


