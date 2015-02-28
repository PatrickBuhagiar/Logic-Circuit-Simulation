//Triple is needed in order to be able to return 3 items (S1, S2 and C1) at the same time 
public class triple {
	private final boolean x;
	private final boolean y;
	private final boolean z;
	
	//Constructor for triple
	public triple(boolean x, boolean y, boolean z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//Getter for sum 1
	public boolean getSum1() {
		return x;
	}
	
	//Getter for sum 2
	public boolean getSum2() {
		return y;
	}
	
	//Getter for Carry
	public boolean getCarry() {
		return z;
	}
}
