package ec.com.linkedinlearning.functionalprogramming;

import java.util.function.BiFunction;

/**
 *
 * @author Steve
 */
public class C2_V4_FunctionsAsArguments {
    
    protected static class MyMath {
        
        public static Integer add(Integer x, Integer y) {
            return x + y;
        }
        
        public static Integer substract(Integer x, Integer y) {
            return x - y;
        }
        
        public static Integer combine2And3(BiFunction<Integer, Integer, Integer> combineFunc) {
            return combineFunc.apply(2, 3);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("2+3=" + MyMath.combine2And3(MyMath::add));
        System.out.println("2-3=" + MyMath.combine2And3(MyMath::substract));
        
        System.out.println(MyMath.combine2And3((x, y) -> 2 * x + 2 * y));
    }
}
