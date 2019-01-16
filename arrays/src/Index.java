import java.util.Scanner;
class Index{
	public static void main(String[] args) {
		int a[] = new int [10];
		int i,n=0,flag = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array\n");
		for(i = 0; i<10; ++i)
		{
			a[i] = input.nextInt();
		}

		System.out.println("Enter an element to find its index\n");
        
        n = input.nextInt();
		for(i = 0; i<10; i++)
		
			if(n == a[i])
			{
				System.out.println(i);
				flag = 1;
				break;
			}

			if(flag == 0)
			
			    System.out.println("Element is not present in array"); 
			     
			
		
	}
}