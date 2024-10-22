class Solution {
    public String convert(String s, int numRows) {
        // Edge case: if the number of rows is 1, return the original string
        if (numRows == 1) {
            return s;
        }

        // Create a list of StringBuilder objects, one for each row
        StringBuilder[] rows = new StringBuilder[Math.min(numRows, s.length())];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new StringBuilder();
        }

        int curRow = 0;           // Start at the top row
        boolean goingDown = false; // This flag indicates the direction of traversal (up or down)

        // Traverse the string and append characters to the appropriate rows
        for (char c : s.toCharArray()) {
            rows[curRow].append(c);  // Add the character to the current row

            // Reverse the direction when we hit the top or bottom row
            if (curRow == 0 || curRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move to the next row: down if goingDown is true, up if false
            curRow += goingDown ? 1 : -1;
        }

        // Concatenate all rows to form the final result string
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}