public class ObjectInvoke {
    public static void main(String[] args) {
        Demo d=new Demo(10,101,10);
        Demo d1=new Demo(10,101,10);
        System.out.println(d.isEqual(d1));
        //Demo d1=new Demo(10,101,10);
        
    }
}

class Demo{
    int a,b,c;
    Demo(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    boolean isEqual(Demo newobj){
       if (a==newobj.a &&
        b==newobj.b &&
        c==newobj.c){
            return true;
        }
        return false;
    }
    
}