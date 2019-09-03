
package com.midasgo.bookdocapi.controller.api;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.midasgo.bookdocapi.mapper.ReplyMapper;
import com.midasgo.bookdocapi.model.Reply;
@RestController
public class ReplyController 
{
	@Autowired
	ReplyMapper mapper;
	
	//select all
	@RequestMapping(value = "/reply/{note_id}/pageIndex={pageIndex}&pageSize={pageSize}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Reply> selectAll(
    		@PathVariable("note_id") int note_id,
    		@PathVariable("pageIndex") int pageIndex,
    		@PathVariable("pageSize") int pageSize) {
		List<Reply> list = mapper.selectAll(note_id, pageSize, pageIndex);
        return list;
    }
	
	//select item
	@RequestMapping(value = "/reply/{id}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Reply selectItem(@PathVariable("id") int id) {
		Reply item = mapper.selectItem(id);
        return item;
    }
	
	//insert
    @RequestMapping(value = "/reply", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public void insertItem(@RequestBody Reply param) {
    	mapper.insertItem(param);
    }
    
    //update
    @RequestMapping(value = "/reply", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.OK)
    public void updateItem( @RequestBody Reply param) {
    	mapper.updateItem(param);
    }
    
    //delete
    @RequestMapping(value = "/reply/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteItem(@PathVariable("id") int id) {
    	mapper.deleteItem(id);
    }
}