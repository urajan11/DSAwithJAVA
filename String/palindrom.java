public class palindrom {
    public static boolean IsPalindrom(String str){
     for(int i=0;i<str.length()/2;i++){
        int n=str.length();
        if(str.charAt(i)!=str.charAt(n-1-i)){
            // not a palindrom
            return false;
        }
     }
     return true;
    }

    public static void main(String args[]){
     String str="cococ";
     System.out.print("check palindrom: "+IsPalindrom(str));
    }
    
}
