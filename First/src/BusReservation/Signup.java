package BusReservation;

import java.util.Scanner;

public class Signup {
    
    static int counter = 0;
    static String[] username_arr =new String[100];
    static String password_arr[] = new String[100];
    static String email_arr[] = new String[100];
        void demo(){
        Scanner sc=new Scanner(System.in);
        
        
      
        
        System.out.print("enter user name  : ");
        String username = sc.next();
        System.out.print("enter password  : ");
        String password = sc.next();
        System.out.print("re-enter password  : ");
        String repassword = sc.next();

        while (true) {
            String repass;
            if (password.equals(repassword)) {
                break;
                
            } else {
                
                System.out.println("password does not match");
                System.out.print("re-enter password  : ");
                String repassword1 = sc.next();
                repassword = repassword1;
                System.out.println(repassword);
                System.out.println(password);
            }
        }

        for(int i=0;i<=0;i++){
          
            username_arr[counter]=username;
           
            password_arr[counter]=password;
          
            counter++;
        }

        while (true) {
            for (int i = 0; i < username_arr.length; i++) {
                if (username_arr[i].equals(username)){
                    username_arr[counter-1]=username;
                    break;
                } else {
                    
                    System.out.println("user name already taken ");

                    System.out.print("enter username  : ");
                    String username1 = sc.next();
                    username = username1;
                }
            }
            System.out.println("sucessfully signup :)");
            break;
            
        }

        Booking bus=new Booking();
        bus.reserve();
        
       

           
    
}

}