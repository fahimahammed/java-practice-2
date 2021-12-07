
package MultiLevelInheritance2;

public class Student extends Person{
    String result;
    
    void show1(){
        System.out.println("Student's Information: a");
        show();
        System.out.println("Result: "+result);
    }
}
