package ec.com.linkedinlearning.functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author Steve
 */
public class C3_V4_Collect {

    public static void main(String[] args) {
        String[] wordsArr = {"hello", "apple", "functional", "programming", "is", "cool"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));

        List<String> longWords = words
                .stream()
                .filter(word -> word.length() > 5)
                .collect(Collectors.toList());
        System.out.println(longWords);

        /*Set<String> longWords = words
                .stream()
                .filter(word -> word.length() > 5)
                .collect(Collectors.toSet());
        System.out.println(longWords);*/
        
        /*String longWords = words
                .stream()
                .filter(word -> word.length() > 5)
                .collect(Collectors.joining(", "));
        System.out.println(longWords);*/
        
        /*Long howManyLongWords = words
                .stream()
                .filter(word -> word.length() > 5)
                .collect(Collectors.counting());
        System.out.println(howManyLongWords);*/
        
        /*Map<Integer, List<String>> wordLengthMap = words
                .stream()
                .filter(word -> word.length() >= 5)
                .collect(Collectors.groupingBy(
                        word -> word.length()));
        System.out.println(wordLengthMap);*/
        
        Map<Boolean, List<String>> wordLengthMap = words
                .stream()
                .collect(Collectors.partitioningBy(
                        word -> word.length() > 5
                ));
        System.out.println(wordLengthMap);
    }

}
