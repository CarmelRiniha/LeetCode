
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;  
        }
        int n = x;
        int r = 0;
        while (x != 0) {
            int d = x % 10;            
            r = r * 10 + d; 
            x = x / 10;                     
        }
        return n == r; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(x);
        System.out.println(result);
    }
}
