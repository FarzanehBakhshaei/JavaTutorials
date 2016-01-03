// Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
// Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp". 
public String zipZap(String str) {
  String result = "";
  for (int i=0; i<str.length(); i++) {
     if (i<str.length()-2 && str.charAt(i)=='z' && str.charAt(i+2)=='p') {
        result += "zp";
        i += 2;
     } else {
        result += str.substring(i, i+1);
     }
  }
  return result;
}
