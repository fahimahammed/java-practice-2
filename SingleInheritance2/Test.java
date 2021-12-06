
package SingleInheritance2;

/**
 *
 * @author Fahim
 */
public class Test {
    public static void main(String[] args) {
        Calculator C = new Calculator();
        
        // initialize the value 
        C.a = 10;
        C.b = 5;
        
        C.Add();
        C.Sub();
        C.Mul();
        C.Div();
    }
}
