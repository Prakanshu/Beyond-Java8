import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*

SwitchExpressionExample - Java 12
*/

public class SwitchExpressionExample {
    public static void main(String args[]) {
    
       int num =5;
       
       // default switch
       String defaultSwitch ="";
       switch(num){
           case 0: defaultSwitch="ZERO";
                   break;
           case 1: defaultSwitch="ONE";
                   break;
           case 2: defaultSwitch="TWO";
                   break;
           case 3: defaultSwitch="THREE";
                   break;
           case 4: defaultSwitch="FOUR";
                   break;
           case 5: defaultSwitch="FIVE";
                   break;
           default: break;
       }
       System.out.println("DEFAULT SWITCH "+defaultSwitch);
       
       
       
       // Switch Expression
       
       String stringNumber = switch(num){
           
           case 0 -> "ZERO";
           case 1 -> "ONE";
           case 2 -> "TWO";
           case 3 -> "THREE";
           case 4 -> "FOUR";
           case 5 -> {
               System.out.println("FOUND MATCH ");
               yield "FIVE";
           }
           default -> "NO MATCH";
       };
       
       System.out.println(stringNumber);
    }
    
   
}
/*
O/P

DEFAULT SWITCH FIVE
FOUND MATCH 
FIVE
*/