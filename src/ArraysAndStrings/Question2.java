package ArraysAndStrings;

/**
 * Created by victor on 2015-12-14.
 */
public class Question2 {
    static String sort(String s){
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    static boolean permutationBySort(String s, String t){
        return s.length()==t.length() && sort(s).equals(sort(t));
    }

    static boolean permutationByCharSet(String s, String t){
        if (s.length()!=t.length())
            return false;

        int[] letters = new int[128];

        for (char c : s.toCharArray()) {
            letters[c]++;
        }
        for (char c : t.toCharArray()){
            letters[c]--;
            if(letters[c]<0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(permutationBySort("a","b"));
        System.out.println(permutationBySort("abc","cba"));
        System.out.println(permutationByCharSet("a","b"));
        System.out.println(permutationByCharSet("abc","cba"));
    }
}
