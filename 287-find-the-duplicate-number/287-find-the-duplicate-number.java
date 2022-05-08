class Solution {
    public int findDuplicate(int[] nums) {
        int answer =-1;
        int low =1, high = nums.length;
        while(low<=high){
            
            int mid = low + (high - low)/2;
            int count =0;
            for(int i =0; i<nums.length;i++){
                if(nums[i] <= mid)count++;
            }
            if(count > mid){
                answer =mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            
        }
        return answer;
    }
    
}
/* for(int i=0;i<nums.length; i++){
            int n = nums[i];
            for(int j =i+1; j<nums.length;j++ ){
                if(n == nums[j]){
                    return n;
                }
            }
        }
        return 0;
        */