package ec.com.linkedinlearning.functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author Steve
 */
public class C3_V1_Map {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

//        List<Integer> doubled = new ArrayList<>();
//        for(int i=0; i<listOfIntegers.size(); i++){
//            Integer result = listOfIntegers.get(i) *2;
//            doubled.add(result);
//        }
        Function<Integer, Integer> timesTwo = (x) -> x * 2;

        List<Integer> doubled = listOfIntegers.stream().map(timesTwo).collect(Collectors.toList());

        System.out.println(doubled);

    }

}
