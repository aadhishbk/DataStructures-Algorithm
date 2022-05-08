class Solution {
    public void sortColors(int[] arr) {
       /* int n = arr.length;
        for(int i=0;i<n; i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] >arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                
            }
        }
        */
        
        //Optimised
        int left =0, right=arr.length-1;
        for(int i=0;i<=right;){
            if(arr[i] == 2){
                int temp = arr[right];
                arr[right] = 2;
                arr[i] = temp;
                right--;
            }
            else if(arr[i]==0){
                int temp =arr[left];
                arr[left] =0;
                arr[i] = temp;
                i++;left++;
            }else{
                i++;
            }
        }
    }
}