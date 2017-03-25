//Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard.
//Example 1:
//Input: ["Hello", "Alaska", "Dad", "Peace"]
//Output: ["Alaska", "Dad"]

import java.util.*;

public class Solution {
    public String[] findWords(String[] words) {
        //define 3 string for checking characters
        String line1 = "qwertyuiop";
        String line2 = "asdfghjkl";
        String line3 = "zxcvbnm";
        
        //defien a List to store the result value
        List<String> result = new ArrayList<String>();
        
        // convert words to proper format --- lowerCase
        String[] wordsLower = new String[words.length];
        for(int i = 0; i < words.length; i++) wordsLower[i] = words[i].toLowerCase();
        
        for(int i = 0; i < words.length; i++){ //iterate the input string array
            
            //if first character in this string in line1
            if (line1.contains(String.valueOf(wordsLower[i].charAt(0)))) {  //iterate this string, if all characters are in line1, append this string into result
                boolean state = true;
                for(int j = 1; j < wordsLower[i].length(); j++){
                    if(!(line1.contains(String.valueOf(wordsLower[i].charAt(j))))) {
                        state = false;
                        break;
                    }
                }
                if(state == true) result.add(words[i]);
            }
            
            //if first character in this string in line2
            if (line2.contains(String.valueOf(wordsLower[i].charAt(0)))) {  
                boolean state = true;
                for(int j = 1; j < wordsLower[i].length(); j++){
                    if(!(line2.contains(String.valueOf(wordsLower[i].charAt(j))))) {
                        state = false;
                        break;
                    }
                }
                if(state == true) result.add(words[i]);
            }
            
              //if first character in this string in line3
            if (line3.contains(String.valueOf(wordsLower[i].charAt(0)))) {  
                boolean state = true;
                for(int j = 1; j < wordsLower[i].length(); j++){
                    if(!(line3.contains(String.valueOf(wordsLower[i].charAt(j))))) {
                        state = false;
                        break;
                    }
                }
                if(state == true) result.add(words[i]);
            }
        }
        
        //convert ArrayList to String array
        String[] resultarray = new String[result.size()];
        for(int i = 0; i < result.size(); i++) resultarray[i] = result.get(i);
        return resultarray;
    }
}
