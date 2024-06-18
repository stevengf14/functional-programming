package ec.com.linkedinlearning.functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Steve
 */
public class C3_V8_ParallelStreams {

    public static void main(String[] args) {
        /*Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

        Integer sum = listOfIntegers
                .stream()
                .reduce(0, (acc, x) -> {
                    System.out.println("acc: " + acc + ", x: " + x);
                    return acc + x;
                });*/

        String[] wordsArr = {"hello", "apple", "functional", "programming", "is", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));

        List<String> processedWords = words
                .parallelStream()
                .map(word -> {
                    System.out.println("Processing " + word);
                    return word.toUpperCase();

                })
                .map(word -> {
                    System.out.println("Adding exclamation point to " + word);
                    return word + "!";
                })
                .collect(Collectors.toList());
        System.out.println(processedWords);
    }

}
