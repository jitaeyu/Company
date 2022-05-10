package com.jitae.company;

public class Calendar {
	public int id; 
	public String groupId; 
	public String title; 
	public String writer; 
	public String content; 
	public String start; 
	public String end; 
	public boolean allday; 
	public String textColor; 
	public String backgroundColor; 
	public String borderColor;
	public Calendar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calendar(int id, String groupId, String title, String writer, String content, String start, String end,
			boolean allday, String textColor, String backgroundColor, String borderColor) {
		super();
		this.id = id;
		this.groupId = groupId;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.start = start;
		this.end = end;
		this.allday = allday;
		this.textColor = textColor;
		this.backgroundColor = backgroundColor;
		this.borderColor = borderColor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public boolean isAllday() {
		return allday;
	}
	public void setAllday(boolean allday) {
		this.allday = allday;
	}
	public String getTextColor() {
		return textColor;
	}
	public void setTextColor(String textColor) {
		this.textColor = textColor;
	}
	public String getBackgroundColor() {
		return backgroundColor;
	}
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	public String getBorderColor() {
		return borderColor;
	}
	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}
	
	

	
}
