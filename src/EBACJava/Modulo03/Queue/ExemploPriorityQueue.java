package EBACJava.Modulo03.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class ExemploPriorityQueue {
    public static void main(String[] args) {
            //Ordenação Natural
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Short");
        queue.add("Leoncio");
        queue.add("Roberval");

        while (queue.size() != 0){
            System.out.println(queue.remove());
        }
    }
}
