class Solution {
    public int strStr(String haystack, String needle) {
        
        if (needle.length() == 0){
            return 0;
        } 

        char[] hArr = haystack.toCharArray();
        char[] nArr = needle.toCharArray();

        for (int i = 0; i <= hArr.length - nArr.length; i++) {
            if (hArr[i] == nArr[0]) {
                boolean match = true;
                for (int j = 1; j < nArr.length; j++) {
                    if (hArr[i + j] != nArr[j]) {
                        match = false;
                        break;
                    }
                }
                if (match) return i;
            }
        }
        return -1;
    }
}
