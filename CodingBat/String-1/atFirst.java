// Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars. 
public String atFirst(String str) {
  String first = (str.length()>=1) ? (str.substring(0, 1)) : "@";
  String second = (str.length()>=2) ? (str.substring(1, 2)) : "@";
  return first + second;
}
