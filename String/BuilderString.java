public class BuilderString {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        //abcdefghi.
        //O(26)
        //O(n^2)
        System.out.println(sb);
    }
    
}
