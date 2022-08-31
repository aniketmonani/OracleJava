import java.util.Scanner;
class Fourth {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Name, Age, 10th Percentage");
        String name= sc.nextLine();
        int age= sc.nextInt();
        float per=sc.nextFloat();
        double salary= (age*100)/per;
        System.out.println("NAme "+name);
        System.out.println("Your Expected Salary should be :"+salary);
    }
    
}