package com.qsoft.singlelinkedlist;

import java.util.ArrayList;

public class SingleLinkedList {

	private ArrayList<Node> list;
	private int firstElement;

	public SingleLinkedList() {
		super();
		this.list = new ArrayList<Node>();
		this.firstElement = 0;
	}

	public SingleLinkedList(ArrayList<Node> listObject) {
		this.list = listObject;
		this.firstElement = 0;
	}

	public boolean isEmpty() {
		return this.list.size() == 0;
	}

	public int listSize() {
		// TODO Auto-generated method stub
		return this.list.size();
	}

	public Node getNode(int i) {
		Node iter = this.list.get(this.firstElement);
		if (i == this.firstElement) {

		} else {
			while (iter.getNextNode() != i) {
				iter = this.list.get(iter.getNextNode());
			}
			iter = this.list.get(iter.getNextNode());
		}
		return iter;
	}

	public void insertAfter(int position, Node newNode) {
		Node node = this.list.get(position);
		newNode.setNextNode(node.getNextNode());
		this.list.add(newNode);
		node.setNextNode(this.list.indexOf(newNode));
	}

}
