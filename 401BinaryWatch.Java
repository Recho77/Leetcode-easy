/**
 * A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59).
 * Each LED represents a zero or one, with the least significant bit on the right.
 * Given a non-negative integer n which represents the number of LEDs that are currently on, return all possible times the watch could represent.
 * Example:
 * Input: n = 1
 * Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
 */

/**
 * Author: Recho
 * Java 1.7
 * 遍历所有可能的时间情况，在二进制表示中“1”的数量与给定数量相同时添加到结果集中。“1”的数量统计可用Integer中bitCount()方法
 */
 
import java.util.*;

public class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> time = new ArrayList<String>();
        
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 60; j++){
                if(Integer.bitCount(i) + Integer.bitCount(j) == num){
                    time.add(String.format("%d:%02d", i, j));
                }
            }
        }
        
        return time;
    }
}
