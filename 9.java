import java.util.Scanner;
class Ninth
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age=sc.nextInt();
    switch(age)
    {
        case 10: System.out.println("School Time.....");
        break;
        case 18: System.out.println("College Time....");
        break;
        case 25: System.out.println("Job Time....");
        break;
        default: System.out.println("Enjoy the Time.....");
    }
    }
}