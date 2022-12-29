public class Garbage_collection {
    public static void main(String[] args) {
        Garbage_Ex ge=new Garbage_Ex(10,10);
        Garbage_Ex ge1=new Garbage_Ex(100,100);
        ge=null;//dereferance obj
        ge=ge1;//dereferance obj
       
    }
}


class Garbage_Ex{
    Garbage_Ex(int a,int b){
        System.out.println("a is "+a+"  b is "+b);
    }

    // void protected finalize(){
    //     System.out.println("this is a finilize method ");
    // }
}
