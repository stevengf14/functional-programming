package ec.com.linkedinlearning.functionalprogramming;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 *
 * @author Steve
 */
public class C4_V2_PartialApplication {

    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> add
                = (x, y, z) -> x + y + z;

        /*BiFunction<Integer, Integer, Function<Integer, Integer>> addPartial
                = (x, y) -> (z) -> add.apply(x, y, z);
        
        Function<Integer, Integer> add5And6 = addPartial.apply(5, 6);
        
        System.out.println(add5And6.apply(7));
         */
        Function<Integer, Function<Integer, Function<Integer, Integer>>> addPartial
                = x -> y -> z -> add.apply(x, y, z);

        Function<Integer, Function<Integer, Integer>> add5 = addPartial.apply(5);
        Function<Integer, Integer> add5And6 = add5.apply(6);
        Integer sum = add5And6.apply(7);

        System.out.println(sum);

    }

}
