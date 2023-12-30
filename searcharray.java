public class searcharray {
    // class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        if(n==0)
            return false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(0<=i && i!=j){
                    if(arr[i]==2*arr[j])
                        return true;
                }
            }
        }
        return false;
    }
// }
    public static void main(String[] args) {
        
    }
}
