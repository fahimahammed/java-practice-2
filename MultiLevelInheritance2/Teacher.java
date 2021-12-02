
package MultiLevelInheritance2;

/**
 *
 * @author Fahim
 */
public class Teacher extends Student{
    String qualification;
    
    void show2(){
        System.out.println("Teacher's Information: ");
        show();
        System.out.println("Qualification: "+qualification);
    }
}
