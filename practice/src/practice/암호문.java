package practice;

import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;
}

class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    public DoublyLinkedList() {
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    void addData(int i, int data) {
        if (i < 0 || i > size) {
            System.out.println("삽입 불가");
            return;
        }
        size++;

        Node curr = head;

        for (int k = 0; k < i; k++) {
            curr = curr.next;
        }

        Node newNode = new Node();
        newNode.data = data;

        newNode.next = curr.next;
        newNode.prev = curr;

        curr.next.prev = newNode;
        curr.next = newNode;
    }

    void removeData(int i) {
        if (i < 0 || i >= size) {
            System.out.println("삭제 불가");
            return;
        }

        size--;

        Node rmNode = head.next;

        for (int k = 0; k < i; k++) {
            rmNode = rmNode.next;
        }

        rmNode.prev.next = rmNode.next;
        rmNode.next.prev = rmNode.prev;
    }

    void printReverse() {
        Node curr = tail.prev;
        String str = "";
        while (curr != head) {
            str = "<-" + curr.data + str;
            curr = curr.prev;
        }
        System.out.println(str);
    }

    void print() {
        Node curr = head.next;
        String str = "";
        int i = 0;
        while (i<10) {
            str = str + curr.data + " ";
            curr = curr.next;
            i++;
        }
        System.out.println(str);
    }
}

public class prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            DoublyLinkedList list = new DoublyLinkedList();

            int N = sc.nextInt();

            for (int i = 0; i < N; i++) {
                list.addData(i, sc.nextInt());
            }

            int M = sc.nextInt();
            
            for (int i = 0; i < M; i++) {
            	String command = sc.next();
            	if(command.equals("I")) {
                	int x = sc.nextInt();
                	int y = sc.nextInt();

                	for (int j = 0; j < y; j++) {
                		list.addData(x + j, sc.nextInt());
                	}
                }
                else if(command.equals("D")) {
                	int x = sc.nextInt();
                	int y = sc.nextInt();
                	
                	for(int j = 0; j < y; j++) {
                		list.removeData(x);
                	}
                }
                else if(command.equals("A")) {
                	int y = sc.nextInt();
                	for(int j = 0; j<y; j++) {
                		list.addData(list.size, sc.nextInt());
                	}
                }
                
            }
            System.out.print("#" + test_case + " ");
            list.print();
        }
        sc.close();
    }
}
