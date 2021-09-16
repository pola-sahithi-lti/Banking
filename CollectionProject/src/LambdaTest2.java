import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

interface Clickable {
	void click();
}

interface Movable {
	String move(String from,String where);
}

class SavingsAccount{
	private int num;
	private String name;
	private 	double balance;
	public SavingsAccount(int num, String name, double balance) {
		super();
		this.num = num;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "SavingsAccount [num=" + num + ", name=" + name + ", balance=" + balance + "]";
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

interface MyConsumer {
	void accept(Object obj);
}

interface PrintAll{
	static void forEveryMember(MyConsumer consumer) {
		System.out.println("Consumer: "+consumer);
	}
}


public class LambdaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<SavingsAccount> accountList = new ArrayList<SavingsAccount>();
		accountList.add(new SavingsAccount(101,"jack",10000));
		accountList.add(new SavingsAccount(102,"jane",20000));
		accountList.add(new SavingsAccount(103,"julie",35000));
		
		accountList.forEach(
				(savacc) -> System.out.println(savacc)
		);
		System.out.println("==========");
		for(SavingsAccount sa : accountList) {
			if(sa.getBalance()>=20000) {
				System.out.println(sa);
			}
		}
		System.out.println("========");
		Stream<SavingsAccount> sastream = accountList.stream().filter(
				(sa)->(sa.getBalance()>=20000)
				);
		sastream.forEach(
				(sa)-> System.out.println(sa)
		);
		
		Movable m1 = (from,where) -> {
			return "Moved from "+from+" to "+where;
		};
		
		System.out.println(m1.move("India","London"));
		
		Movable m2 = (from,where) -> 
			("Moved from "+from+" to "+where);
		
		System.out.println(m2.move("London","India"));
			
		
		Clickable click1 = new Clickable() {
			
			@Override
			public void click() {
				System.out.println("Clicked..click1");
			}
		};
		click1.click();
		
		Clickable click2 = () -> {
			System.out.println("Clicked... Click2");
		};
		
		click2.click();
	}

}
