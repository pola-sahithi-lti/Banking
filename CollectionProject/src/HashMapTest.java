import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Book1> map =new HashMap<Integer,Book1>();
		Book1 b1=new Book1(101,"wings of fire","kalam","zz",8);
		Book1 b2=new Book1(102,"subtle art","mark","yyz",2);
		Book1 b3=new Book1(103,"why","jan","x",2);
	
		map.put(1,b1);
		map.put(2,b2);
		map.put(3,b3);
		for(Map.Entry<Integer,Book1> entry: map.entrySet()){
		
		
			int isbn=entry.getKey();
			Book1 b=entry.getValue();
			System.out.println("isbn no:"+isbn);
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher);
			
		}


	}

}

class Book1{
	int id;
	String name,author,publisher;
	int quantity;
	public Book1(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
	
}
