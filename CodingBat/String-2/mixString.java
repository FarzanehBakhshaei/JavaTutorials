// Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, 
// the second char of b, and so on. Any leftover chars go at the end of the result. 
public String mixString(String a, String b) {
  int al = a.length();
  int bl = b.length();
  int maxl = Math.max(al, bl);
  String result = "";
  for (int i=0; i<maxl; i++) {
     if (i<al) result += a.charAt(i);
     if (i<bl) result += b.charAt(i);
  }
  return result;
}
