public class Bitwise {

    public static void main(String[] args) {
        
        System.out.println(10 & 21);//and bitwise operator
        System.out.println(10 | 21);//or bitwise operator
        System.out.println(~10);//not bitwise operator
       

        //left  swift << 
        //ex 4 0000 0100
        //after swifting 0000 1000

        //right  swift >> 

        //ex a>>2
        // 0000 100
        //fill the empty space in 2
        //after swifting 0000 0010

        int a=4;
        byte b=4;
        System.out.println(a<<1);//left swifting
        System.out.println(a>>1);//right swifting fill in exit digit 
        System.out.println(a>>>1);//right swifting fill in zero 
        System.out.println(b<<1);//using bitwise operation byte automatically convert into int
        System.out.println(b<<1);//using bitwise operation byte automatically convert into int

        boolean t=true;
        boolean t1=true;
        System.out.println(t&t1);
        System.out.println(t|t1);
   
   
    }
    
}
