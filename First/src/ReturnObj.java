

public class ReturnObj {
    public static void main(String[] args) {

        DemoReturnobj d=new DemoReturnobj(10,101,101);
        DemoReturnobj b=d.return_double();
        System.out.println(b.a);
        System.out.println(b);
        
    }
}

class DemoReturnobj{
    int a,b,c;
    DemoReturnobj(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;

    }

    DemoReturnobj return_double(){
    DemoReturnobj d2=new DemoReturnobj(a*2, b*2, c*3);
    System.out.println(d2);
    return d2;
    
}
}
