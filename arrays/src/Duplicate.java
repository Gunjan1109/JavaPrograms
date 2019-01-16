/*3.Use a one-dimensional array to solve the following problem: Write an application that inputs five numbers, 
each between 10 and 100, inclusive. As each number is read, display it only if it’s not a duplicate of a number already read.
 Provide for the worst case, in which all five numbers are different. 
 Display the complete set of unique values input after the user enters each new value.
  The program should not use any function other than main ( ) functions.*/
import java.util.*;
class Duplicate{
	public static void main(String[] args) {
		int a[] = new int [5], count;
		int i,flag = 0,j,k, num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 elements");
		
			for(i = 0; i<=4; i++)
		 {
		 	System.out.print("\nEnter no: "+(i+1)+ ": ");
		 	num = input.nextInt();
		 	 flag = 0;
		 	 for(j = 0; j<=i; j++)
		 	 {
		 	 	if(a[j] == num){
		 	 		flag = 1;
		 	 		break;
                 }
		 	 }
		 	 if((flag == 0)||(i == 0))
		 	 {
		 	 	a[i]=num;
		 	 	count++;
		 	 }
		 	   for( k= 0; k<=count; ++k)
		 	   System.out.print("  " + a[k]);

		}

}
}

