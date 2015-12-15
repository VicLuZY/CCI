package ArraysAndStrings;

import java.util.stream.Collectors;

/**
 * Created by victor on 2015-12-14.
 */
public class Question4 {

    static boolean isPermutationOfPalindrome(String phrase){
        int countOdd = 0;
        int[] table = new int[26];
        for (char c: phrase.toLowerCase().toCharArray()){
            if (Character.isLetter(c)){
                table[c-'a']++;
                if (table[c-'a']%2==1){
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }

    static boolean isPermutationOfPalindrome2(String s){
        return s.chars()
                .boxed()
                .collect(Collectors.groupingBy(o -> o, Collectors.counting()))
                .values()
                .stream()
                .filter(p -> p % 2 == 1)
                .count() <= 1;
    }

    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("Tact Coa"));
        System.out.println(isPermutationOfPalindrome("Tact Coab"));
        System.out.println(isPermutationOfPalindrome2("Tact Coa"));
        System.out.println(isPermutationOfPalindrome2("Tact Coab"));

    }
}
