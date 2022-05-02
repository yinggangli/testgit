public class Solution {
    public int compare(String ver1, String ver2){
        int n = ver1.length();
        int m = ver2.length();
        int i = 0;
        int j = 0;
        while (i < n || j < m){
            int num1 = 0;
            int num2 = 0;
            while (i < n && ver1.charAt(i) != '.'){
                num1 = num1 * 10 + ver1.charAt(i++) - '0';
            }
            while (j < m && ver2.charAt(j) != '.'){
                num2 = num2 * 10 + ver2.charAt(j++) - '0';
            }
            if (num1 > num2) return 1;
            else if ((num1 < num2)) return -1;
            i ++;
            j ++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.compare("1.09", "1.01"));
        System.out.println(solution.compare("1.0", "1"));

    }
}
