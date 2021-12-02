
package MultiLevelInheritance1;

/**
 *
 * @author Fahim
 */
public class C extends B{
    public void display3(){
        display2();
        System.out.println("Method of C.");
    }
    
    public static void main(String[] args) {
        C c = new C();
        c.display3();
    }
}
