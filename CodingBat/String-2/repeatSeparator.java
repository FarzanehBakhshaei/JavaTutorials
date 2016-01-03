// Given two strings, word and a separator sep, return a big string made of count occurrences of the word, 
// separated by the separator string. 
public String repeatSeparator(String word, String sep, int count) {
  String res = "";
  for(int i=0; i<count; i++) {
     res = res + word;
     if(i<count-1)
       res = res + sep;
  }
  return res;
}
