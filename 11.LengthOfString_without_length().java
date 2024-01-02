import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Enter the String - ");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int len = 0;
		for(char c: str.toCharArray()) 
		{
            len++;
        }
		System.out.printf("Length of the string - %d",len);
	}
}
