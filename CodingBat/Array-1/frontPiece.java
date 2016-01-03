// Given an int array of any length, return a new array of its first 2 elements.
// If the array is smaller than length 2, use whatever elements are present. 
public int[] frontPiece(int[] nums) {
  int length = (nums.length > 2) ? 2 : nums.length;
  int[] arr = new int [length];
  for (int i=0; i<length; i++) {
     arr[i] = nums[i];
  }
  return arr;
}
