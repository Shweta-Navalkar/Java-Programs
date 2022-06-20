//This version of code was created by Shweta-Navalkar (github.com)

/*This program takes input from the user in String format
and after converting to int it checks if the input is a "Prime number" or "not a Prime number"/"Composite".
Also it repeats until user enters anything except a number.*/

import java.util.*;
public class PrimeNumber{
public static void main(String args[]){

	System.out.println("Enter anything except number to EXIT.");
	//a: //for adding lable to continue statement (not necessary)
	for(;;){   //for an infinite loop can also use while(true){}

		int n,i,rem=0; //n is number to be checked ,i is temporary variable, rem is remainder

		Scanner sc = new Scanner(System.in);
		String m = sc.nextLine();
		//n = sc.nextInt(); //for int input (not necessary)

		try{
			n = Integer.parseInt(m);
		}
		catch(NumberFormatException e){
			System.out.println("_____End_____");
			break;
		}

		if(n==0||n==1){
			System.out.println(n+" is not Prime nor Composite.");
			continue;
			//continue a; //(not necessary)
		}
		
		/* On the following line I have written i<n/2 as a condition 
		here, n can be any number 
		and any number greater than half of n does not have n in its multiplication table
		thus n is indivisible by any number greater than half of n. 
		
		And the loop starts with i = 2 this is because we already checked n for 0 and 1 previously */
		
		for(i=2;i<=n/2;i++){
			if(n%i==0){
				rem++;
			}
		}
		if(rem!=0){
			System.out.println(n+" is not a prime number.");
		}
		else{
			System.out.println(n+" is a prime number.");
		}

	}

}
}
