public class CustomException {
 public static void main(String[] args) {
    //CustomExceptionClass1 c=new CustomExceptionClass1(100.0, 2000.0);
    double a=100.0;
    double b=20.0;
    if(a<b){
        try{
            throw new NotEnoughMoney(a,b);
        }
        catch(NotEnoughMoney e){
            System.out.println(e);
        }

    }

 }   
}

class NotEnoughMoney extends Exception{
    
    NotEnoughMoney(double a,double b){
       super("not enough money ");
        
    }
}
class CustomExceptionClass1{

    
    double accountBal;
    double withDraw;
CustomExceptionClass1(double accountBal,double withDraw){
this.accountBal=accountBal;
this.withDraw=withDraw;
}

{try {
    System.out.println("inside");
    if(this.accountBal<this.withDraw){
        System.out.println("inside the try block");
        throw new NotEnoughMoney(accountBal,withDraw);
    } 
} catch (Exception e) {
    System.out.println("inside the catch");
    System.out.println(e);
    }
    
}


   { System.out.println("end of program");}

}
