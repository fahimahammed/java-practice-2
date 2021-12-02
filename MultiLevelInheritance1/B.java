
package MultiLevelInheritance1;

/**
 *
 * @author Fahim
 */
public class B extends A{
    public void display2(){
        display1();
        System.out.println("Method of B.");
    }
    
}
