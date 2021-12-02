
package MultiLevelInheritance2;

/**
 *
 * @author Fahim
 */
public class Student extends Person{
    String result;
    
    void show1(){
        System.out.println("Student's Information: ");
        show();
        System.out.println("Result: "+result);
    }
}
