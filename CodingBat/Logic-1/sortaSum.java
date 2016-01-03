// Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20. 
public int sortaSum(int a, int b) {
  return (a+b<10 || a+b>19) ? (a+b) : 20;
}
