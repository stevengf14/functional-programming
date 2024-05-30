package ec.com.linkedinlearning.functionalprogramming;

import java.util.function.Function;

/**
 *
 * @author steve
 */
public class C2_V2_LambdaExpressions {

    public static void main(String[] args) {
        Function<Integer, Integer> absoluteValue
                = (x) -> x < 0 ? -x : x;
        System.out.println("|-100|=" + absoluteValue.apply(-100));
        System.out.println("|100|=" + absoluteValue.apply(100));
    }
}
