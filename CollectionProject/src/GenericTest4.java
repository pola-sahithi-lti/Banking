import com.mysongs.*;
public class GenericTest4 {
	public static void main(String[] args) {
		
		MyValue<Integer> m = new MyValue<Integer>(10, 20);
		m.printMyValue(); m.swapMyValue(); m.decorateMyValue();
		System.out.println("--------------------");
		
		MyValue<Double> md = new MyValue<Double>(80.5, 9.3);
		md.printMyValue(); md.swapMyValue(); md.decorateMyValue();
		System.out.println("--------------------");
		
		MyValue<Float> mf = new MyValue<Float>(80.5f, 9.5f);
		mf.printMyValue(); mf.swapMyValue(); mf.decorateMyValue();
		System.out.println("--------------------");
		
		
		Song s3 = new Song("My Heart Will Go On","Celine D","Titanic",1994);
		Song s4 = new Song("I want it that way","Backstreet Boys","Millenium",1998);
		
		MyValue<Song> ms = new MyValue<Song>(s3,s4);
		ms.printMyValue(); ms.swapMyValue(); ms.decorateMyValue();
		System.out.println("--------------------");
		
		
	}
	
}

class MyValue<T>{
	 
	private T x;
	private T y;
	public MyValue(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void printMyValue() {
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
	
	public void decorateMyValue() {
		System.out.println("[x : "+x+" ]");
		System.out.println("[y : "+y+" ]");
	}
	
	public void swapMyValue() {
		
		T temp;
		temp = x;
		x = y;
		y = temp;
		
	}
}