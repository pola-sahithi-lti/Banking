import com.mysongs.*;

public class GenericTest2 {

	public static void main(String[] args) {
		
		MyInteger1 m = new MyInteger1(10, 20);
		
		m.printInteger();
		m.swapInteger();
		m.decorateInteger();
		
		MyInteger1 m1 = new MyInteger1(80, 90);
		
		m1.printInteger();
		m1.swapInteger();
		m1.decorateInteger();
		
System.out.println("-------------------");
		
		MyDouble md1 = new MyDouble(80.5, 90.5); //instance's data 
		md1.printDouble();	md1.swapDouble(); md1.decorateDouble();
		
		System.out.println("-------------------");
		
		MyString ms1 = new MyString("Julia","Robert");
		ms1.printString(); ms1.swapString(); ms1.decorateString();
		System.out.println("-------------------");
		
		Song s1 = new Song("My Heart Will Go On","Celine D","Titanic",1994);
		Song s2 = new Song("I want it that way","Backstreet Boys","Millenium",1998);
		
		MySong jukeBox = new MySong(s1,s2);
		jukeBox.printSong();
		jukeBox.swapSong();
		jukeBox.decorateSong();
	}	
	
	
}

class MyInteger1{
	private int x;
	private int y;
	
	public MyInteger1(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void printInteger() {
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
	
	public void decorateInteger() {
		System.out.println("[x : "+x+" ]");
		System.out.println("[y : "+y+" ]");
	}
	
	public void swapInteger() {
		
		int temp;
		temp = x;
		x = y;
		y = temp;
		
	}
}

class MyDouble { //is a container to hold 2 integers
	
	private	double x;	//content
	private double y;	//conent
	
	public MyDouble(double x, double y) { //initialize the container
			super();
			this.x = x;
			this.y = y;
	}
	public void printDouble() { //printing it - algorithm
		System.out.println("x : "+x); //sop - iterator
		System.out.println("y : "+y); //sop - iterator
	}
	public void decorateDouble() { //decoare it - algorithm
		System.out.println("[x : "+x+"]");
		System.out.println("[y : "+y+"]");
	}
	public void swapDouble() { //swap it - algorithm
		System.out.println("swapping...");
		double temp=x;		x=y;		y=temp;
		System.out.println("swapped...");
	}
}

class MyString { //is a container to hold 2 integers
	
	private	String x;	//content
	private String y;	//conent
	
	public MyString(String x, String y) { //initialize the container
			super();
			this.x = x;
			this.y = y;
	}
	public void printString() { //printing it - algorithm
		System.out.println("x : "+x); //sop - iterator
		System.out.println("y : "+y); //sop - iterator
	}
	public void decorateString() { //decoare it - algorithm
		System.out.println("[x : "+x+"]");
		System.out.println("[y : "+y+"]");
	}
	public void swapString() { //swap it - algorithm
		System.out.println("swapping...");
		String temp=x;		x=y;		y=temp;
		System.out.println("swapped...");
	}
}

class MySong { //is a container to hold 2 songs
	
	private	Song x;	//content
	private Song y;	//conent
	
	public MySong(Song x, Song y) { //initialize the container
			super();
			this.x = x;
			this.y = y;
	}
	public void printSong() { //printing it - algorithm
		System.out.println("x : "+x); //sop - iterator
		System.out.println("y : "+y); //sop - iterator
	}
	public void decorateSong() { //decoare it - algorithm
		System.out.println("[x : "+x+"]");
		System.out.println("[y : "+y+"]");
	}
	public void swapSong() { //swap it - algorithm
		System.out.println("swapping...");
		Song temp=x;		x=y;		y=temp;
		System.out.println("swapped...");
	}
}