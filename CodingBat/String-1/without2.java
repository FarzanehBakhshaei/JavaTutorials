// Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning,
// so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "".
// Otherwise, return the original string unchanged. 
public String without2(String str) {
  int length = str.length();
  if (length == 2) {
     return "";
  }
  
  if (length>2 && str.substring(0, 2).equals(str.substring(length-2, length))) {
     return str.substring(2, length);
  }
  
  return str;
}
