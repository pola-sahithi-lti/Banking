import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		PhoneLog log1 = new PhoneLog("dialed", LocalDate.of(2021, 03, 11), "Max");
		PhoneLog log2 = new PhoneLog("dialed", LocalDate.of(2021, 03, 14), "Julie");
		PhoneLog log3 = new PhoneLog("missed", LocalDate.of(2021, 03, 24), "Jack");
		PhoneLog log4 = new PhoneLog("dialed", LocalDate.of(2021, 03, 13), "Robert");
		PhoneLog log5 = new PhoneLog("received", LocalDate.of(2021, 03, 15), "Smith");
		
		System.out.println("Logs are ready...");
		ArrayList<PhoneLog> myPhoneLog = new ArrayList<PhoneLog>();
		
		myPhoneLog.add(log1);
		myPhoneLog.add(log2);
		myPhoneLog.add(log3);
		myPhoneLog.add(log4);
		myPhoneLog.add(log5);
		System.out.println("All logs have been added...");
		
		for( PhoneLog pl : myPhoneLog) {
			System.out.println("The log is: "+pl);
		}
		
		System.out.println("================");
		
		Iterator<PhoneLog> myLogItr = myPhoneLog.iterator();
		while(myLogItr.hasNext()) {
			PhoneLog log = myLogItr.next();
			System.out.println("The log : "+log);
		}
		System.out.println("================");
		
		for (int i=0;i<myPhoneLog.size();i++) {
			System.out.println("Log: "+myPhoneLog.get(i));
		}
		System.out.println("===========");
		System.out.println();
		Collections.sort(myPhoneLog);
		for (int i=0;i<myPhoneLog.size();i++) {
			System.out.println("Log: "+myPhoneLog.get(i));
		}
		
	}

	
}

class PhoneLog implements Comparable<PhoneLog>{
	String logType;
	LocalDate logTime;
	String name;
	public PhoneLog(String logType, LocalDate logTime, String name) {
		super();
		this.logType = logType;
		this.logTime = logTime;
		this.name = name;
	}
	@Override
	public String toString() {
		return "PhoneLog [logType=" + logType + ", logTime=" + logTime + ", name=" + name + "]";
	}
	@Override
	public int compareTo(PhoneLog o) {
		System.out.println("Comparing "+name+" with "+o.name);
		return name.compareTo(o.name);
	}
	
	
}