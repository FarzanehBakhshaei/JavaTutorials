// A sandwich is two pieces of bread with something in between.
// Return the string that is between the first and last appearance of "bread" in the given string,
// or return the empty string "" if there are not two pieces of bread. 
public String getSandwich(String str) {
  int len = str.length();
  int firstb = -1;
  int lastb = -1;
  if(len<=10) return "";
  for (int i=0; i<len-4; i++) {
     if (str.substring(i, i+5).equals("bread")) {
        if (firstb==-1) {
           firstb = i;
        } else {
           lastb = i;
        }
     }
  }
  if (firstb != -1 && lastb != -1)
     return str.substring(firstb+5, lastb);
  return "";
}
