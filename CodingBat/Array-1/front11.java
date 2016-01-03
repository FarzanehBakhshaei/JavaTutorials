// Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. 
// If either array is length 0, ignore that array. 
public int[] front11(int[] a, int[] b) {
  if (a.length==0 && b.length==0) {
     int[] temp1 = {};
     return temp1;
  }
  int[] temp = (a.length!=0 && b.length!=0) ? new int[2] : new int[1];
  if (a.length!=0) {
     temp[0] = a[0];
  } else {
     temp[0] = b[0];
  }
  if (b.length!=0 && temp.length>1) {
     temp[1] = b[0];
  }
  return temp;
}
