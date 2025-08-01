// Last updated: 8/1/2025, 10:53:09 AM
class Solution {
    public int romanToInt(String s) {

        int total = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for(int i = 0 ; i < s.length(); i++){
            System.out.println(s.charAt(i));
            System.out.println("Total "+ total);

            if (i + 1 < s.length() && s.charAt(i) == 'I' && (s.charAt(i+1) == 'X' || s.charAt(i+1) == 'V')) {
                total -= 1;
                System.out.println("Sub -1 Total "+ total);
            }
            else if((i+1 < s.length() && s.charAt(i) == 'X') && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')){
                total -= 10;
                System.out.println("Sub -10 Total "+ total);
            }
            else if((i+1 < s.length() && s.charAt(i) == 'C') && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')){
                total -= 100;
                System.out.println("Sub -100 Total "+ total);
            }
            else{
                total += map.get(s.charAt(i));
            }
        }
        return total;

    }
}