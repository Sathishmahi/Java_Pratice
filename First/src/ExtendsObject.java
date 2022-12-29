import javax.sound.sampled.SourceDataLine;

public class ExtendsObject {
    public static void main(String[] args) {
        String s1="sathish";
        String s2="sathish";
        String s3=new String("sathish");
        String s4=new String("sathish");
        String s5=s4;

        //== operator compare between object memory(referance point) not a(string) in this place

        System.out.println(s1==s2);
        System.out.println(s3==s4);//s4 and s3 memory(referance point) is not same so ans is true
        System.out.println(s5==s4);//s4 and s5 memory(referance point) is same so ans is true
        System.out.println(s3.equals(s4));//string.equals(string) compare content not a memory(referance point)
        System.out.println(s1.equals(s2));//string.equals(string) compare content not a memory(referance point)
        

        ExtendsObjectclass1 e=new ExtendsObjectclass1(10,10);
        Object e1=new ExtendsObjectclass1(10,10);
        System.out.println("after override equals method  "+e.equals(e1));//in this case ExtendsObjectclass1 class does not contain equals method but Object class inherit to ExtendsObjectclass1 so to access the equlas method  
        System.out.println("after override equals method  "+e.equals(e));//in this case ExtendsObjectclass1 class does not contain equals method but Object class inherit to ExtendsObjectclass1 so to access the equlas method  




        /*

         equals method is a super object class method in this methos overwirte by String class based on recuirement
    
         */
    }
}

class ExtendsObjectclass1{
    int a,b;

    public boolean equals(ExtendsObjectclass1 obj) {//over ride  equal method
        System.out.println("inside the ExtendsObjectclass1 method");
        if(obj.a==a && obj.b==b){
        return true;}
    return false;
    }


    public boolean equals(Object obj) {//over ride  equal method
        System.out.println("inside the Object method");
        if (this==obj)
            return true;
        if (obj==null)
            return false;
        if (obj.getClass()==this.getClass()){
            ExtendsObjectclass1 obj1=(ExtendsObjectclass1) obj;
            if(obj1.a==a && obj1.b==b){
                return true;
            }
}return false;
    }

    ExtendsObjectclass1(int a,int b){
this.a=a;
this.b=b;
    }
  
  }






  