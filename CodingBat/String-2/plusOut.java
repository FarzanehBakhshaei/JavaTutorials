// Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses("+"),
// except for appearances of the word string which are preserved unchanged. 
public String plusOut(String str, String word) {
  int sl = str.length();
  int wl = word.length();
  String res = "";
  for(int i=0; i<sl; i++) {
     if (i<=sl-wl && str.substring(i, i+wl).equals(word)) {
        res = res + word;
        i += wl-1;
     } else {
        res += "+";
     }
  }
  return res;
}
