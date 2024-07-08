package tryycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		
try {
	int num = sc.nextInt();
int a = num%0;
System.out.println(a);
}
catch (ArithmeticException e )// else Exception we can use 
{
System.err.println(e);
}
catch (InputMismatchException e){
	System.err.println("input must be number");
}
catch (Exception e) {
	
}

System.out.println("complete");

}}
