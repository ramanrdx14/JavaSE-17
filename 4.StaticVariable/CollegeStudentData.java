class CollegeStudentData{
	int id;
	static String CollegeName = "ABC College";
	static String PrincipleName = "XYZ";
	static int EstdYr=1998;
	int StdId;
	String Name;
	long Mob;
	String Gender;
	double Marks;
	public static void main(String[] args) {
		CollegeStudentData student1 = new CollegeStudentData();
		CollegeStudentData student2 = new CollegeStudentData();
		System.out.println(CollegeStudentData.CollegeName);
		System.out.println(CollegeStudentData.PrincipleName);
		System.out.println(CollegeStudentData.CollegeName);
		System.out.println(CollegeStudentData.PrincipleName);


	}	
}

/*

In this we can see the college name,priniple name,estd year is same so we can use 
static variable because common property is shared with all.



*/