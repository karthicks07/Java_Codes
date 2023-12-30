import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the float value - ");
		float f = s.nextFloat();
		System.out.print("Enter the precision - ");
		int prec = s.nextInt();
		System.out.print("Enter the space size before the output - ");
		int n = s.nextInt();
		System.out.format("%"+n+"."+prec+"f",f);
	}
}
