import java.util.Scanner;

public class Square   //Base class
{
    int a;           //members of base class
    String name;

    public void volume(int a)    //function of base class
    {
        System.out.println("Area = "+a*a+" square units");
    }

    public void name()           //function of base class
    {
        System.out.println("I am a square");
    }

    public void end()            //function of base class
    {
        System.out.println("------------------------------------\n");
    }
}

class Cube extends Square     //derived class Cube from base class Square using keyword 'extends'
{
    public void volume(int a)       //overriding the method inherited from base class
    {
        System.out.println("Volume = "+a*a*a+" cubic units");
    }

    public void name()             //overriding the method inherited from base class
    {
        System.out.println("I am a cube");
    }
}

class Main
{

    public static void main(String[] args)
    {
        Square s = new Square();        //object of base class
        s.name();
        System.out.println("Enter the value of side : ");
        Scanner sc = new Scanner(System.in);
        int ar = sc.nextInt();
        s.volume(ar);
        s.end();

        System.out.println("Enter the value of side : ");
        Cube c = new Cube();             //object of derived class
        int cu = sc.nextInt();
        c.name();                        //can access all the functions of base class
        c.volume(cu);
        c.end();

        Square cs = new Cube();           // run-time polymorphism
        cs.name();                        //can access all the members and functions of base class
        cs.volume(ar);                    // but will compute the the volume from the value inputted to base class
        cs.end();
    }
}
