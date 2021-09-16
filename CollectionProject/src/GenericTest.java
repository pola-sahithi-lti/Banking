
public class GenericTest {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		printInteger(x, y);
		swapInteger(x, y);
		decorateInteger(x, y);
		
		int p = 80;
		int q = 90;
		
		printInteger(p, q);
		swapInteger(p, q);
		decorateInteger(p, q);
	}
	
	public static void printInteger(int a, int b) {
		System.out.println("x : "+a);
		System.out.println("y : "+b);
	}
	
	public static void decorateInteger(int a, int b) {
		System.out.println("[x : "+a+" ]");
		System.out.println("[y : "+b+" ]");
	}
	
	public static void swapInteger(int a,int b) {
		
		int temp;
		temp = a;
		a = b;
		b = temp;
		
	}
}


