import java.util.*;
public class ArrayComparisionUsinhInterFace{
    public static void main(String[] args) {
        ComaparableClass a=new ComaparableClass(10,10);
        ComaparableClass a1=new ComaparableClass(110,10);
        ComaparableClass a2=new ComaparableClass(1900,10);
        ComaparableClass a3=new ComaparableClass(100,10);
        ComaparableClass a4=new ComaparableClass(190,10);

        System.out.println(a.compareTo(a1));
        ComaparableClass c[]={a,a1,a2,a3,a4};
        Arrays.sort(c);
        for(ComaparableClass cc:c){
            System.out.println(cc.a);
        }
        //a.compareTo(c);

    }
    
}


class ComaparableClass  implements Comparable<ComaparableClass>{


    int a,b;

   

    ComaparableClass(int a,int b){
        this.a=a;
        this.b=b;
    }
   
    

    
    public int compareTo(ComaparableClass o) {
        if(this.getClass().getName().equals(o.getClass().getName())){
            if(o.a==a)
                return 0;
            if(o.a<a)
                return -1;
        }
        // TODO Auto-generated method stub
        return 1;
    }
    
}
