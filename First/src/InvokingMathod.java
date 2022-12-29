public class InvokingMathod {
  
    public static void main(String[] args) {
      
        Demo d=new Demo(10,10,10);
        //System.out.println(d.Demo(10,10,10));
    }
    }
class Demo{

int length,breath,height;

void setParams(int l,int b,int h){
length=l;
breath=b;
height=h;
}
Demo(int length,int breath,int height){
    this.length=length;
    this.height=height;
    this.breath=breath;
    System.out.println("this is a default constructor");
}

// int Demo(int l,int b,int h){
    
//     return l*b*h;}
}
