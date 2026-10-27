package com.lesson.memo.model;

public enum Priority {
	HIGH("高"),
	MIDDLE("中"),
	LOW("低");
	
	private final String label;
	
	Priority(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}

}