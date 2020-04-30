package weinsteinDesk;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		System.out.print(1 + " ");
		for(int i = 0; i < 15; i++)
		{
			int c = a + b;
			a = b;
			b = c;
			System.out.print(a + " ");
		}
	}

}
