import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the array size - ");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.print("Enter the array elements - ");
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		int a1[]=new int[n-1];
		System.out.print("Enter the data to be deleted - ");
		int d=s.nextInt();
		int j=0;
		for(int i=0;i<n;i++)
		{
		    if(a[i]==d)
		    {
		        continue;
		    }
		    else
		    {
		        a1[j]=a[i];
		        j++;
		    }
		}
		System.out.print("Array after deletion - "+Arrays.toString(a1));
	}
}
