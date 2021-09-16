import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		ChemicalElement e1 = new ChemicalElement(1, "Hydrogen", "H", 1.008);
		ChemicalElement e2 = new ChemicalElement(12, "Magnesium", "Mg", 24.0);
		ChemicalElement e3 = new ChemicalElement(8, "Oxygen", "O", 15.999);
		ChemicalElement e4 = new ChemicalElement(14, "Silicon", "Si", 28.085);
		ChemicalElement e5 = new ChemicalElement(3, "Lithium", "Li", 6.94);
		
		System.out.println("Chemical elements...");
		
		TreeSet<ChemicalElement> periodicTable = new TreeSet<ChemicalElement>();
		System.out.println("periodic table ready...");
		System.out.println("Adding first element...");
		
		periodicTable.add(e1);
		periodicTable.add(e2);
		periodicTable.add(e3);
		periodicTable.add(e4);
		periodicTable.add(e5);
		
		for(Iterator<ChemicalElement> citr = periodicTable.iterator(); citr.hasNext();)
		{
			System.out.println("- "+citr.next());
		}
	}

}

class ChemicalElement implements Comparable<ChemicalElement>{
	private int atomicNumber;
	private String atomicName;
	private String atomicFormula;
	private double atomicWeight;
	public ChemicalElement(int atomicNumber, String atomicName, String atomicFormula, double atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomicFormula = atomicFormula;
		this.atomicWeight = atomicWeight;
	}
	
	@Override
	public int compareTo(ChemicalElement o) {
		System.out.println("Comparing Element "+atomicNumber+ " with Element "+o.atomicNumber);
		return Integer.compare(atomicNumber, o.atomicNumber);
	}
	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicFormula="
				+ atomicFormula + ", atomicWeight=" + atomicWeight + "]";
	}
	public int getAtomicNumber() {
		return atomicNumber;
	}
	public void setAtomicNumber(int atomicNumber) {
		this.atomicNumber = atomicNumber;
	}
	public String getAtomicName() {
		return atomicName;
	}
	public void setAtomicName(String atomicName) {
		this.atomicName = atomicName;
	}
	public String getAtomicFormula() {
		return atomicFormula;
	}
	public void setAtomicFormula(String atomicFormula) {
		this.atomicFormula = atomicFormula;
	}
	public double getAtomicWeight() {
		return atomicWeight;
	}
	public void setAtomicWeight(double atomicWeight) {
		this.atomicWeight = atomicWeight;
	}
	
	
	
}