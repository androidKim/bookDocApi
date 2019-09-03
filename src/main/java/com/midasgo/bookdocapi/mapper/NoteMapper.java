package com.midasgo.bookdocapi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.midasgo.bookdocapi.model.Note;

@Mapper
public interface NoteMapper 
{
	public List<Note> selectAll();
	public Note selectItem(int id);
	public void insertItem(Note item);
	public void updateItem(Note item);
	public void deleteItem(int id);
}
