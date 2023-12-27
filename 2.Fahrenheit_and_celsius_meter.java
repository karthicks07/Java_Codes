import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Fahrenheit to Celsius - Press 0,");
		System.out.print("Celsius to Fahrenheit - Press 1 - ");
		Scanner s = new Scanner(System.in);
		int ch = s.nextInt();
		if(ch == 0)
		{
		    System.out.print("Enter Fahrenheit value - ");
		    float farh = s.nextFloat();
		    int cel = (((int)farh - 32)*5)/9;
		    System.out.printf("Celsius - %d",cel);
		}
		else if(ch == 1)
		{
		    System.out.print("Enter Celsius value - ");
		    int cel = s.nextInt();
		    float fahr = ((9/5)*cel) + 32;
		    System.out.printf("Fahrenheit - %.2f",fahr);
		}
		else
		{
		    System.out.println("Enter Valid Choice!");
		}
	}
}
