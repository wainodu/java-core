package lab3;

import java.util.Scanner;

public class Task8 {
    static Scanner scanner = new Scanner(System.in);

    static class Node {
        Node next;
        int data;

        Node() {
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    class testLinkedList {
        private Node head;
        private Node tail;

        void CreateHead() {
            System.out.println("Введите количество элементов: ");
            int a = scanner.nextInt();
            //Node[] linkCollector = new Node[a];
            //this.head = new Node(data, head);
            //Node x = this.head;
            for (int i = 0; i < a; i++) {
                System.out.println("Введите элемент списка: ");
                int b = scanner.nextInt();
                this.head = new Node(b, head);
//                linkCollector[i] = new Node(b);
//                x.next = linkCollector[i];
//                x = x.next;
            }
        }

        void CreateTail() {
            System.out.println("Введите количество элементов: ");
            int a = scanner.nextInt();
            Node search = head;
            for (int i = 0; i < a; i++) {
                while (search.next != null) {
                    search = search.next;
                }
                System.out.println("Введите элемент списка: ");
                int b = scanner.nextInt();
                search.next = new Node(b);
            }
        }

        @Override
        public String toString() {
            Node a = head;
            String x = "";
            while (a != null) {
                x += (a.data + " ");
                a = a.next;
            }
            return x;
        }

        void AddFirst(int data) {
            this.head = new Node(data, head);
        }

        void AddLast(int data) {
            Node search = head;
            while (search.next != null) {
                search = search.next;
            }
            search.next = new Node(data);
        }

        void Insert(int data, int number) {
            Node newNode = new Node(data);
            Node search = head;
            int k = 1;
            while ((k < (number - 1))) {
                if (search.next == null) {
                    newNode.next = null;
                    search.next = newNode;
                    return;
                }
                search = search.next;
                k++;
            }
            newNode.next = search.next;
            search.next = newNode;
        }

        void RemoveFirst() {
            this.head = null;
        }

        void RemoveLast() {
            Node search = head;
            while (search.next.next != null) {
                search = search.next;
            }
            search.next = null;
        }

        void Remove(int number) {
            Node search = head;
            int k = 1;
            while ((k < (number - 1))) {
                search = search.next;
                k++;
            }
            search.next = search.next.next;
            search.next.next = null;
        }

        void createHeadRec() {
            System.out.println("Введите элемент списка(если это все, введите 01): ");
            int a = scanner.nextInt();
            if (a == 01) {
                return;
            } else {
                this.head = new Node(a, head);
                createHeadRec();
            }
        }

        void createTailRec() {
            Node search = head;
            while (search.next != null) {
                search = search.next;
            }
            System.out.println("Введите элемент списка(если это все, введите 01): ");
            int a = scanner.nextInt();
            if (a == 01) {
                return;
            } else {
                search.next = new Node(a);
                createTailRec();
            }
        }

        String toStringRec() {
            Node search = head;
            String x = "";
            if (search != null) {
                x += (search.data + " ");
                search = search.next;
                toStringRec();
            }
            return x;
        }
    }
}



