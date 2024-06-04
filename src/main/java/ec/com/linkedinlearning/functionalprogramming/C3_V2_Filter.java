package ec.com.linkedinlearning.functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author Steve
 */
public class C3_V2_Filter {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

//        List<Integer> evens = new ArrayList<>();
//        for (int i = 0; i < listOfIntegers.size(); i++) {
//            Boolean isEven = listOfIntegers.get(i) % 2 == 0;
//            if (isEven) {
//                evens.add(listOfIntegers.get(i));
//            }
//        }
        Predicate<Integer> isEven = (x) -> x % 2 == 0;
        List<Integer> evens = listOfIntegers.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(evens);

        String[] wordsArr = {"hello", "functional", "programming", "is", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));

        //Predicate<String> isLongerThan5 = (str) -> str.length() > 5;
        Function<Integer, Predicate<String>> createLengthTest = minLength -> {
            return (str) -> str.length() > minLength;
        };

        Predicate<String> isLongerThan3 = createLengthTest.apply(3);
        Predicate<String> isLongerThan10 = createLengthTest.apply(10);

        List<String> longWords = words.stream().filter(isLongerThan10).collect(Collectors.toList());
        System.out.println(longWords);

    }

}
