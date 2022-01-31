class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,len=0,n = s.length();
        Set<Character> set = new HashSet<>();
        while(j<n){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);j++;
            }else{
                len = Math.max(len,set.size());
                i++; j=i; 
                set.clear();
            }
            if(j ==n){
                if(set.size() > len) return set.size();
                else return len;
            }
        }
        return len;
    }
}