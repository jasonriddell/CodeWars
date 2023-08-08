// https://www.codewars.com/kata/591cac98a6007e87d900013a

class  ChangeCase {   
     
  public static String toSentenceCase(String string){
        boolean capitalizeNeeded = true;
        boolean sentenceEnd = true;
        boolean whiteSpace = false;

        char[] chars = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (capitalizeNeeded && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                capitalizeNeeded = false;
                sentenceEnd = false;
                whiteSpace = false;
            } else {
                chars[i] = Character.toLowerCase(chars[i]);
                if (chars[i] == '.' || chars[i] == '?' || chars[i] == '!') {
                    capitalizeNeeded = true;
                    sentenceEnd = true;
                  whiteSpace = true;
                } else {
                if (chars[i] == ' '){
                  whiteSpace = true;
                }
                if (!Character.isLetter(chars[i]) && (!(chars[i] == ' ') || (chars[i] == '.') || (chars[i] == '?') || (chars[i] == '!'))){
                   capitalizeNeeded = false;
                   sentenceEnd = false;
                }
                  if ((i-1>0) && (chars[i-1] == ' ' )){
                    if (sentenceEnd == false){
                      capitalizeNeeded = false;
                    }            
                }
              }
            }
        }
        return new String(chars);
  }
     
  public static String toLowerCase(String string){
    return string.toLowerCase();
  }
     
  public static String toUpperCase(String string){
    return string.toUpperCase();
  }
    
  public static String capitalizeEachWord(String string){
        boolean capitalizeNeeded = true;
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (capitalizeNeeded && Character.isAlphabetic(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                capitalizeNeeded = false;
            } else if (Character.isAlphabetic(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else {
                capitalizeNeeded = !Character.isDigit(chars[i]);
            }
        }
        return new String(chars);
  }
     
  public static String toToggleCase(String string) {
    char[] chars = string.toCharArray();
    for (int i = 0; i < chars.length; i++)
    {
      chars[i] = Character.isUpperCase(chars[i])
                ? Character.toLowerCase(chars[i])
                : Character.toUpperCase(chars[i]);
    }
    return new String(chars);
  }
}