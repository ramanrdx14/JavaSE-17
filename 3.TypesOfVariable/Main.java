/*
	// variable are classified into 3types :

	1. Static variable/Class variable
	2. Non Static variable /Instance variable
	3. Local Variable

*/

class Main{
	static int a = 10; //static variable
	int b        = 20; //instance variable
	public static void main(String[] args) {
		int c    = 30; //Local variable

		Main m = new Main();
		System.out.println(a);
		System.out.println(m.b); // we cant acess instance variable directly 
		System.out.println(c);
	}
}