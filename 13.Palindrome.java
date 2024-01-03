import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		str=str.toLowerCase();
		int flag=0;
		int len=str.length();
		for(int i=0;i<len;i++)
		{
		    if(str.charAt(i)==str.charAt(len-i-1))
		    {
		        flag=1;
		    }
		    else
		    {
		        flag=0;
		        break;
		    }
		}
		if(flag==1)
		{
		    System.out.print("Yes, It is Palindrome");
		}
		else
		{
		    System.out.print("No, It is not Palindrome");
		}
	}
}
