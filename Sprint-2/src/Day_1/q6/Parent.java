package Day_1.q6;

public class Parent {

    Parent() throws Exception{
        System.out.println("Inside parent constructor");
    }
    public void fun1(){
        System.out.println("Inside fun1 of Parent class");
    }

}
class Child extends Parent{

    Child() throws Exception {
        System.out.println("Inside child constructor");
    }

    public static void main(String[] args) {
        try {
            Child c1 =  new Child();
            c1.fun1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
