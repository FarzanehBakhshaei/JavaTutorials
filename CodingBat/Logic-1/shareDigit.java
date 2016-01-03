// Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23.
public boolean shareDigit(int a, int b) {
  int at = a/10;
  int ao = a%10;
  int bt = b/10;
  int bo = b%10;
  return (at==bt || at==bo || ao==bt || ao==bo);
}
