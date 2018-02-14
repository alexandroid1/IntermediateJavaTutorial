package com.globallogic.StackQueueHashset;

import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {

        PriorityQueue<String> q = new PriorityQueue<String>();

        q.offer("first");
        q.offer("second");
        q.offer("third");

        System.out.printf("%s ", q);
        System.out.println();

        // The element() and peek() methods return, but do not remove, the head of the queue.
        System.out.printf("%s ", q.peek()); // first
        System.out.println();

        // The remove() and poll() methods remove and return the head of the queue.
        q.poll();
        System.out.printf("%s ", q);
    }
}
