// Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
// and otherwise return the string unchanged. 
public String withoutX(String str) {
  int length = str.length();
  if (length == 0) {
     return "";
  }
  String first = (str.substring(0, 1).equals("x")) ? "" : str.substring(0, 1);
  String last = (!str.substring(length-1, length).equals("x") && length>1) ? str.substring(length-1, length) : "";
  String mid = (length >= 3) ? str.substring(1, length-1) : "";
  return first + mid + last;
}
