//Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard.
//Example 1:
//Input: ["Hello", "Alaska", "Dad", "Peace"]
//Output: ["Alaska", "Dad"]

import java.util.*;

public class Solution {
    public String[] findWords(String[] words) {
       //define 3 string for checking characters
        String[] line = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        
        //defien a List to store the result value
        List<String> result = new ArrayList<String>();
        
        // convert words to proper format --- lowerCase
        String[] wordsLower = new String[words.length];
        for(int i = 0; i < words.length; i++) wordsLower[i] = words[i].toLowerCase();
        
        for (int k = 0; k < line.length; k++){
            for(int i = 0; i < words.length; i++){ 
                  //iterate this string, if all characters are in line[k], add this string into result
                   if (line[k].contains(String.valueOf(wordsLower[i].charAt(0)))) {    //note: String.contains(TYPE:CharSequence)
                    boolean state = true;
                    for(int j = 1; j < wordsLower[i].length(); j++){
                        if(!(line[k].contains(String.valueOf(wordsLower[i].charAt(j))))) {
                            state = false;
                            break;
                        }
                    }
                if(state == true) result.add(words[i]);
                }
            }
        }
        
        //convert ArrayList to String array
        String[] resultarray = new String[result.size()];
        for(int i = 0; i < result.size(); i++) resultarray[i] = result.get(i);
        return resultarray;
    }
}
