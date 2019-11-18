package com.company;

import java.util.Scanner;

public class Question5 {

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

    void removeDuplicate() {
        Node current = head;
        while (current != null) {

            Node temp = current;
            while (temp.next != null) {
                if (current.data == temp.next.data) {
                    temp.next = temp.next.next;
                }
                else {
                    temp = temp.next;
                }
            }
            current = current.next;
        }
    }

    void printList() {
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Question5 obj = new Question5();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            obj.insert(scanner.nextInt());
        }
        obj.removeDuplicate();
        obj.printList();
    }
}
