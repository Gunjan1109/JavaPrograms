import java.util.Scanner;
class Index{
	 static int check(int[] a, int n){
			for(int i = 0; i<a.length; i++)
		
			if(n == a[i])
			{
				return i;
				
			}

			return -1;
		} 

	public static void main(String[] args) {
		 
		int a[] = new int[10];
		int n=0,s,i;
	   Scanner input = new Scanner(System.in);
		System.out.println("Enter the array\n");
		for(i = 0; i<a.length; ++i)
		{
			a[i] = input.nextInt();
		}

		System.out.println("Enter an element to find its index\n");
        
        n = input.nextInt();

       s =  check(a,n);
       System.out.println(s);
    }
}


		
		    
		    