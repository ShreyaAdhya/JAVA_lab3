import java.util.Scanner;

public class Box
{
    double height;
    double length;
    double breadth;

    public void setDefault(double breadth, double length, double height)
    {
        breadth = 0;
        length = 0;
        height = 0;
    }

    public void getValue(double b, double l, double h)
    {
        breadth = b;
        length = l;
        height = h;
    }

    public void volume(double breadth, double length, double height)
    {
        System.out.println("The volume is : "+ (length*breadth*height)+" cubic units");
    }

    public static void main(String[] args) {
        {
            Box ob = new Box();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter length : ");
            int l = sc.nextInt();
            System.out.print("Enter breadth : ");
            int b = sc.nextInt();
            System.out.print("Enter height : ");
            int h = sc.nextInt();

            ob.setDefault(l,b,h);
            ob.getValue(l,b,h);
            ob.volume(l,b,h);
        }
    }
}
