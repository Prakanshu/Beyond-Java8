import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
Here we are trying to show the use of Predicate.not(), using this method we can pass method reference and perform 
negation

Doc link:- 
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Predicate.html#not(java.util.function.Predicate)

static <T> Predicate<T> not​(Predicate<? super T> target)

Returns a predicate that is the negation of the supplied predicate. This is accomplished by returning result of the calling target.negate().

Type Parameters:
T - the type of arguments to the specified predicate

Parameters:
target - predicate to negate

Returns:
a predicate that negates the results of the supplied predicate

Throws:
NullPointerException - if target is null

Since:
11
*/
/*
Intresting link to achieve in Java8 :- https://stackoverflow.com/questions/21488056/how-to-negate-a-method-reference-predicate

*/

public class PredicateNotExample {
    public static void main(String args[]) {
    
     //  List.of is a static method to create a unmodifiable list. 
     List<Integer> intList = List.of(1,2,3,4,5);
     System.out.println("Unmodifiable List "+intList);
     
     Predicate<Integer> evenNoPredicate = number -> number%2==0;
     
     // It is possible to negate the predicate as below
     List<Integer> notEvenNoList= intList.stream().filter(evenNoPredicate.negate()).collect(Collectors.toList());
     System.out.println("NOT EVEN NO LIST "+notEvenNoList);
     
     // We cannot do the negate on the method reference as below
     List<Integer> evenNoList= intList.stream().filter(PredicateNotExample::isEven).collect(Collectors.toList());
     
     System.out.println("evenNoList "+evenNoList);
     
     // On the above method reference, we cannot apply negate, the Predicate.not() allows to negate on the method reference.
      List<Integer> notevenNoListUsingPredicateNot= intList.stream().filter(Predicate.not(PredicateNotExample::isEven)).collect(Collectors.toList());
     
     System.out.println("notevenNoListUsingPredicateNot "+notevenNoListUsingPredicateNot);
   
    }
    
    public static Boolean isEven(Integer number){
        return number%2==0;
    }
}
/*
O/P:-
Unmodifiable List [1, 2, 3, 4, 5]
NOT EVEN NO LIST [1, 3, 5]
evenNoList [2, 4]
notevenNoListUsingPredicateNot [1, 3, 5]

*/