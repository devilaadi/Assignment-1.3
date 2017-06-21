
import java.util.Scanner;

public class Assignment1_3 {

	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
	
		System.out.println("SWAPPING TWO INTEGERS WITHOUT USING THIRD VARIABLE");
		
//take input from user //
		System.out.println("Enter First Number");
		int n1 = sc.nextInt();
		
		System.out.println("Enter Second Number");

		int n2 = sc.nextInt();
		
		System.out.println("Numbers before swapping n1:"+n1+" n2:"+n2);
//Logic		
		n1= n1+n2;
		n2 = n1-n2 ;
		n1 = n1-n2;
		
//Numbers After Swapping//
		
		System.out.println("Number After Swapping n1:"+n1);
		System.out.println("Number After Swapping n2:"+n2);

		
	}

}
