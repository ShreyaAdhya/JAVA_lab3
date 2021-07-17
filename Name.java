import java.util.Scanner;

public class Name
{
    public void naming()
    {
        System.out.println("Enter name : ");
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        System.out.println("You entered the name :"+n1);
    }
    public static void main(String[] args) {
        Name ob1 = new Name();
        Name ob2 = new Name();
        Name ob3 = new Name();

        System.out.println("Enter name : ");
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();

        ob1.naming();
        ob2.naming();
        ob3.naming();

    }
}
