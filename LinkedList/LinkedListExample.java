package LinkedList;

public class LinkedListExample {
	// Define a Node class to represent each element in the linked list
	private static class Node {
		int data; // Store the data of the node
		Node next; // Reference to the next node in the list

		// Constructor to create a new node with the given data
		Node(int data) {
			this.data = data;
			this.next = null; // Initially, the next reference is null
		}
	}

	// Reference to the head (first) node in the list
	Node head;

	// Method to insert a new node at the end of the linked list
	public void insert(int data) {
		Node newNode = new Node(data); // Create a new node with the given data

		// If the linked list is empty, make the new node the head
		if (head == null) {
			head = newNode;
		} else {
			// Otherwise, find the last node and add the new node at the end
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next; // Move to the next node
			}
			temp.next = newNode; // Set the next reference of the last node to the new node
		}
	}

	// Method to print the linked list
	public void printList() {
		Node temp = head; // Start from the head node
		while (temp != null) {
			System.out.print(temp.data + " → "); // Print the data of the current node
			temp = temp.next; // Move to the next node
		}
		System.out.println("null"); // End of the list
	}

	public static void main(String[] args) {
		LinkedListExample list = new LinkedListExample(); // Create a new linked list

		// Insert the values 10, 20, 30 into the list
		list.insert(10);
		list.insert(20);
		list.insert(30);

		// Print the linked list
		list.printList(); // Output: 10 → 20 → 30 → null
	}
}
