class Student
{
	Student(String Name)
	{
		System.out.println("Student name is:"+ Name);
	}
	int RollNo;
		public static void main(String[] args) {
			Student a1 = new Student("Manan");
			Student a2 = new Student("Lokesh");
			Student a3 = new Student("Gaurav");
			Student a4 = new Student("Sameer");
			Student a5 = new Student("Namah");
			a1.RollNo=101;
			a2.RollNo=102;
			a3.RollNo=103;
			a4.RollNo=104;
			a5.RollNo=105;
			System.out.print(a1.RollNo+"  "+a2.RollNo+"  "+a3.RollNo+"  "+a4.RollNo+"  "+a5.RollNo+"  ");
		}
}