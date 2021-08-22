package Week1.day2;

public class Calculator {
	public void sum()
	{
	int num1=5;
	int num2=7;
	int num3=9;
	int Added_value = num1+num2+num3;
	System.out.println("Sum of the value : " + Added_value);
	}
	public void sub()
	{
		int num1=50;
		int num2=20;
		int Sub_value = num1-num2;
		System.out.println("Subtraction of the value : " + Sub_value);
	}
	public void mul()
	{
		double num1=40;
		double num2=50;
		double multiplyval = num1*num2;
		System.out.println("Multiplication of the value : " + multiplyval);
	}
	public void divide()
	{
		float num1=13.998f;
		float num2=39.044f;
		float Division_value = num1/num2;
		System.out.println("Division of the value : " + Division_value);
	}
}
