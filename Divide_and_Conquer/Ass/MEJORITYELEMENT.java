public class MEJORITYELEMENT {
    public static int majority(int arr[]) {
        int majoritycount=arr.length/2;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>majoritycount){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 1,2,1,1,1,2,2};
        System.out.print(majority(arr));
    }
}
