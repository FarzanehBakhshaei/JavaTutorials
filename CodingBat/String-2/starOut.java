// Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and
// right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad". 
public String starOut(String str) {
  int length = str.length();
  String res = "";
  for(int i=0; i<length; i++) {
     // delete its left char
     if (str.charAt(i)=='*'){
        if (i>0 && str.charAt(i-1)!='*') {
           res = res.substring(0, res.length()-1);
        }
     } else if ((i>0 && str.charAt(i-1)!='*') || (i==0)) {
        res += str.charAt(i);
     }
  }
  return res;
}
/* public String starOut(String str) {
  int length = str.length();
  String res = "";
  for(int i=0; i<length; i++) {
     if (str.charAt(i)=='*') {
        // delete its left char
        if (i>0 && res.length()>0) {
           res = res.substring(0, res.length()-1);
        }
        // delete all stars immediately after it and its right char
        for(int j=i+1; j<length; j++) {
           i++;
           if (str.charAt(j)!='*') {
              break;
           }
        }
     } else {
        res += str.charAt(i);
     }
  }
  return res;
}
*/
