package DoublyLinkedList;

public class Basics {

    // Exception for invalid positions
    public class InvalidPositionException extends Exception {
        public InvalidPositionException(String message) {
            super(message);
        }
    }

    // Creation of Node for Doubly Linked List
    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;
    int size;

    // Append - O(1)
    public boolean insert(int data) {
        Node newNode = new Node(data);

        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        return true;
    }

    // Prepend - O(1)
    public boolean prepend(int data) {
        Node newNode = new Node(data);

        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
        return true;
    }

    // Insert at a specific position - O(n)
    public boolean insertInBetween(int data, int position) throws InvalidPositionException {
        if (position < 0 || position > size) {
            throw new InvalidPositionException("Invalid position: " + position);
        }

        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
        } else if (position == size) {
            insert(data);
        } else {
            Node temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
        size++;
        return true;
    }

    // Delete at a particular index - O(n)
    public Integer deleteAtIndex(int position) throws InvalidPositionException {
        if (position < 0 || position >= size) {
            throw new InvalidPositionException("Invalid position: " + position);
        }

        Integer deletedData = null;

        if (position == 0) {
            deletedData = head.data;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        } else if (position == size - 1) {
            deletedData = tail.data;
            tail = tail.prev;
            tail.next = null;
        } else {
            Node temp = head;
            for (int i = 0; i < position; i++) {
                temp = temp.next;
            }
            deletedData = temp.data;
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        size--;
        return deletedData;
    }

    // Get the size of the list
    public int size() {
        return size;
    }

    // Delete the first element - O(1)
    public boolean deleteFromFirst() {
        if (head == null) {
            return false;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;
        return true;
    }

    // Delete the last element - O(1)
    public boolean deleteFromLast() {
        if (tail == null) {
            return false;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
        return true;
    }

    // Delete an element with specific data - O(n)
    public boolean deleteanElement(int data) {
        if (head == null) {
            return false;
        }

        if (head.data == data) {
            deleteFromFirst();
            return true;
        }

        if (tail.data == data) {
            deleteFromLast();
            return true;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                temp.prev.next = temp.next;
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
                size--;
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    // Checks if the list is empty - O(1)
    public boolean isEmpty() {
        return head == null && tail == null;
    }

    // Print the list - O(n)
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        StringBuilder sb = new StringBuilder("[");
        while (temp != null) {
            sb.append(temp.data).append(temp.next != null ? " , " : "");
            temp = temp.next;
        }
        sb.append("]");
        System.out.println(sb);
    }

    // Reverse the list - O(n)
    public void reverse() {
        if (head == null || head == tail) {
            return;
        }

        Node temp = null;
        Node current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    // Search for an element - O(n)
    public int search(int data) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == data) {
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
    }

    // Main driver class
    public static void main(String[] args) {
        Basics list = new Basics();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.prepend(50);
        list.prepend(60);

        try {
            list.insertInBetween(15, 1);
        } catch (InvalidPositionException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Given List");
        list.printList();
        System.out.println("Size of List: " + list.size());

        list.reverse();
        System.out.println("\nReversed List");
        list.printList();

        System.out.println("\nAfter Deletion List");
        list.deleteanElement(10);
        list.deleteFromFirst();
        list.deleteFromLast();

        try {
            list.deleteAtIndex(2);
        } catch (InvalidPositionException e) {
            e.printStackTrace();
        }

        list.printList();

        System.out.println("\nIndex of 20: " + list.search(20));
        System.out.println("Index of 200: " + list.search(200));
    }
}
