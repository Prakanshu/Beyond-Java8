import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*

Type inference - Java 10
*/

public class TypeInference {
    public static void main(String args[]) {
    
        List<String>names1= List.of("Hello","hello");
        List<String> names2 = List.of("Murmur","No Murmur");
        
        var names = List.of(names1,names2);
        // no need to create a list variable like List<List<String>>
        System.out.println(names);
    }
    
   
}
/*
O/P

[[Hello, hello], [Murmur, No Murmur]]
*/