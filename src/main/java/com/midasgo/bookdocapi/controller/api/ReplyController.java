
package com.midasgo.bookdocapi.controller.api;
import java.util.HashMap;
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
	@RequestMapping(value = "/reply/list/{note_id}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public HashMap selectAll(@PathVariable("note_id") int note_id) {
		List<Reply> list = mapper.selectAll(note_id);
		HashMap map = new HashMap<>();
		map.put("list", list);
		map.put("code", 0);
		map.put("message", "success");
        return map;
    }
	
	//select item
	@RequestMapping(value = "/reply/item/{id}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Reply selectItem(@PathVariable("id") int id) {
		Reply item = mapper.selectItem(id);
        return item;
    }
	
	//insert
    @RequestMapping(value = "/reply", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public HashMap insertItem(@RequestBody Reply param) {
    	mapper.insertItem(param);
    	HashMap map = new HashMap<>();
		map.put("code", 0);
		map.put("message", "success");
		return map;
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
    
    //count
    @RequestMapping(value = "/reply/count/{note_id}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public HashMap selectCount(@PathVariable("note_id") int note_id) {
		int count = mapper.selectCount(note_id);
		HashMap map = new HashMap<>();
		map.put("count", count);
		map.put("code", 0);
		map.put("message", "success");
        return map;
    }
}