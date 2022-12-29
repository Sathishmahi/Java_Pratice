import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class ExceptionHandling {
    
    public static void main(String[] args) {
        int []a={10};
        NullpointerExceptionExample.demoMethod(a);
    }
}

class ArtithmaticExceptionExample{
    static void addMethod(int a,int b){
        int c=0;
        try{
            c=a/b;
        }
        catch(Exception e){
            System.out.println(e);
            System.err.println(e);
        }
        System.out.println("end of program");
    }
}


class NullpointerExceptionExample{
    static void demoMethod(int []a){
        try{
            System.out.println(a[0]);

            System.out.println("after  error occured");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{//finally block always run if error occured or error not occured 
            System.out.println("this is a finally block");
        }
        System.out.println("end of program");
    }
}

class TRyWithResource{
    {try(Scanner sc=new Scanner(System.in)){//in this case scaaner object automatically close in this try block at tryWithResource
        int a=sc.nextInt();
    }}
    
}
