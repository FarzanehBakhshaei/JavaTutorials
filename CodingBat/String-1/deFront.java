// Given a string, return a version without the first 2 chars. 
// Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks. 
public String deFront(String str) {    
  String result = "";
  int length = str.length();
  if(length >= 1 && str.charAt(0)=='a') {
     result += 'a';
  }
  if(length >= 2 && str.charAt(1)=='b') {
     result += 'b';
  }
  if(length >= 3) {
     result += str.substring(2, length);
  }
  return result;
}
