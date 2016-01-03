// Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
// The array length will be a least 1. 
public int maxTriple(int[] nums) {
  if (nums.length < 2) {
     return nums[0];
  }else if (nums.length < 3) {
     return Math.max(nums[0], nums[1]);
  }
  
  return Math.max (Math.max(nums[0], nums[nums.length/2]) , nums[nums.length-1]);
}
