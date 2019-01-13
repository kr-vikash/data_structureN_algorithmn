package HackerEarth.maxSubArraySum;

import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {

    static int getMaxSubArraySum(int a[], int start, int end) {
        int max = 0, tmp = 0;

        for (int i = start; i < end; i++) {
            tmp+= a[i];
            if (tmp < 0) {
                tmp = 0;
            }else if (max < tmp)
                 max = tmp;
        }
        return max;
    }

    public static long getSum(int ar[], int n) {
        long sum = 0;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            set.add(ar[i]);

            for (int j = i + 1; j < n; j++) {
                set.add(getMaxSubArraySum(ar, i, j + 1));
            }
        }
        for (Integer it : set) {
            sum += it;
        }
        return sum;
    }

    public static void main(String args[]) throws Exception {

        //Scanner
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(getSum(ar, n));
    }
}
