// Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, 
// so the difference between small and medium is the same as the difference between medium and large. 
public boolean evenlySpaced(int a, int b, int c) {
  int s = Math.min(Math.min(a, b), c);
  int l = Math.max(Math.max(a, b), c);
  int m = (a+b+c) - l - s;
  
  return (Math.abs(m - s)==Math.abs(l - m));
}
