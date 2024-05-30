package ec.com.linkedinlearning.functionalprogramming;

import java.util.function.Function;

/**
 *
 * @author Steve
 */
public class C2_V1_FunctionInterface {

    protected static class MyMath {

        public static Integer triple(Integer x) {
            return x * 3;
        }
    }

    public static void main(String[] args) {
        Function<Integer, Integer> myTriple = MyMath::triple;
        Integer result = myTriple.apply(5);
        System.out.println(result);
    }
}
