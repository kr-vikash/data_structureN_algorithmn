package HackerRank.Graph.RoadNLibrary;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the roadsAndLibraries function below.
    public static long count=0;
    public static List<List<Integer>> adjList;
    public static  boolean[] visited;

    static long roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities) {

        visited=new boolean[n];
        adjList= new ArrayList<>();
        long cost=0;
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            if(cities.length>i){
                adjList.get(cities[i][0]-1).add(cities[i][1]-1);
                adjList.get(cities[i][1]-1).add(cities[i][0]-1);
            }
        }
        for(int i=0;i<n;i++){
            count=0;
            if(!visited[i]){
                //visited[i]=true;
                dfs(i);
                if(c_lib>c_road){
                    cost+=c_lib +c_road*(count-1);
                }else{
                    cost+=c_lib*count;
                }
            }
        }
        return cost;

    }
    private static void dfs(int i) {
        visited[i] = true;
        count++;

        List<Integer> list = adjList.get(i);
        for (int j = 0; j < list.size(); j++) {
            if (!visited[list.get(j)]) {
                dfs(list.get(j));
            }
        }
    }


    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        final FileReader file=new FileReader("/home/view/IdeaProjects/Practice/src/HackerRank/Graph/RoadNLibrary/in.txt");
        final Scanner scanner = new Scanner(file);

        int q = Integer.parseInt(scanner.nextLine());
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        long count1=1;
        for (int qItr = 0; qItr < q; qItr++) {
            String[] nmC_libC_road = scanner.nextLine().split(" ");
            count1++;

            int n = Integer.parseInt(nmC_libC_road[0]);

            int m = Integer.parseInt(nmC_libC_road[1]);

            int c_lib = Integer.parseInt(nmC_libC_road[2]);

            int c_road = Integer.parseInt(nmC_libC_road[3]);

            int[][] cities = new int[m][2];

            for (int i = 0; i < m && scanner.hasNext(); i++) {
//                if(i==66400) {
//                    System.out.println(count1);
//                    if(scanner.hasNext()){
//                        System.out.println(i);
//                    }
//                }
                String str=scanner.nextLine();
                count1++;
                String[] citiesRowItems = str.split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 2; j++) {
                    int citiesItem = Integer.parseInt(citiesRowItems[j]);
                    cities[i][j] = citiesItem;
                }
            }

            long result = roadsAndLibraries(n, c_lib, c_road, cities);
            System.out.println(result);

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();

    }
}
