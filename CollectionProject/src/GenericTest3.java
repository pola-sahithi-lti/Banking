import java.util.ArrayList;

class MyInteger //no need to make this class, already java.lang.Integer wrapper is present 
{
	private int value;
	
	MyInteger(int x) {
		value = x;
	}
	int valueOf() {
		return value;
	}
	int preIncrement() {
		return ++value; 
	}
	int postIncrement() {
		return value++;
	}
}
public class GenericTest3 {

	public static void main(String[] args) {
		int num=100; //primitive;
		
		System.out.println("1num : "+num);
		num++;
		System.out.println("2num : "+num);
		++num;
		System.out.println("3num : "+num);
		System.out.println("4num : "+num++);
		System.out.println("5num : "+num);
		
		MyInteger mi = new MyInteger(200); // your primitive inside a cage 
		System.out.println(mi.valueOf());
		mi.preIncrement();
		System.out.println(mi.valueOf());
		mi.postIncrement();
		System.out.println(mi.valueOf());
		
		ArrayList<Integer> myNumberList = new ArrayList<Integer>();
	}

}
