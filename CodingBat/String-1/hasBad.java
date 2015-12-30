// Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
// such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
public boolean hasBad(String str) {
  if(str.length() < 3) {
     return false;
  }
  if(str.length() == 3){
     return str.substring(0, 3).equals("bad");
  }
  return str.substring(0, 3).equals("bad") || 
         str.substring(1, 4).equals("bad");
}
