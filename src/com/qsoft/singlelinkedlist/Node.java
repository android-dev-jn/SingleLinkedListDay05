package com.qsoft.singlelinkedlist;

public class Node {

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getNextNode() {
		return nextNode;
	}

	public void setNextNode(Integer nextNode) {
		this.nextNode = nextNode;
	}

	private String value;
	private Integer nextNode;

	public Node(String value, Integer nextNode) {
		this.value = value;
		this.nextNode = nextNode;
	}

}
