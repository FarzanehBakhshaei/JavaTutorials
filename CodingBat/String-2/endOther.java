// Given two strings, return true if either of the strings appears at the very end of the other string,
// ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). 
public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();
  int al = a.length();
  int bl = b.length();
  
  if (al>=bl && a.substring(al-bl, al).equals(b))
     return true;
  if (bl>=al && b.substring(bl-al, bl).equals(a)) 
     return true;
  return false;
}
