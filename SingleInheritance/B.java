package SingleInheritance;

/**
 *
 * @author Fahim
 */
public class B extends A{
    public void display2(){
        System.out.println("Method of class B.");
    }
    
    public static void main(String[] args) {
        B b = new B();
        b.display1();
        b.display2();
    }
}
