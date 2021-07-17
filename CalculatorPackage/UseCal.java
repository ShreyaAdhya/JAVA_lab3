import calc.Add;
import calc.Mul;
import calc.Avg;

import java.util.Scanner;

class UseCal
{
   public static void main(String[] args)
    {
		
	 Scanner sc = new Scanner(System.in);	
	 System.out.println(" *Welcome to calculator*\n");
	 System.out.println(" Select the operation you want to perform ;\n Addition : 1\t      Subtraction : 2\n Multiplication : 3\tDivision : 4\n Average : 5");
	 System.out.print("\nEnter your option : ");	 
	 int op = sc.nextInt();
	 
	 if(op>5 || op<1)
	 {
		 System.out.print("\nEnter valid option : ");	 
	     op = sc.nextInt();
	 }	 
		 
	 System.out.print(" Enter your 1st value : ");
	 int x = sc.nextInt();
	 System.out.print(" Enter your 2nd value : ");
	 int y = sc.nextInt();
	 System.out.print("\nResult : ");
	 
	 switch(op)
        {
            case 1 :
                Add a = new Add();
                a.add(x,y);
                break;
            case 2 :    
                Mul m = new Mul();
                m.mul(x,y);
                break;
            case 3 :
                calc.Sub b = new calc.Sub();
                b.subtract(x,y);
                break;
            case 4 :
                calc.Div d = new calc.Div();
                d.divide(x,y);
                break;
			case 5 :
                Avg g = new Avg();
                g.avg(x,y);
                break;				
        }		
    }
}
