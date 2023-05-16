package com.ojas.dailytask;
import java.util.HashSet;
import java.util.Set;

class Node
{
	int data;
	Node next;
}

class IntersextionPointOfLinkedList
{

	public static Node push(Node head, int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = head;
		return node;
	}

	public static Node findIntersection(Node first, Node second)
	{
		Set<Node> nodes = new HashSet<>();

		while (first != null)
		{
			nodes.add(first);
			first = first.next;
		}

		
		while (second != null)
		{
			if (nodes.contains(second)) {
				return second;
			}
			second = second.next;
		}

		return null;
	}

	public static void main(String[] args)
	{
		Node first = null;
		for (int i = 5; i > 0; i--) {
			first = push(first, i);
		}

		Node second = null;
		for (int i = 3; i > 0; i--) {
			second = push(second, i);
		}

		second.next.next.next = first.next.next.next;

		Node addr = findIntersection(first, second);
		if (addr != null) {
			System.out.println("The intersection point is " + addr.data);
		}
		else {
			System.out.println("The lists do not intersect.");
		}
	}
}