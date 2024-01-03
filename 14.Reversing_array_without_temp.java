import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Array obj=new Array();
		obj.get();
	}
}
class Array
{
    Scanner s=new Scanner(System.in);
    void get()
    {
    	System.out.printf("Enter the array size - ");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.printf("Enter the %d array elements - ",n);
        for(int i=0;i<n;i++)
		{
		    arr[i]=s.nextInt();
		}
		swap(arr,n);
    }
    void swap(int arr[],int n)
    {
        for(int i=0;i<n/2;i++)
		{
		    arr[i]=arr[i]+arr[n-i-1];
		    arr[n-i-1]=arr[i]-arr[n-i-1];
		    arr[i]=arr[i]-arr[n-i-1];
		}
		dis(arr,n);
    }
    void dis(int arr[],int n)
    {
        System.out.print("Reversed array elements - ");
        for(int i=0;i<n;i++)
        {
            System.out.printf(arr[i]+" ");
        }
    }
}
