import java.lang.reflect.*;;
public class Reflect {

    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ReflectDemoclass obj=new ReflectDemoclass();
        Class cls=obj.getClass();
        System.out.println(cls.getName());
        java.lang.reflect.Method[] m=cls.getMethods();
        m[0].invoke(obj,null);//invoke the method using reflection
        for(int i=0;i<m.length;i++){
            //System.out.println(m[i].getName());
        }
    }
}

class ReflectDemoclass{
    public void ReflectDemoclassfunction(){
        System.out.println("this is a ReflectDemoclassfunction");

    }
}