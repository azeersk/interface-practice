interface I1{
    void methodOne();
    void methodTwo();
}
class NewClass{
    public void something(){
        System.out.println("this is result of something method!!!");
    }
}
class C1 extends NewClass implements I1 {

    @Override
    public void methodOne() {
        System.out.println("this is abstract method one!!!");
    }

    @Override
    public void methodTwo() {
        System.out.println("this is abstract method two!!!");
    }
}



public class MainClass {
    public static void main(String[] args){
        C1 obj = new C1();
        obj.methodOne();
        System.out.println();
        obj.methodTwo();
        System.out.println();
        obj.something();
    }
}
