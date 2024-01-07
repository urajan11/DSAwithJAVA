public class SubString {
    public static String Sub(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str="Rajan Urkude";
        String s=str.substring(0,8);
        System.out.println("subString: "+s);
       // System.out.println("subString: "+Sub(str, 0, 7));
    }
    
}
