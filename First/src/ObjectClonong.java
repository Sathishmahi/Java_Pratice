import java.util.*;


/*
 *to clone the object exact same information using object clone method
 */
public class ObjectClonong {
public static void main(String[] args) throws CloneNotSupportedException {
    Department dept=new Department("mech");
    Date date = new Date(2022, 11, 21);
    Date date1 = new Date(2022, 11, 22);
    Democlass123 d=new Democlass123(10,10,9,dept,date);
    
    
    Department dept1=(Department)dept.clone();
  
    
    Democlass123 d2=d;//this is not a cloning in this place d refer d2 memory 
    //System.out.println(d2==d);
    Democlass123 d1=(Democlass123)d2.clone();//shallow copy only copy the primitive datatypes not a object like dept
    //d.dob=date1;
    date.setDate(10);
    System.out.println(d.dob);
    System.out.println(d1.dob);


    dept.deptname="mech and auto";
    System.out.println(d.dep.deptname);
    System.out.println(d1.dep.deptname);
    //System.out.println(d1==d);
}    
}
class Department implements Cloneable{
    String deptname;
    Department(String n){
        deptname=n;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {//this is a shallow copy this method copy  only primitive datatypes
       
        return super.clone();
    }
}
class Democlass123 implements Cloneable{
    int a,b,c;
    Date dob;
    Department dep;
    Democlass123(int a,int b,int c,Department de,Date dob){
        this.a=a;
        this.b=b;
        this.c=c;
        this.dob=dob;
        dep=de;
        //System.out.println(de.deptname);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {//deep copy method this method copy all variables and class object
       Democlass123 d=(Democlass123)super.clone();//clone the Democlass123 object
       d.dep=(Department)dep.clone();//clone the dept object 
       d.dob=(Date)dob.clone();
        return d;//return Democlass123 object
    }
}