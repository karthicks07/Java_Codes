import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the float value - ");
		float f = s.nextFloat();
		System.out.print("Enter the precision - ");
		int prec = s.nextInt();
		System.out.format("%."+prec+"f",f);
	}
}
