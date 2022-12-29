public class CallByValueAndCallByReferance {
    static void callbyvalue(int a){
        a++;
    }
   public static void main(String[] args) {
    int a=10;
   callbyvalue(a);//pass the value only not a referance 
    System.out.println(a);

    Democlass d=new Democlass(10,10,101);
    Democlass d1=new Democlass(10,10,101);
    System.out.println(d.isEqual(d1));
    
   } 
}

class Democlass{
    int a,b,c;
    Democlass(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    boolean isEqual(Democlass  obj){//call by referance 
        obj.a++;//change the variable a 
        if(obj.a==a && obj.b==b && obj.c==c){
            return true;
        }
        return false;

    }

}


