class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}

The code creates an empty container called `result` to store the final merged word. It then starts with an index value `i = 0`,
which represents the current position in both words. A `while` loop keeps running as long as there are characters left in either word. 
Inside the loop, the code first checks whether `word1` has a character at position `i`; 
if it does, that character is added to `result`. Next, it checks whether `word2` has a character at the same position and adds it if available.
After processing both words at that position, `i` is increased by 1 so the next pair of characters can be processed. 
This continues until all characters from both words have been added. Finally, the contents of `result` are converted into a string and returned as the merged output. 
For example, with `word1 = "abc"` and `word2 = "pqr"`, the code adds `a`, then `p`, then `b`, then `q`, then `c`, then `r`, producing `"apbqcr"`.
