// Given a string and a non-empty word string, return a string made of each char just before and just after every
// appearance of the word in the string. Ignore cases where there is no char before or after the word,
// and a char may be included twice if it is between two words. 
public String wordEnds(String str, String word) {
  int sl = str.length();
  int wl = word.length();
  String res = "";
  
  for (int i=0; i<sl-wl+1; i++) {     
     if (str.substring(i, i+wl).equals(word) && i>0) {
        res += str.charAt(i-1);
     }     
     if (str.substring(i, i+wl).equals(word) && i<sl-wl) {
        res += str.charAt(i+wl);
     }     
  }
  return res;
}
