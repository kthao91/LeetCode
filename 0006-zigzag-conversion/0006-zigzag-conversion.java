class Solution {
    public static String convert(String s, int numRows) {
        int len = s.length();
        
        // Edge cases: if numRows is 1 or the string is shorter than the number of rows
        if (numRows == 1 || numRows == len) {
            return s;
        }

        char[] ans = new char[len];  // Result array
        int count = 0;  // Counter for placing characters in the result array
        int inc = 2 * (numRows - 1);  // The main cycle length for zigzag

        // Iterate over each row
        for (int i = 0; i < numRows; i++) {
            int j = i;  // Start at the i-th index for the current row

            while (j < len) {
                ans[count++] = s.charAt(j);  // Place character from current row
                
                // For the first and last row, jump by the cycle length (inc)
                if (i == 0 || i == numRows - 1) {
                    j += inc;
                } 
                // For the intermediate rows, calculate both down and diagonal jumps
                else {
                    j += (inc - (2 * i));  // First step (downward in the zigzag)
                    
                    if (j < len) {  // Check if within bounds
                        ans[count++] = s.charAt(j);  // Place character
                        j += (2 * i);  // Second step (upward in the zigzag)
                    }
                }
            }
        }

        // Convert the character array back to a string and return the result
        return new String(ans);
    }
}
