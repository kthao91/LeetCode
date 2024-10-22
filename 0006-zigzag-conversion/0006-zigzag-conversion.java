class Solution {
    public String convert(String s, int numRows) {
        // Edge case: if the number of rows is 1, return the original string immediately
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // Create a list of StringBuilders, one for each row, and preallocate capacity
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder(s.length() / numRows + 1); // Pre-allocate size
        }

        // Initialize the current row and direction variables
        int curRow = 0;
        boolean goingDown = false;

        // Traverse the string and place characters into appropriate rows
        for (char c : s.toCharArray()) {
            rows[curRow].append(c);

            // Reverse direction when hitting the top or bottom row
            if (curRow == 0 || curRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Update the current row based on direction
            curRow += goingDown ? 1 : -1;
        }

        // Concatenate all the rows into the final result
        StringBuilder result = new StringBuilder(s.length()); // Pre-allocate capacity
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}