import java.lang.reflect.Array;
import java.util.Scanner;

class CustomException extends Exception{  
	CustomException(String s){  
	  super(s);  
	 }  
}  
public class Main2
{
	
	
	static boolean validate(int age){  
		try {
	     if(age<19)  
	     
	      throw new CustomException("CustomException: InvalidAgeRangeException");  
	     
	     
	   }  
		catch(Exception e)
		{
			System.out.println("CustomException: InvalidAgeRangeException ");
			return false;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the player name");
		String name = s.nextLine();
       
		System.out.println("Enter the player age");
		int age=s.nextInt();
		
		
		 if(validate(age))  
		 {
		      System.out.println("Player Name:"+name);
		      System.out.println("Player age:"+age);
		      
		   }
		        
	}
}


