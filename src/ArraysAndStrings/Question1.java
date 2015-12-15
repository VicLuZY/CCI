package ArraysAndStrings;

/**
 * Created by victor on 2015-12-14.
 */
public class Question1 {
    static boolean isUniqueChars(String str){
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];

        for(char c: str.toCharArray()){
            if(char_set[c]) return false;
            char_set[c] = true;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isUniqueChars("abc"));
        System.out.println(isUniqueChars("aa bc"));
        System.out.println(isUniqueChars("abc*&"));
        System.out.println(isUniqueChars("ABCDEFGHIJKLMNabcdefghijklmn"));
        System.out.println(isUniqueChars("as9389uv8x8yhr3uirhno9fb7yo8wquh4rc"));
    }
}
