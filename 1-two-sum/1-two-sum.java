class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        for(int idx = 0; idx < nums.length; idx++)
        {
            for(int q = idx + 1; q < nums.length; q++)
            {
                if(target == nums[idx] + nums[q])
                {
                    return new int[] {idx, q};
                }
            }
        }
        return null;
    }
}