// Given three ints, a b c, return true if one of them is 10 or more less than one of the others. 
public boolean lessBy10(int a, int b, int c) {
  //return (a>=b+10 || a>=c+10 || b>=a+10 || b>=c+10 || c>=a+10 || c>=b+10);
  return (Math.abs(a - b) >= 10 ||
          Math.abs(a - c) >= 10 ||
          Math.abs(b - c) >= 10);
}
