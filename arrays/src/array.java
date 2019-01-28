/*1.Write a program that reads a 2-D integer array with each element of maximum 2 digits and prints the following:
a)	Elements of the entered array. 
b)	Elements of the array after each element is multiplied by 2 if it is an odd number. 
Definition of Done:
a)	The program should generate an error message if the number of digits in the array is more than two and ask the user to re-enter the number.
b)	The program should use continue statement for ignoring even elements.
c)	The array elements should be displayed in tabular form with width set to 5.*/

import java.util.*;
class array(){
	public static void main(String[] args) {
		int a[][] = new int[10][5];
		int i,j,s;
		Scanner input = new input(System.in);
		System.out.println("Enter only two digit elements");
		for(i = 0; i<5; ++i)
		{
			for(j = 0; j<5; j++)
			{
				a[i][j] = input.nextInt();
				
			}
		}
	}
}
