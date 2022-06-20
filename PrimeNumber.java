//This version of code was created by Shweta-Navalkar (github.com)
import java.util.*;
public class PrimeNumber{
public static void main(String args[]){

	System.out.println("Enter anything except number to EXIT.");
	//a:
	for(;;){

		int n,i,rem=0;

		Scanner sc = new Scanner(System.in);
		String m = sc.nextLine();
		//n = sc.nextInt();

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
			//continue a;
		}

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