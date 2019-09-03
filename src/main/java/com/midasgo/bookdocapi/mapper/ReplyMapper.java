package com.midasgo.bookdocapi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.midasgo.bookdocapi.model.Note;
import com.midasgo.bookdocapi.model.Reply;

@Mapper
public interface ReplyMapper 
{
	public List<Reply> selectAll(int note_id, int pageSize, int pageIndex);
	public Reply selectItem(int id);
	public void insertItem(Reply item);
	public void updateItem(Reply item);
	public void deleteItem(int id);
}
