class Solution {
    public String reverseStr(String s, int k) {
        char[] array =  s.toCharArray();
        int i=0, n = array.length;
        while(i<n) {
            int j = Math.min(i+k-1, n-1);
            reverse(array, i, j);
            i = i + 2*k;
        }
        return new String(array);
    }

    // For Reverse Element
    public void reverse(char[] array, int i, int j) {
        while(i<j) {
            char temp = array[i]; 
            array[i] = array[j];
            array[j] = temp; 
            i++; j--;
        }
    }
}