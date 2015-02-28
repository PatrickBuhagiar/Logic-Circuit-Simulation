
public class Main {
	public static void main(String[] args){
		System.out.println("A1 A2 B1 B2 || S1 S2 C1");
		System.out.println("----------------------");
		printAdder();
	}
	
	//method that prints all combinations of inputs and results
	static void printAdder(){
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int i = 0;
		Boolean D = false;
		Boolean A = false;
		Boolean B = false;
		Boolean C = false;
		for (i=0; i<16; i++){
			A = a==8? !A:A;
			B = b==4? !B:B;
			C = c==2? !C:C;
			D = d==1? !D:D;	
			
			//Create instance of TwoBitFullAdder
			TwoBitFullAdder x = new TwoBitFullAdder(A, B, C, D);
			//system that is needed to generate the different combinations of inputs using counters.
			a = a==8? a=0:a+1;
			b = b==4? b=1:b+1;
			c = c==2? c=1:c+1;
			d = d==1? d=1:d+1;
			System.out.println((A==true?1:0) + "  " + (B==true?1:0) + "  " + (C==true?1:0) + "  " + (D==true?1:0) + "  || " + (x.getTwoBitFullAdder().getSum1()==true?1:0) + "  " + (x.getTwoBitFullAdder().getSum2()==true?1:0) + "  " + (x.getTwoBitFullAdder().getCarry()==true?1:0));
		}
	}
}
