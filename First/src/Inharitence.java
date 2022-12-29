public class Inharitence extends DemoInharit{
    
    public static void main(String[] args) {
        new DemoInharit();
        DemoInharit.print_all();
        DemoInharit d=new DemoInharit();
        d.print_all("sathish");

        DemoInharit1 d1=new DemoInharit1();
        d1.print_all_inharit();
        
    }
    void print_all_inharit(){
        System.out.println("this is a print_all_inharit");
    }
}


class DemoInharit{
    static void print_all(){
        System.out.println("this is a Demo class function ");
    }


    private void print_all(int a){
        System.out.println("this is a Demo class function but duplicate class  "+a);
    }

    protected void print_all(String s){
        System.out.println("this is a Demo class function but duplicate class  "+s);
    }
}

class DemoInharit1 extends Inharitence{
    void print_all_inharit(){
        super.print_all_inharit();//super class
        System.out.println("this is a print_all_inharit but sub class");
    }
//     {super.print_all_inharit();
//    }
}


