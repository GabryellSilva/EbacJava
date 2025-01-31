package EBACJava.Modulo03.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExemploArrayDeque {
    public static void main(String[] args) {
        inserindoDaFila();
       removendoDaFila();
//        acessandoDaFila();
    }
    public static void inserindoDaFila(){
        System.out.println("ACESSANDO");
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Red");
        deque.add("Yellow");
        deque.add("Blue");
        deque.add("Orange");


        Deque<String> deque2 = new ArrayDeque<>();
        deque2.add("Green");
        deque2.add("Black");

        deque.addAll(deque2);

        System.out.println(deque);
        System.out.println(deque.contains("Red"));
        System.out.println(deque2.contains("Black"));
        System.out.println(deque2.containsAll(deque2));

        System.out.println("Output of element: "+ deque.element());
        System.out.println("Get first element using getFirst: "+ deque.getFirst());
        System.out.println("Get last element using getLast: "+ deque.getLast());
        System.out.println("Output of peek: "+ deque.peek());
        System.out.println("Get first element using PeekFirst: "+ deque.peekFirst());
        System.out.println("Get last element using PeekLast: "+ deque.peekLast());
        System.out.println();
    }
    public static void removendoDaFila(){
        System.out.println("REMOVENDO");
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Red");
        deque.add("blue");
        deque.add("Yellow");

        Deque<String> deque2 = new ArrayDeque<>();
        deque2.add("Brow");
        deque2.add("Glay");
        deque2.add("Cian");

        deque.addAll(deque2);

        System.out.println("Elements in the ArrayDeque: "+deque);
        String remove = deque.remove();
        deque.remove("blue");

        System.out.println("Elements in the ArrayDeque after remove: "+deque);

        deque.removeFirst();
        deque.removeLast();

        System.out.println("Elements in the ArrayDeque after removeFirst and removeLast" + deque);


        deque.poll();

        System.out.println("Elements in the ArrayDeque afther Poll: "+ deque);

        deque.pollFirst();
        deque.pollLast();

        System.out.println("Elements in the ArrayDeque afther PollFirst and PollLast: "+ deque);

        deque.retainAll(deque2);

        System.out.println("Elements in the ArrayQue After retrainAll"+ deque);

        deque.removeAll(deque2);

        System.out.println("Elements in the ArrayDeque after RemoveAll"+ deque);

        System.out.println();

    }
}
