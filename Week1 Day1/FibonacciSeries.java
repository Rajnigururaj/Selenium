package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		int series = 10;
		System.out.println("");
		System.out.print(a + " "+ b+ " ");
		
		for(int i = 2; i <series; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(c+" ");
			
		}
	}

}
