//To calculate the sum of the series 1+x+x2 /2!+x3/3!+……
import java.util.Scanner;
class Sum
{
	public static void main(String[] args) {

		int ans=1;
		int x,n,i,j,sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of x and no of terms");
		x = input.nextInt();
		n = input.nextInt();
		for(i = 1, j =1; i<n+1; ++i,j++)
		{
			ans*= j;
		
 		   sum = sum + ((i-1)*x)/ans;
 		   if(j==1)
 		   	--j;
		}
		int s = sum+1;
		System.out.println("Sum is " + s);

	}
}

