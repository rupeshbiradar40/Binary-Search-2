// Time Complexity : O(logN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approachclass Solution {
    public int findPeakElement(int[] nums) {
        
        int start=0;
        int end = nums.length-1;
        
        while(start<=end){
            
            int mid=start+(end-start)/2;
            if((mid==0 || nums[mid]>nums[mid-1])&&(mid==nums.length-1 || nums[mid]>nums[mid+1])){
                return mid;
            }else if(mid != nums.length-1 && nums[mid]<nums[mid+1]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}