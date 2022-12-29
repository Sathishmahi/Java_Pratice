public class Method {

int l=909;
double volume(int l,int b,int h){
    return l*b*h;
}

 public static void main(String[] args) {
    // for(int i=0;i<args.length;i++){
    //     System.out.println(args[i]);
    // }
    // Method m=new Method();

    
    // System.out.println(m.volume(10,2,10));
    Demo1 d=new Demo1(10,101,10);
    Demo1 d1=new Demo1(10,101,10);
    System.out.println(d.isEqual(d1));
    Demo1 d2=new Demo1(d1);
    System.out.println(d1.a);
    System.out.println(d2.a);

        //Demo d1=new Demo(10,101,10);
 }   
}


class Demo1{
    int a,b,c;
    Demo1(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    Demo1(Demo1 obj){
        a=obj.a;
        b=obj.c;
        c=obj.c;
        
    }

    boolean isEqual(Demo1 newobj){
        System.out.println(newobj.a );
        System.out.println(a);
       if (a==newobj.a &&
        b==newobj.b &&
        c==newobj.c){
            return true;
        }
        return false;
    }
    
}
