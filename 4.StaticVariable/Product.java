public class Product{
	  static String Name = "XYZ";
	  static int CompanyEmployeeCount = 100;
	  static String CEO = "ABC";
	  String ProductSNO;
	  double ProductPrice;
	  String ProdDate;

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
	}
}


/*

1. We can access the static variable from anywhere 

2. We can access the non-static varaible from non-static methods but we cant access from static method.
   If we want to access the non-static varaibles from static methods then we have to create Instance of class and use '.'' operator
   to access the non-static variables.(Instance Reference) 

*/