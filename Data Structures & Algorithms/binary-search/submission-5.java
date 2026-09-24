class Solution {
    public int search(int[] nums, int target) {
        int right = nums.length-1;
        int left=0;
        int center ;
        while(left <= right )
        {
            center = (left + right) / 2 ;
            if(nums[center]<target)
            {
                left=center +1;
            }
            else if(nums[center]>target)
            {
                right=center-1;
            }
            else return center ;
        }
        return -1;
    }
}
