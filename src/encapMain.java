class encapClass{
    private int aa;
    private int b;
    private int c;

    public void setA(int a){
        System.out.println(aa);
        this.aa = a;
    }
    public void setB(int b){
        this.b = b;
    }
    public void setC(int c){
        this.c = c;
    }

    public void getA(){
        System.out.println("Value of A is: "+aa);
    }
    public void getB(){
        System.out.println("Value of B is: "+b);
    }
    public void getC(){
        System.out.println("Value of C is: "+c);
    }
}


public class encapMain {
    public static void main(String[] args){
        encapClass objO = new encapClass();
        int a = 5;
        int b = 10;
        int c = 15;
        objO.setA(a);
        objO.setB(a);
        objO.setC(c);
        objO.getA();
        objO.getB();
        objO.getC();
    }
}
