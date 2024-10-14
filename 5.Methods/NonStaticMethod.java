class StaticMethods{
	public  void m1(){
		System.out.println("Hello This is NON - Static Methods");
	}
	public static void main(String[] args) {
		StaticMethods sm = new StaticMethods();
		sm.m1();
	}
}