package taskdaily;

import java.util.Scanner;

public class MathsFunctions {

	public static class JavaProgram
	{
	    public static void main(String args[])
	  {
	    int value1, value2, add, subtract, multiply;
	    float devide;
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter Two Numbers : ");
	    value1 = scanner.nextInt();
	    value2 = scanner.nextInt();

	    add = value1 + value2;
	    subtract = value1 - value2;
	    multiply = value1 * value2;
	    devide = (float) value1/ value2;

	    System.out.println("Sum = " + add);
	    System.out.println("Difference = " + subtract);
	    System.out.println("Multiplication = " + multiply);
	    System.out.println("Division = " + devide);
	  }
	}
}
