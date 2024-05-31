package ec.com.linkedinlearning.functionalprogramming;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 *
 * @author Steve
 */
public class C2_V8_HigherOrderFunctions {

    public static void main(String[] args) {
        BiFunction<Float, Float, Float> divide = (x, y) -> x / y;

        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> secondArgIsntZeroCheck
                = (func) -> (x, y) -> {
                    if (y == 0f) {
                        System.out.println("Error: Second argument is zero!");
                        return 0f;
                    }
                    return func.apply(x, y);
                };

        BiFunction<Float, Float, Float> divideSave = secondArgIsntZeroCheck.apply(divide);

        System.out.println(divideSave.apply(10f, 0f));
    }

}
