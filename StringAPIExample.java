import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
isBlank() -> Java 11
strip(),stripLeading(),stripTrailing -> Java 11
lines() -> Java 11
transform() -> Java 12
formatted() -> Java 13
Helpful NullPointerExceptions -> Java 14
*/

public class StringAPIExample {
    public static void main(String args[]) {
    
    // isBlank() -> To check non-whitespace string
    String s=" ";
    System.out.println(s.isBlank()); // true as the string has whitespace
    
    
    // strip() -> remove whitespace from beginning and end of string
    String hello =" He llo ";
    System.out.println(hello.strip());
    
    // stripLeading() 
    String helloStripLeading =" Hello Leading ";
    System.out.println(helloStripLeading.stripLeading());
    
     // stripTrailing() 
    String helloStripTrailing =" Hello Trailing ";
    System.out.println(helloStripTrailing.stripTrailing());
    
     // lines()
     String lines="Line 1\nLine 2";
     lines.lines().forEach(System.out::println);
     
     
     // transform()
     
     String transform ="What's your name";
     transform=transform.transform(sc-> {
         if(sc.contains("'")){
             sc="Invalid character in String";
         }
           
         return sc;
     });
     System.out.println("TRANSFORM "+transform);
     
     
     // formatted() - Java 13
     
     System.out.println("You are %s and you are doing %s".formatted("awesome","great."));
     
     // enhanced null pointer exception message saying which variable is null
     
     
     String iAMNull =null;
     System.out.println(iAMNull.isBlank());
     /*
     Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isBlank()" because "<local7>" is null
	 at StringAPIExample.main(StringAPIExample.java:83)
     
     */
     
     
    
    
    
    }
    
   
}
/*
O/P

true
He llo
Hello Leading 
 Hello Trailing
Line 1
Line 2
TRANSFORM Invalid character in String
You are awesome and you are doing great.

Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isBlank()" because "<local7>" is null
	at StringAPIExample.main(StringAPIExample.java:62)

*/