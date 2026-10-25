class NumArray {
    private int[] prefix;

    public NumArray(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[i] = nums[i-1] + nums[i];
        }
        prefix = nums;
        
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return prefix[right];
        }
        return prefix[right] - prefix[left-1];

        
    }
}

