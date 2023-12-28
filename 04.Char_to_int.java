import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Press 0 to convert Char to Int or Press 1 to convert Int to Char - ");
		Scanner s = new Scanner(System.in);
		int ch = s.nextInt();
		if(ch == 0)
		{
		    System.out.print("Enter the Char - ");
		    char c = s.next().charAt(0);
		    int n = (int)(c);
		    System.out.printf("Int - %d",n);
		}
		else if(ch == 1)
		{
		    System.out.print("Enter the Int - ");
		    int n = s.nextInt();
		    char c = (char)(n);
		    System.out.printf("Char - %c",c);
		}
		else
		{
		    System.out.println("Enter Valid Choice!");
		}
	}
}
