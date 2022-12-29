public class Static_keyword {

    public static void main(String[] args) {

        Static_keyword_example ske=new Static_keyword_example();
        Static_keyword_example ske1=new Static_keyword_example();
        Static_keyword_example ske2=new Static_keyword_example();
        Static_keyword_example ske3=new Static_keyword_example();
        Static_keyword_example ske4=new Static_keyword_example();
        System.out.println(Static_keyword_example.count);
        Static_keyword_example.print_no_of_obj();        
    }
    
}

class Static_keyword_example{
    static int count;//static keyword

    Static_keyword_example(){
    count++;
    }
    static{//static block
        System.out.println("static block");
        count=0;
    }
    static void print_no_of_obj(){//static function
        System.out.println("static function ");
        System.out.println("no of obj  "+count);
    }
}
