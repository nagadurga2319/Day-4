import java.lang.reflect.Array;
import java.util.Scanner;

public class Main1 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of overs");
		int n = s.nextInt();
        int a[] = new int[n+1];
		System.out.println("Enter the number of runs for each over");
		for(int i = 1; i < n+1; i++)
        {
            a[i] = s.nextInt();
            
        }
		System.out.println("Enter the over number ");
		int ov=s.nextInt();
		try { 
            // invalid index 
            int x = (int)Array.get(a, ov); 
            System.out.println(x); 
        } 
        catch (Exception e) { 
            // throws Exception 
            System.out.println("Exception : " + e); 
        } 
	}
}


