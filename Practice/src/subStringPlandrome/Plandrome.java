package subStringPlandrome;

public class Plandrome {
    public String longestPalindrome(String A) {

        //length of string
        int n = A.length();
        //boolean of size n*n
        boolean table[][] = new boolean[n][n];
        //intial maximu length of plandrome string is 1
        int maxLength = 1;
        //diagonal element is true
        for (int i = 0; i < n; ++i)
            table[i][i] = true;

        int start = 0;
        //checking for continous repeatation of char
        for (int i = 0; i < n - 1; ++i) {
            if (A.charAt(i) == A.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        for (int k = 3; k <= n; ++k) {
            for (int i = 0; i < n - k + 1; ++i)
            {

                int j = i + k - 1;

                if (table[i + 1][j - 1] && A.charAt(i) ==
                        A.charAt(j)) {
                    table[i][j] = true;

                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        String str=A.substring(start, start + maxLength);
        return str;
    }
}
