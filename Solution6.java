package Theme2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution6{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        int[] durability = new int[n];

        String[] durabilityInput = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            durability[i] = Integer.parseInt(durabilityInput[i]);
        }

        int k = Integer.parseInt(reader.readLine());
        int[] pressCount = new int[n];

        String[] pressesInput = reader.readLine().split(" ");
        for (int i = 0; i < k; i++) {
            int key = Integer.parseInt(pressesInput[i]);
            pressCount[key - 1]++;
        }

        for (int i = 0; i < n; i++) {
            if (pressCount[i] > durability[i]) {
                writer.write("YES\n");
            } else {
                writer.write("NO\n");
            }
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}

