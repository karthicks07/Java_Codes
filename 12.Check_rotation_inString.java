import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		System.out.print("Enter actual string - ");
		String str1 = s.next();
		System.out.print("Enter rotated string - ");
		String str2 = s.next();
		String str3 = str1+str1;
		if(str3.contains(str2))
		{
		    System.out.println("String Rotation is Correct");
		}
		else
		{
		    System.out.println("String Rotation is Wrong");
		}
	}
}
