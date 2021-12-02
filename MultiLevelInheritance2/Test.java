
package MultiLevelInheritance2;

/**
 *
 * @author Fahim
 */
public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        
        t1.name = "Rakib Hasan";
        t1.age = 34;
        t1.qualification = "MSC in CSE";
        t1.show2();
        
        System.out.println("\n\n");
        
        t2.name = "Fahim Ahammed";
        t2.age = 20;
        t2.result = "A+";
        t2.show1();
    }
}
