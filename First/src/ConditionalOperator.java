import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class ConditionalOperator {

    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.print("enter a number  :");
        // int num1=sc.nextInt();
        // System.out.print("enter second a number  :");
        // int num2=sc.nextInt();
        // int max=(num1<num2)?num2:num1;
        // System.out.println("max number is : "+max);
        EqualorNot(100,100,100);


       
    }
    static void NextOrNot(int exp,int thr,int rew){
        if((exp+rew)>=thr){
         System.out.println("eligible");
        }
        else
         System.out.println("not eligible");
        System.out.println(exp+rew>=thr?"yes":"no");
     }

     static void EqualorNot(int a,int b,int c){
        System.out.println(a==b?c:a==c?b:a);
     }


    
}
