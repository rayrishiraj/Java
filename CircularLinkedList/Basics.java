package CircularLinkedList;

public class Basics {
	public class InvalidPositionException extends Exception { // Exception
		public InvalidPositionException(String message) {
			super(message);
		}
	}

	private static class Node { // Creation of Node
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head;
	Node tail;
	int size;

	public boolean insert(int data) { // Append - O(1)
		Node newNode = new Node(data);

		if (head == null && tail == null) {
			head = newNode;
			tail = newNode;
			tail.next = head;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
		size++;
		return true;
	}

	public boolean prepend(int data) { // Prepend - O(1)
		Node newNode = new Node(data);
		if (head == null && tail == null) {
			head = newNode;
			tail = newNode;
			tail.next = head;
		} else {
			newNode.next = head;
			head = newNode;
			tail.next = head;
		}
		size++;
		return true;
	}

	public boolean insertInBetween(int data, int position) throws InvalidPositionException { // Insert In Index - O(n)
		if (position < 0 || position > size) {
			throw new InvalidPositionException("Invalid position: " + position);
		}
		Node newNode = new Node(data);
		if (position == 0) {
			newNode.next = head;
			head = newNode;
			tail.next = head;
		} else {
			Node temp = head;
			for (int i = 0; i < position - 1; i++) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;

			if (newNode.next == head) {
				tail = newNode;
			}
		}
		size++;
		return true;
	}

	public Integer deleteAtIndex(int position) throws InvalidPositionException { // Delete at a particular index - O(n)
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
				tail.next = head;
			}
		} else {
			Node temp = head;
			for (int i = 0; i < position - 1; i++) {
				temp = temp.next;
			}

			deletedData = temp.next.data;
			temp.next = temp.next.next;

			if (temp.next == head) {
				tail = temp;
			}
		}

		size--;
		return deletedData;
	}

	public int size() { // Size
		return size;
	}

	public boolean deleteFromFirst() { // Delete the head - O(n)
		if (head == null) {
			return false;
		}
		if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
			tail.next = head;
		}
		size--;
		return true;
	}

	public boolean deleteFromLast() { // Delete the Tail - O(n)
		if (head == null) {
			return false;
		}
		if (head == tail) {
			head = tail = null;
		} else {
			Node temp = head;
			while (temp.next != tail) {
				temp = temp.next;
			}
			temp.next = head;
			tail = temp;
		}
		size--;
		return true;
	}

	public boolean deleteanElement(int data) { // Delete a Data - O(n)
		if (head == null) {
			return false;
		}
		if (head.data == data) {
			deleteFromFirst();
			return true;
		}
		Node temp = head;
		while (temp != null && temp.next != head) {
			if (temp.next.data == data) {
				temp.next = temp.next.next;
				if (temp.next == head) {
					tail = temp;
				}
				size--;
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public boolean isEmpty() { // Checks if the List is Empty - O(1)
		return head == null && tail == null;
	}

	public void printList() { // Prints the List - O(n)
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}
		Node temp = head;
		StringBuilder sb = new StringBuilder("[");
		do {
			sb.append(temp.data).append(temp.next == head ? "" : " , ");
			temp = temp.next;
		} while (temp != head);
		sb.append("]");
		System.out.println(sb);

	}

	public void reverse() { // Reverse the List - O(n)
		if (head == null || head == tail) {
			return;
		}
		Node prev = null;
		Node current = head;
		Node next = null;
		do {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		} while (current != head);
		head = prev;
		tail = current;
		tail.next = head;
	}

	public int search(int data) { // Searching for a data - O(n)
		Node temp = head;
		int index = 0;
		if (head == null)
			return -1;

		do {
			if (temp.data == data) {
				return index;
			}
			temp = temp.next;
			index++;
		} while (temp != head);
		return -1;
	}

	public static void main(String[] args) { // Driver Class
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
