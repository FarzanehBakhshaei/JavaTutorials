// Given a string, return a string where for every char in the original, there are two chars. 
public String doubleChar(String str) {
  String doubleChar = "";
  for (int i=0; i<str.length(); i++) {
     doubleChar = doubleChar + str.charAt(i) + str.charAt(i);
  }
  return doubleChar;
}
