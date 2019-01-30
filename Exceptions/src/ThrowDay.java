import java.util.*;
class ThrowDay{
	public static void main(String[] args) {
		int day=1,flag = 0;
		Scanner input = new Scanner(System.in);
		while(flag == 0)
		{
		try{
			
 			System.out.println("Enter a day");
 			day = input.nextInt();
 			if(day<0||day>31)
 			{
 				flag = 0;
 				throw new Exception("Error");
			
		    }
			else
				flag = 1;
		
	   
		
			System.out.println("Entered day is " + day);
		}
		catch(Exception e){
			//System.out.println(e.toString());
			System.out.print("\n" + e.getMessage());
		}

	}
}
}
