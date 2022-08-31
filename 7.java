class Seventh
{
    public static void main(String arg[])
    {
        int a[][] = {{1,2,3}, {4,5,6}}; //2D Array declaraion and initialization
        System.out.println("The 2D array elements are:");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}