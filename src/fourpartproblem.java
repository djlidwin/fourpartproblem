import java.util.Scanner;
public class fourpartproblem{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer x: ");
        int x = input.nextInt();

        for(int i = 1; i <= x; i++)
        {
            if(i%2!=0)
            {
                if(i%3==0)
                {
                    System.out.println( i+ " is the multiple of 3");
                }
            }
        }
    }
}
