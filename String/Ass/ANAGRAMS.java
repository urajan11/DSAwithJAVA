import java.util.Arrays;
public class ANAGRAMS {
    public static void anagram(String str,String str1){
       //First check-- length of strings
        if(str.length() == str1.length()){

        //convert string into char arrry
        char[] strcharArray=str.toCharArray();
        char[] str1charArray=str1.toCharArray();

        // sort the char array
        Arrays.sort(strcharArray);
        Arrays.sort(str1charArray);

        //if the sorted char array are same or identical then the string are anagram
        boolean result= Arrays.equals(strcharArray, str1charArray);
        if(result){
            System.out.println("anagrams");
        }
        else{
            System.out.println("not anagrams");
        }
    }
        else{
            //case when lengthd are not equal
            System.out.println("not anagrams need same length strings");
        }
        
}
    public static void main(String args[]){
        String str="rsce";
        String str1="care";
        anagram(str, str1);
    }

}
