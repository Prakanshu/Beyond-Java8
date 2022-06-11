import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
RecordExample - Java 16
Record are immutable


*/

public class RecordExample {
    
    public record Employee(String name,String phoneNumber){}
    public static void main(String args[]) {
    
      Employee e = new Employee("john","123-456-7890");
      System.out.println(e.name());
    }
    
   
}
/*
O/P

john
*/