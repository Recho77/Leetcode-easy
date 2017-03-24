//The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
//Given two integers x and y, calculate the Hamming distance.

public class Solution {
    public int hammingDistance(int x, int y) {
       
      int XOR = x^y;
      int distance = Integer.bitCount(XOR);
        
        return distance;
        
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.hammingDistance(3,100));

    }
}
