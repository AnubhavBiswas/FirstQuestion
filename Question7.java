package com.company;

import java.util.Scanner;

public class Question7 {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    void rotateList(int k) {
        Node current = head;
        for (int i = 1; i < k; i++) {
            current = current.next;
        }
        Node newHead = current.next;
        current.next = null;
        Node temp = newHead;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head = newHead;
    }

    void printList() {
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Question7 obj1 = new Question7();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            obj1.insert(scanner.nextInt());
        }

        System.out.print("Number of rotations: ");
        int k = scanner.nextInt();
        obj1.rotateList(k);
        obj1.printList();
    }
}
