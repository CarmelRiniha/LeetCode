class Solution {
public char[] reverseString(char[] s) {
    int n = s.length;
    char[] m = new char[n];
    for (int i = 0; i < n; i++) {
        m[i] = s[n - 1 - i];
    }
    System.arraycopy(m, 0, s, 0, n); 
    return s;
}



}