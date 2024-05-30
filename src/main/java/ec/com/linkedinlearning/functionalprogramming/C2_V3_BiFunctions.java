package ec.com.linkedinlearning.functionalprogramming;

import java.util.function.BiFunction;

/**
 *
 * @author Steve
 */
public class C2_V3_BiFunctions {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        System.out.println("BiFunction: " + add.apply(32, 33));

        TriFunction<Integer, Integer, Integer, Integer> addThree = (x, y, z) -> z + y + z;
        System.out.println("TriFunction: " + addThree.apply(54, 3, 4));

        NoArgFunction<String> sayHello = () -> "Hello";
        System.out.println("NoArgFunction: " + sayHello.apply());
    }

}
