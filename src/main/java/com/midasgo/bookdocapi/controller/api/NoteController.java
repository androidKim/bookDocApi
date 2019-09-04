package com.midasgo.bookdocapi.controller.api;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.midasgo.bookdocapi.mapper.NoteMapper;
import com.midasgo.bookdocapi.model.Note;
@RestController
public class NoteController 
{
	@Autowired
	NoteMapper mapper;
	
	//select all
	@RequestMapping(value = "/note", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public HashMap  selectAll() {
		List<Note> list = mapper.selectAll();
		HashMap map = new HashMap<>();
		map.put("list", list);
		map.put("code", 0);
		map.put("message", "success");
        return map;
    }
	
	//select item
	@RequestMapping(value = "/note/{id}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Note selectItem(@PathVariable("id") int id) {
		Note item = mapper.selectItem(id);
        return item;
    }
	
	//insert
    @RequestMapping(value = "/note", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public HashMap insertItem(@RequestBody Note param) {
    	mapper.insertItem(param);
    	HashMap map = new HashMap<>();
		map.put("code", 0);
		map.put("message", "success");
        return map;
    }
    
    //update
    @RequestMapping(value = "/note", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.OK)
    public void updateItem( @RequestBody Note param) {
    	mapper.updateItem(param);
    }
    
    //delete
    @RequestMapping(value = "/note/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteItem(@PathVariable("id") int id) {
    	mapper.deleteItem(id);
    }
}