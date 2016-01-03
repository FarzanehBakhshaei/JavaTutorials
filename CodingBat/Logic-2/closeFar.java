// Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
// while the other is "far", differing from both other values by 2 or more. 
public boolean closeFar(int a, int b, int c) {
  if (Math.abs(a - b) > 1  && Math.abs(a - c) > 1) 
     return false;
     
  if (Math.abs(a - b) <= 1 && Math.abs(a - c) <= 1)
     return false;
     
  return (Math.abs(b - c) >= 2);
}
