import java.util.Scanner;
class Tenth
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("While loop");
        System.out.println("Enter a possitive integer");
        int a=sc.nextInt();
        while(a!=0)
        {
            System.out.println("Work hard");
            a--;
        }
        System.out.println("Do while loop");
        do
        {
            System.out.println("Be happy");
            a++;
        }while(a!=10);
    }
}