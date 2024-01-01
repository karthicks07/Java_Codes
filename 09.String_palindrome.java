import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Enter the string to chect it for palindrome - ");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String rev = "";
		for(int i=str.length()-1;i>=0;--i)
		{
		    rev+=str.charAt(i);
		}
		if(str.toLowerCase().equals(rev.toLowerCase()))
		{
		    System.out.println("Given String is Palindrome");
		}
		else
		{
		    System.out.println("Given String is not Palindrome");
		}
	}
}
