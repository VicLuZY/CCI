package ArraysAndStrings;

/**
 * Created by victor on 2015-12-14.
 */
public class Question3 {
    static void replaceSpaces(char[] str, int length){
        int spaceCount = 0, newLength=length, i;
        for (i=0; i<length;i++) {
            if (str[i] == ' ')
                spaceCount++;
        }
        newLength += spaceCount*2;

        str[newLength] = '\0';
        for(i = length-1;i>=0;i--){
            if(str[i]==' '){
                str[newLength-1] = '0';
                str[newLength-2] = '2';
                str[newLength-3] = '%';
                newLength -= 3;
            } else {
                str[newLength-1] = str[i];
                newLength--;
            }
        }
    }

    public static void main(String[] args) {
        char[] str = "Mr John Smith      ".toCharArray();
        replaceSpaces(str,13);
        System.out.println(str);
    }
}
