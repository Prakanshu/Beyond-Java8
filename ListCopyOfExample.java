import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

/*
We are exploring copyOf() method in this code. It is introduced in Java 9
Doc link :-https://docs.oracle.com/javase/10/docs/api/java/util/List.html#copyOf(java.util.Collection)
*/
public class ListCopyOfExample {
    public static void main(String args[]) {
     List<Integer> int_nums= new ArrayList<Integer>();
     for(int i=0;i<20;i++){
         int_nums.add(i);
     }
     
     System.out.println(int_nums);
     List<Integer>unmodifiableList=List.copyOf(int_nums);
     System.out.println("Unmodifiable List "+unmodifiableList);
     
     // Below code will throw exception as we are trying to add element to unmodifiable list
     unmodifiableList.add(20);
    }
}
/*
O/P:-

[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
Unmodifiable List [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]

Exception in thread "main" java.lang.UnsupportedOperationException
	at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
	at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:147)
	at MyClass.main(MyClass.java:16)


*/