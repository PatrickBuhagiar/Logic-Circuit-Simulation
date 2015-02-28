
public class TwoBitFullAdder {
	private final triple Triple;
	
	public TwoBitFullAdder(boolean A, boolean B, boolean C, boolean D){
		//TwoBitFullAdder contains two FullAdders. the First Full Adder has its CarryIn as false
		FullAdder x = new FullAdder(A,B,false);
		FullAdder y = new FullAdder(C,D, x.getFullAdder().getCarry());
		Triple = new triple(x.getFullAdder().getSum(),y.getFullAdder().getSum(), y.getFullAdder().getCarry());
	}
	
	//Getter for Triple
	public triple getTwoBitFullAdder(){
		return Triple;
	}
}
