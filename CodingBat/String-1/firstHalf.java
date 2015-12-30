// Given a string of even length, return the first half. So the string "WooHoo" yields "Woo". 
public String firstHalf(String str) {
  int length = str.length()/2;
  return str.substring(0, length);
}
