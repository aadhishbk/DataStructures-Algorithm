class Solution {
    public void moveZeroes(int[] arr) {
        
    int writer=0;
    for(int i=0; i<arr.length;i++){
        if(arr[i] != 0)
        {
            arr[writer] = arr[i];
            writer++;
        }
    }
    for(int i= writer; i <arr.length; i++){
        arr[i] = 0;
    }
    }
}