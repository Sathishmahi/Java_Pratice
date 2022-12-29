import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int num1=sc.nextInt();
        System.out.print("enter a number :");
        int num2=sc.nextInt();

        System.out.print("enter a opearator + - * / : ");
        char ope=sc.next().charAt(0);
        switch(ope){
            case '+' :
                System.out.println("ans is "+num1+" "+num2+" = "+(num1+num2));
                break;
            case '-':
                System.out.println("ans is "+num1+" "+num2+" = "+(num1-num2));
                break;

            case '*':
                System.out.println("ans is "+num1+" "+num2+" = "+(num1*num2));

                break;
            case '/':
                System.out.println("ans is "+num1+" "+num2+" = "+(num1/num2));
                break;
            default:
                System.out.println("not match");


            
        }


    }
    
}
