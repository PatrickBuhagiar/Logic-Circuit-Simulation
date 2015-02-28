//Tuple is needed in order to be able to return 2 items (S1 and C1) at the same time
public class tuple{
	private final boolean x;
	private final boolean y;
	
	public tuple(boolean x, boolean y){
		this.x= x;
		this.y= y;
	}
	
	public boolean getSum() {
		return x;
	}
	
	public boolean getCarry() {
		return y;
	}
}
