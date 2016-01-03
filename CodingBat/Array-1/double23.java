// Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2. 
public boolean double23(int[] nums) {
  if (nums.length<2) {
     return false;
  }
  
  if(nums[0]==nums[1] && (nums[0]==2 || nums[0]==3)) {
     return true;
  }
  return false;
}
