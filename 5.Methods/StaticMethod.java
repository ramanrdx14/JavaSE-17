/*
	The Methods are of the 2types static and non static methods.

	1. Method with static keyword.
	2. Method with no-static keyword.
	3. We can directly access the static methods from static methods
	4. We can directly access the non-static from non-static methods
	5. If we want to access the non-static methods from static context then we have to create Object and then we can acess it.
	6. we can access the static methods from non-static context directly.
	7. Note: All these rules are applied for variables also.

*/

class StaticMethods{
	public static void m1(){
		System.out.println("Hello This is Static Methods");
	}
	public static void main(String[] args) {
		StaticMethods.m1();
	}
}