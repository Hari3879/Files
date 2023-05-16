package com.ojas.dailytask;
//A Linked List Node
class Node
{
	int data;
	Node next;

	Node(int data, Node next)
	{
		this.data = data;
		this.next = next;
	}

	Node() {}
}

class ReArrangingLinkedList
{
	public static void printList(Node head)
	{
		Node ptr = head;
		while (ptr != null)
		{
			System.out.print(ptr.data + " —> ");
			ptr = ptr.next;
		}

		System.out.println("null");
	}


	public static Node sortedInsert(Node head, Node newNode)
	{
		Node dummy = new Node();
		Node current = dummy;
		dummy.next = head;

		while (current.next != null && current.next.data < newNode.data) {
			current = current.next;
		}

		newNode.next = current.next;
		current.next = newNode;
		return dummy.next;
	}

	public static Node insertSort(Node head)
	{
		Node result = null; 	
		Node current = head;	
		Node next;

		while (current != null)
		{
		
			next = current.next;

			result = sortedInsert(result, current);
			current = next;
		}

		return result;
	}

	public static void main(String[] args)
	{
		// input keys
		int[] keys = {6, 3, 4, 8, 2, 9};

		// points to the head node of the linked list
		Node head = null;

		// construct a linked list
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		head = insertSort(head);

		// print linked list
		printList(head);
	}
}