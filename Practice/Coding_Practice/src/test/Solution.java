package test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/***
 * Given a matrix of character.
 * find the possible to travel to the destination from source character.
 * Acceptable path ir right(R) and down(D) only
 */
public class Solution {

    static String string;

    // Complete the find_path function below.
    static String getPath(List<List<String>> matrix, String target_string, int i, int j, String str, int index){
         if(index ==target_string.length()){
             string=str;
             return str;
         }
         if(matrix.get(0).size()-1>=j+1) {
             if (matrix.get(i).get(j + 1).equals(Character.toString(target_string.charAt(index)))) {
                  getPath(matrix, target_string, i, j + 1, str + "R", index + 1);
             }
         }
         if(matrix.size()-1>=i+1) {
             if (matrix.get(i + 1).get(j).equals(Character.toString(target_string.charAt(index)))) {
                  getPath(matrix, target_string, i+1, j, str + "D", index + 1);
             }
         }
         return  str;

    }
    static String find_path(List<List<String>> matrix, String target_string) {
          if (matrix.get(0).get(0).equals(Character.toString(target_string.charAt(0)))) {
            getPath(matrix, target_string, 0, 0, "", 1);
            if (string!=null){
                return string;
            }else {
                return "NO PATH";
            }
        }
        return "NO PATH";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int matrixRows = Integer.parseInt(bufferedReader.readLine().trim());
        int matrixColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> matrix = new ArrayList<>();

        IntStream.range(0, matrixRows).forEach(i -> {
            try {
                matrix.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        String target_string = bufferedReader.readLine();

        String res = find_path(matrix, target_string);
        System.out.println(res);
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}