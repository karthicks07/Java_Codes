import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Enter the space size before the output - ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		float num = 1.2358f;
		System.out.format("%"+n+".3f",num);
	}
}
