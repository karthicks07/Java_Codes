import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		int c=0;
		for(int i=0;i<s1.length();i++)
		{
		    if(s1.charAt(i) == ' ')
		    {
		        c++;
		    }
		}
		System.out.print(c+1);
	}
}
