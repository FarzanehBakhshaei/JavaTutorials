// Given a string, return true if it ends in "ly". 
public boolean endsLy(String str) {
  int length = str.length();
  if (length < 2) {
     return false;
  }
  return (str.substring(length-2, length).equals("ly"));
}
