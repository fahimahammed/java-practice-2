
package MultiLevelInheritance2;

public class Student extends Person{
    String result;
    String University = "University of Rajshahi";
    
    void show1(){
        System.out.println("Student's Information: ");
        show();
        System.out.println("Result: "+result);
    }

    @Override
    void print()
    {
        System.out.println("College name: "+college);
        System.out.println("University name: "+University);
    }
}