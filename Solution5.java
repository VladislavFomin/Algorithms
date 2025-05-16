package Theme2;

import java.util.*;

public class Solution5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().trim().split(" ");
        int n = input.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            if (maxHeap.size() < 3) {
                maxHeap.offer(num);
            } else if (num > maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.offer(num);
            }

            if (minHeap.size() < 2) {
                minHeap.offer(num);
            } else if (num < minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(num);
            }
        }

        List<Integer> top3 = new ArrayList<>(maxHeap);
        Collections.sort(top3);
        int max1 = top3.get(0), max2 = top3.get(1), max3 = top3.get(2);

        List<Integer> bottom2 = new ArrayList<>(minHeap);
        Collections.sort(bottom2);
        int min1 = bottom2.get(0), min2 = bottom2.get(1);

        long product1 = (long) max1 * max2 * max3;
        long product2 = (long) min1 * min2 * max3;

        if (product1 >= product2) {
            System.out.println(max1 + " " + max2 + " " + max3);
        } else {
            System.out.println(min1 + " " + min2 + " " + max3);
        }
    }
}
