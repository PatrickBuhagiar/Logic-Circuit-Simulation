
public class FullAdder {
	private final tuple Tuple;
	
	public FullAdder(boolean A, boolean B, boolean C){
		//Full Adder consists of two HalfAdders and an OR Gate
		HalfAdder x = new HalfAdder(A,B);
		HalfAdder y = new HalfAdder(x.getHalfAdder().getSum(),C);
		OR z = new OR();
		Tuple = new tuple(y.getHalfAdder().getSum(), z.logicOP(x.getHalfAdder().getCarry(), y.getHalfAdder().getCarry()));
	}
	
	//getter for Tuple
	public tuple getFullAdder() {
		return Tuple;
	}
}
