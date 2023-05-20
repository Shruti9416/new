import java.util.Scanner;
public class Power
{
    public static void main (String args[])
    {
        int base,exponent;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base :");
        base=sc.nextInt();
        System.out.println("enter the exponent :");
        exponent=sc.nextInt();
        double power= Math.pow(base,exponent);
        System.out.println("Result :"+power);
    }
}