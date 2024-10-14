public class CalOpr{
	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.mux(10,20));//accessing instance method
		System.out.println(Calc.sum(10,20));//acessing static method


		//CalOpr
		CalOpr co = new CalOpr();
		System.out.println(co.sub(50,10));
		System.out.println(division(20,10));

	}
	public int sub(int a,int b){
		return a-b;
	}
	public static int division(int x,int y){
		return x/y;
	}
}