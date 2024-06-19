import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the float value - ");
		float f = s.nextFloat();
		System.out.print("Enter the integer value - "); 
		int n = s.nextInt();
		int n1 = (int)f;//Typecasting
		float f1 = n; 
		System.out.printf("After converting float to integer : %d\n",n1);
		System.out.printf("After converting integer to float : %.3f",f1);
		
	}
}
