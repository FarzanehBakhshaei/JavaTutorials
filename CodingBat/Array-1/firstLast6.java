// Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more. 
public boolean firstLast6(int[] nums) {
  int length = nums.length;
  return ((nums[0]==6) || (nums[length-1]==6));
}
