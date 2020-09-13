package week1.day1;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;
		System.out.println("The odd numbers until "+num+ " are:");
		for (int i = 0; i < num; i++) {
			if(i%2!=0)
				System.out.print(i + " ");
		}

	}

}
