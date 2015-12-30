// Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2. 
public String right2(String str) {
  int length = str.length();
  return str.substring(length-2, length) + str.substring(0, length-2);
}
