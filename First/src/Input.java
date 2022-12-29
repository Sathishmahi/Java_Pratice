import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("what is your name ");
        String name=sc.next();
        String name1=sc.nextLine();
        sc.nextLine();
        int rating=sc.nextInt();
        sc.nextLine();
        float mark=sc.nextFloat();
        sc.nextLine();
        double mark1=sc.nextDouble();
        sc.nextLine();
        boolean ToF=sc.nextBoolean();
        
        System.out.println("your name is "+name);

    }
    
}
