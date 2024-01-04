import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the array size - ");
		int n=s.nextInt();
		int a[]=new int[n];
		int a1[]=new int[n];
		System.out.print("Enter the array elements - ");
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		System.out.print("Enter the number of rotation you want to perform - ");
		int r=s.nextInt();
		int j=0;
		for(int i=n-r;i<n;i++)
		{
		    a1[j]=a[i];
		    j++;
		}
		for(int i=0;i<n-r;i++)
		{
		    a1[j]=a[i];
		    j++;
		}
		System.out.printf("Array after rotating %d times - "+Arrays.toString(a1),r);
	}
}
