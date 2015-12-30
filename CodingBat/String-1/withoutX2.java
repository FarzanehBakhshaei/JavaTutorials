// Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, 
// and otherwise return the string unchanged. This is a little harder than it looks. 
public String withoutX2(String str) {
  int length = str.length();
  if (length == 0) {
     return "";
  }
  String first = (str.substring(0, 1).equals("x")) ? "" : str.substring(0, 1);
  String second = (length>1 && !str.substring(1, 2).equals("x")) ? str.substring(1, 2) : "";
  String last = (length >= 3) ? str.substring(2, length) : "";
  return first + second + last;
}
