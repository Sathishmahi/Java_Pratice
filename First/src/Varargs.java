public class Varargs {


    static double return_small(double ... val){//var method overloading 
        double a=Double.MAX_VALUE;
        for(double i:val){
            if(i<a){
                a=i;
            }
            }
            return a;
        }

    static int return_small(int ... val){//var 
        int a[]=val;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }
        return a[0];
    }


    
        
    

    public static void main(String[] args) {
        System.out.println(return_small(10,903,90,1,1));
        System.out.println(return_small(10,903.,90.,5.,10.));
        System.out.println(return_small());
        
    }
    
}
