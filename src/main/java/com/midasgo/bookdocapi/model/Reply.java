package com.midasgo.bookdocapi.model;

public class Reply {

	private int id;
	private String content;
	private int note_id;
	private long reg_date;
	
	public Reply() {
		
	}
	
	public Reply(int id, String content, int note_id) {
		super();
		this.id = id;
		this.content = content;
		this.note_id = note_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getNote_id() {
		return note_id;
	}

	public void setNote_id(int note_id) {
		this.note_id = note_id;
	}
	
	public long getReg_date() {
		return reg_date;
	}

	public void setReg_date(long reg_date) {
		this.reg_date = reg_date;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Reply [id=" + id + ", content=" + content + "note_id=" + note_id+"]";
	}
	
}
