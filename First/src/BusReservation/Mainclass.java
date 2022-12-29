package BusReservation;

import java.util.Scanner;

public class Mainclass {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Reservation r=new Reservation();

        

    }
}

class Reservation {
    static String date_list[]={"10-11-2022","12-11-2022","11-11-2022"};
    static int busNo[]={10,11,12};
    static int NoofSeats[]={50,50,50};
    static int NoofSeatsAvaliable[]={50,50,50};
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("login [l] or signup [s]   : ");
        char los = sc.next().charAt(0);
        if (los == 'l' || los == 'L') {
            Login l = new Login();
            l.login_();

        } else if (los == 'S' || los == 's') {
            Signup s = new Signup();
            s.demo();
        } else {
            System.out.println("enter valid key ");
        }
       
    }

    
}


class Booking{
    void reserve(){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a bus no : ");
        int busno = sc.nextInt();
        System.out.print("enter a date: 00-00-000[format]  ");
        String date = sc.next();
        System.out.print("no of seats you have :");
        int seats = sc.nextInt();
        String[] dateli=date.split("-");
        System.out.println(dateli.length);
       
        
        if(dateli.length==3 && dateli[0].length()==2 && Integer.parseInt(dateli[0]) >1 && Integer.parseInt(dateli[0])<=31 &&  dateli[1].length()==2 && Integer.parseInt(dateli[0]) >1 && Integer.parseInt(dateli[0])<=12 &&  dateli[2].length()==4){
            for(int i=0;i<Reservation.date_list.length;i++){
                if(Reservation.date_list[i].equals(date)){
                    if(Reservation.busNo[i]==busno){
                        if(seats<Reservation.NoofSeatsAvaliable[i]){
                                System.out.println("successfully seats booked");
                                Reservation.NoofSeatsAvaliable[i]=Reservation.NoofSeatsAvaliable[i]-seats;
                                break;

                        }
                        else{
                            System.out.println("sorry avaliable seats now "+Reservation.NoofSeatsAvaliable[i]);
                        }
                    }
                    else{
                        System.out.println("invalid busNo");
                        break;
                    }
                }else{
                    System.out.println("invalid date ");
                    break;
                }
            }
        }
        else{
            System.out.print("Invalid date format");
           
        }
        
    }
}


class Login {

    void login_(){
    
        Scanner sc = new Scanner(System.in);
        System.out.print("enter user name  : ");
        String username = sc.next();
        System.out.print("enter password  : ");
        String password = sc.next();
        Signup s=new Signup();
        
        
        for(int i=0;i<Signup.password_arr.length;i++){
            if(username.equals(Signup.username_arr[i]) && password.equals(Signup.password_arr[i])){
                System.out.println("login successfully");
                Booking bus=new Booking();
                bus.reserve();
                break;

            }
            else{
                System.out.println("password or user name invlaid");
                break;
            }
        }
        


    
    }
}








