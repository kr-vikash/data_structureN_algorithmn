package HackerEarth.hecticgame;

import java.util.*;


class TestClass {
    static class task {
        int start;
        int end;

        task(int s, int e) {
            start = s;
            end = e;
        }
    }

    static String getWinner(List<task> list, int n, int maxStart) {
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        int count = 0;
        int flag = 0;
        int c = 1;

        while (!list.isEmpty()) {
            int i = 0;
            count = 0;
            c = 1;

            while (i < list.size() && c <= maxStart) {
                if (list.get(i).start == c) {
                    count++;
                    c = list.get(i).end + 1;
                    list.remove(i);
                } else {
                    i++;
                }
            }
            if (flag == 0) {
                flag = 1;
                A.add(count);
            } else if (flag == 1) {
                flag = 0;
                B.add(count);
            }
        }

        int a = 0;
        int b = 0;
        for (int j = 0; j < A.size() - 1; j++) {
            if (j == 0) {
                a = A.get(j) ^ A.get(j + 1);
            } else {
                a = a ^ A.get(j + 1);
            }
        }
        for (int j = 0; j < B.size() - 1; j++) {
            if (j == 0) {
                b = B.get(j) ^ B.get(j + 1);
            } else {
                a = a ^ B.get(j + 1);
            }
        }
        if (a == b) {
            return "Tie";
        } else if (a > b) {
            return "Alice";
        } else {
            return "Bob";
        }
    }

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {

            int n = sc.nextInt();
            List<task> list = new ArrayList<>();
            Set<Integer> set=new HashSet<>();
            int maxStart = 0;
            for (int i = 0; i < n; i++) {
                int s = sc.nextInt();
                int e = sc.nextInt();
                set.add(s);
                list.add(new task(s, e));
                if (s > maxStart) {
                    maxStart = s;
                }

            }
            System.out.println(getWinner(list, n, maxStart));
        }
    }
}
