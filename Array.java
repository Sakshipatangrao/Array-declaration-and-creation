import java.util.*;
class Array
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int []a = new int[5];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();

		}
	    for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");  
		}
	}
}