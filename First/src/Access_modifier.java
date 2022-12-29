public class Access_modifier {

    public static void main(String[] args) {

        Access_modifier_example ace=new Access_modifier_example();
       System.out.println(ace.b);
    }

    protected void demofun(){
        System.out.println("this is a demo function");
    }
    
}

class Access_modifier_example{
    private int a=10;//private access modifier
    protected int b=10;//protected access modifier
    public  int c=10;//public access modifier
    int d=10;//default  access modifier using package only
    void print_a(){
        System.out.println(a);
    }


}
