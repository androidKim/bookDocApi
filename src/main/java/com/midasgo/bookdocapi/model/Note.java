package com.midasgo.bookdocapi.model;

public class Note {

	private int id;
	private String content;
	private int book_id;
	private String image;
	private long reg_date;
	public Note() {
		
	}
	public Note(int id, String content, int book_id, String image) {
		super();
		this.id = id;
		this.content = content;
		this.book_id = book_id;
		this.image = image;
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
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
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
		return "Note [id=" + id + ", content=" + content + "book_id=" + book_id + "image=" + image+ "reg_date=" + reg_date+"]";
	}
	
}
