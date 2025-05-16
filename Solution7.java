package Theme2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Solution7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstLine = reader.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int L = Integer.parseInt(firstLine[1]);

        int[][] sequences = new int[N][L];
        for (int i = 0; i < N; i++) {
            String[] line = reader.readLine().split(" ");
            for (int j = 0; j < L; j++) {
                sequences[i][j] = Integer.parseInt(line[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int median = getLeftMedian(sequences[i], sequences[j], L);
                writer.write(median + "\n");
            }
        }

        writer.flush();
        writer.close();
        reader.close();
    }

    public static int getLeftMedian(int[] a, int[] b, int L) {
        int i = 0, j = 0, count = 0;
        int result = 0;

        while (count <= L - 1) {
            if (i < L && (j >= L || a[i] <= b[j])) {
                result = a[i];
                i++;
            } else {
                result = b[j];
                j++;
            }
            count++;
        }

        return result;
    }
}

