class Solution {
    public boolean isPalindrome(int x) {
        //taking care of some edge cases 
        //if less then zero cant be a palindrome
        //if it start with 0 or end in 0 cant be palindrome
        if(x < 0 || x != 0 && x%10 == 0 ){
            return false;
        }
        //need only half to compare 
        int half = 0;

        //half mod 10 to get last number and add it to half
        //half*10 to move over to the next place
        while(x > half){
            half = (half * 10) + (x % 10);
            x = x / 10;
        }
        //if its a odd number / half by 10
        return x == half || x == half / 10;
    }
}