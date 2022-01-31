class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] toret = new int[2];
        for(int i =0; i< nums.length; i++){
            int s =nums[i];
            for(int j =i+1; j < nums.length; j++){
                int sum = nums[i]+ nums[j];
                if(sum == target){
                    toret[0] = i;
                    toret[1] = j;
                }
            }
            
        }
        return toret;
    }
    
}