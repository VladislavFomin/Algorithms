package Theme3;

import java.util.LinkedList;
import java.util.Queue;

class Solution2 {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public Solution2() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue1.offer(x);
    }

    public int pop() {
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }
        int topElement = queue1.poll();
        queue1 = queue2;
        queue2 = new LinkedList<>();
        return topElement;
    }

    public int top() {
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }
        int topElement = queue1.peek();
        queue2.offer(queue1.poll());
        queue1 = queue2;
        queue2 = new LinkedList<>();
        return topElement;
    }

    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}
