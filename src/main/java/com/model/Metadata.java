package com.model;

public class Metadata {
	
	private String color;
	private String notes;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	@Override
	public String toString() {
		return "Metadata [color=" + color + ", notes=" + notes + "]";
	}
	
	

}
