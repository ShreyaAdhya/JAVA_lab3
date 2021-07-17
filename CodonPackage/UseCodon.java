import codon.FindCodon;
import java.util.Scanner;

class UseCodon
{
   public static void main(String[] args)
    {
	   FindCodon c = new FindCodon();
	   System.out.println("Enter amino acid : ");
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
	   c.find(s);
	}
}	