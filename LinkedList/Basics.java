package LinkedList;

public class Basics {
	public class InvalidPositionException extends Exception { // Exception
		public InvalidPositionException(String message) {
			super(message);
		}
	}

	private static class Node { // Creation Of Node
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
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
		return true;
	}

	public boolean prepend(int data) { // Prepend - O(1)
		Node newNode = new Node(data);
		if (isEmpty(data)) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		size++;
		return true;
	}

	public boolean insertInBetween(int data, int position) throws InvalidPositionException { // Insert In Index - O(1)
		if (position < 0 || position > size) {
			throw new InvalidPositionException("Invalid position: " + position);
		}
		Node newNode = new Node(data);
		if (position == 0) {
			newNode.next = head;
			head = newNode;
			if (tail == null) {
				tail = newNode;
			}
		} else {
			Node temp = head;
			for (int i = 0; i < position - 1; i++) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;

			if (newNode.next == null) {
				tail = newNode;
			}
		}

		size++;
		return true;
	}

	public Integer deleteAtIndex(int position) throws InvalidPositionException { // Delete at a particular index - O(1)
		if (position < 0 || position >= size) {
			throw new InvalidPositionException("Invalid position: " + position);
		}

		Integer deletedData = null;

		if (position == 0) {
			deletedData = head.data;
			head = head.next;
			if (head == null) {
				tail = null;
			}
		} else {
			Node temp = head;
			for (int i = 0; i < position - 1; i++) {
				temp = temp.next;
			}

			deletedData = temp.next.data;
			temp.next = temp.next.next;

			if (temp.next == null) {
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
		head = head.next;
		if (head == null) {
			tail = null;
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
			size--;
			return true;
		}
		Node temp = head;
		while (temp.next != tail) {
			temp = temp.next;
		}
		temp.next = null;
		tail = temp;
		size--;
		return true;
	}

	public boolean deleteanElement(int data) { // Delete a Data - O(n)
		if (isEmpty(data)) {
			return false;
		}
		if (head.data == data) {
			head = head.next;
			if (head == null) {
				tail = null;
			}
			size--;
			return true;
		}
		Node temp = head;
		while (temp != null && temp.next != null) {
			if (temp.next.data == data) {
				temp.next = temp.next.next;
				if (temp.next == null) {
					tail = temp;
				}
				size--;
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public boolean isEmpty(int data) { // Checks if the List is Empty - O(1)
		if (head == null && tail == null) {
			return true;
		} else {
			return false;
		}
	}

	public void printList() { // Prints the List - O(n)
		Node temp = head;
		StringBuilder sb = new StringBuilder("[");
		while (temp != null) {
			sb.append(temp == tail ? temp.data : temp.data + " , ");
			temp = temp.next;
		}
		sb.append("]");
		System.out.println(sb);
	}

	public void reverse() { // Reverse the List - O(n)
		Node prev = null;
		Node current = head;
		Node next = null;
		tail = head;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		head = prev;
	}

	public int search(int data) { // Searching for a data - O(n)
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
