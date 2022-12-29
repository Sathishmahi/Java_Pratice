public class MultipleInharitence {
    public static void main(String[] args) {
        interface2 i=new A();
        i.interface1function();
    }
}

interface interface1{//interface
    void interface1function();
}

interface interface2 extends interface1{//one interface extends interface
    public default  void interface1function(){
        System.out.println("this is a interface1function but inside interface class");
    }
    int interface1function(int a);
}
class A implements interface2{//to implement the multiple inheritence using interface 
   

    @Override
    public void interface1function() {
       System.out.println("this is interface1function");
        
    }

    @Override
    public int interface1function(int a) {
        System.out.println("this is interface1function but override ");
        return a;
    }

}