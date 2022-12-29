import java.util.Scanner;

public class Factorial_using_Recursion {
    static int  factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);//recursion
        
    }

    static int  add_natural(int n){
        if(n==0)
            return 0;
        return n+add_natural(n-1);
        
    }
    public static void main(String[] args) {

       
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n=sc.nextInt();
        System.out.println("factoril is using recursion  :"+factorial(n));
        System.out.println("natural number addtion  is using recursion  :"+add_natural(3));
        int ans=1;
        for(int i=1;i<=n;i++)
        {
            ans=ans*i;
            if(i==n){
                System.out.println("factorial is "+ans);
                break;
            }
        }


    }
}
