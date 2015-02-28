
public class HalfAdder {
	private final tuple Tuple;
	
	public HalfAdder(boolean A, boolean B) {
		//Half adder consists of AND and XOR Gate
		AND and = new AND();
		XOR xor = new XOR();
		//The Sum is the result of the XOR gate, and the Carry of the AND gate
		Tuple = new tuple(xor.logicOP(A, B),and.logicOP(A, B));
	}
	
	//getter for Tuple
	public tuple getHalfAdder() {
		return Tuple;
	}
}
