package term1;

public class C1_3Q2 {

	public static void main(String[] args) {
		//Series 1
		int series1Total = 0;
		for(int i=1; i<=15; i++) {
			series1Total += ((long)10*i/(i+1));
		};
		System.out.println(series1Total/10);
		
		//Series 2
		int series2Total = 0;
		for(int i=1; i<=15; i++) {
			series2Total += ((long)(10*i)^2/(i+1)^2 );
		};
		System.out.println(series2Total/100);
	}

}
