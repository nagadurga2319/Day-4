import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList; 

class CustomException extends Exception{  
	CustomException(String s){  
	  super(s);  
	 }  
	}  
public class Main3
{
	
	public static void main(String[] args) 
	{
		ArrayList<String> arr = new ArrayList<String>(8); 
		arr.add("Chennai Super Kings"); 
        arr.add("Deccan Chargers"); 
        arr.add("Delhi Daredevils"); 
        arr.add("Kings XI Punjab");
        arr.add("Kolkata Knight Riders");
        arr.add("Mumbai Indians");
        arr.add("Rajasthan Royals");
        arr.add("Royal Challengers Bangalore");
        
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the expected winner team of IPL Season 4");
		String win = s.nextLine();
		
	
		boolean w=arr.contains(win); 
		
		 try { 
			if(w)
			{
					System.out.println("Enter the expected runner Team of IPL Season 4");
					String run = s.nextLine();
					boolean r= arr.contains(run); 
				if(r)
				{
						System.out.println("Expected IPL Season 4 winner: "+win);
					 
					
						System.out.println("Expected IPL Season 4 runner: "+run);
				}
				else
					throw new CustomException("TeamNameNotFoundException: Entered team is not a part of IPL Season 4");  
					
			}
			else
			{
					throw new CustomException("TeamNameNotFoundException: Entered team is not a part of IPL Season 4");  
				     
			}
				
		 }
		 catch(Exception e)
		 {
		    	  System.out.println("TeamNameNotFoundException: Entered team is not a part of IPL Season 4 ");
		 }          
	}
}


