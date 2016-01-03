// Given an array of ints length 3, figure out which is larger between the first and last elements in the array, 
// and set all the other elements to be that value. Return the changed array. 
public int[] maxEnd3(int[] nums) {
  int max = Math.max(nums[0], nums[2]);
  int[] maxArray = {max, max, max};
  return maxArray;
}
