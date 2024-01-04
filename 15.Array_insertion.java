import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the array size - ");
		int n=s.nextInt();
		int a[]=new int[n];
		int a1[]=new int[n+1];
		System.out.print("Enter the array elements - ");
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		int j=0;
		System.out.print("Enter the data you want to insert - ");
		int d=s.nextInt();
		System.out.print("Enter the position you want to insert - ");
		int p=s.nextInt();
		for(int i=0;i<n+1;i++)
		{
		    if(i==p)
		    {
		        a1[i]=d;
		    }
		    else
		    {
		        a1[i]=a[j];
		        j++;
		    }
		}
		System.out.printf("Array after inserting %d at position %d- "+Arrays.toString(a1),d,p);
	}
}
