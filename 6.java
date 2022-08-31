import java.util.Scanner;
class Sixth
{
public static void main(String arg[])
{
    Scanner sc = new Scanner(System.in);
    int sum=0, total=0, per=0;
    int a[] = new int[5]; //Array creation
    System.out.println("Please enter marks of 5 subjects");
    for(int i=0; i<5; i++)
    {
        a[i] = sc.nextInt();
    }
    System.out.print("The sum of your marks is: ");
    for(int j:a)
    {
        sum = sum+j;
    }
    System.out.println(sum);
    System.out.println("Please enter the Max total marks: ");
    total = sc.nextInt();
    System.out.print("Your calculated percentage is:");
    per=(sum*100)/total;
    System.out.print(per);
    }
}