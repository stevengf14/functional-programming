package ec.com.linkedinlearning.functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 *
 * @author Steve
 */
public class C3_V3_Reduce {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

        BinaryOperator<Integer> getSum = (acc, x) -> {
            Integer result = acc + x;
            System.out.println("acc: " + acc + ", x: " + x + ", result: " + result);
            return result;
        };

        Integer sum = listOfIntegers.stream().reduce(0, getSum);
        System.out.println(sum);
    }

}
