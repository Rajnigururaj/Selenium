package week1.day1;

public class Factorial {


	public int fact_fun(int num) {
		int fact = 1;
		for (int i = num; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

	public int fact_recursive(int num) {
		if(num == 1)
			return 1;
		else
			return num * fact_recursive(num-1);

	}

	public static void main(String[] args) {
		int inp = 5;

		int out = 1;

		for(int i = inp; i>=1; i--) {
			out = out * i;
		}
		System.out.println("The factorial of "+inp+ " is "+out);

		Factorial f = new Factorial();
		System.out.println("Factorial of 10 is "+f.fact_fun(10));

		System.out.println("Factorial of 10 is "+f.fact_recursive(10));

	}

}
