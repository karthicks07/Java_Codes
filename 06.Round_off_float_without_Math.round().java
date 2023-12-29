import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Enter the float value to round off - ");
		Scanner s = new Scanner(System.in);
		float f = s.nextFloat();
		System.out.format("%.0f",f);
	}
}
