// Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the 
// left and right of the "xyz" must differ by at most one. This problem is harder than it looks. 
public boolean xyzMiddle(String str) {
  int length = str.length();
  int hlen = length/2;
  if (length<3) 
     return false;
  if (str.substring(hlen-1, hlen+2).equals("xyz")) 
     return true; 
  if (length>3 && length%2==0 && str.substring(hlen-2, hlen+1).equals("xyz"))
     return true;
  if (length>3 && length%2==0 && str.substring(hlen, hlen+3).equals("xyz"))
     return true;
  return false;
}
