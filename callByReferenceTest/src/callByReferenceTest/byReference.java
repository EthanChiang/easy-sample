package callByReferenceTest;

public class byReference {


    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        
        
        operate(a,b);
        StringBuffer c = a;
        b =a;
        System.out.println(a+","+b);//AB,B
        System.out.println("c:" + c);//AB,B
    }
    static void operate(StringBuffer x,StringBuffer y){
        x.append(y);
        x.append(x);
        x = y;
        System.out.println("x:" + x);
    }


}
