// Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, 
// except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string.
// So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1. 
public String startWord(String str, String word) {
  int strLength = str.length();
  int wordLength = word.length();
  String alternativ = "";
  if(wordLength == 1 && strLength >= 1){
     alternativ = str.substring(0, 1);
  } else if (strLength >= 1) { // && wordLength > 1
     alternativ = str.substring(0, 1) + word.substring(1, wordLength);
  }
  
  if(strLength >= wordLength && str.substring(0, wordLength).equals(alternativ)) {
     return alternativ;  
  }
  
  return "";
}
