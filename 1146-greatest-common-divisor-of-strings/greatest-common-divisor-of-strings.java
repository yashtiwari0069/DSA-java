class Solution {
    public String gcdOfStrings(String str1, String str2) {
      if(!(str1+str2).equals(str2+str1))
      return "";

      int gcd = gcd(str1.length(),str2.length());
      return str1.substring(0,gcd); 
    }
    private int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a%b);
    }
}









Summary of the Code

Check if a common divisor string exists

if (!(str1 + str2).equals(str2 + str1))
    return "";
If str1 + str2 is not equal to str2 + str1, the strings are not built from the same repeating pattern.
Return "" (empty string).

Find the GCD of the string lengths

int gcd = gcd(str1.length(), str2.length());
The length of the largest common divisor string must be the GCD of the two lengths.

Return the prefix of length GCD

return str1.substring(0, gcd);
substring(0, gcd) takes characters from index 0 up to (but not including) index gcd.
This prefix is the largest string that can divide both strings.

GCD helper function

private int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
}
Uses the Euclidean Algorithm.
Keeps calling gcd(b, a % b) until b becomes 0.
Returns the greatest common divisor of the two lengths.
