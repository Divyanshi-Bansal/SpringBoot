package com.example.springBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springBoot.exceptionDemo.BlogErrorResponse;
import com.example.springBoot.exceptionDemo.CustomException;
import com.example.springBoot.model.Blog;
import com.example.springBoot.service.BlogService;

@RestController
@RequestMapping("/api/blogs")
public class BlogController {
	
	@Autowired
	private BlogService blogService;

	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping(value="/")
	public @ResponseBody List<Blog> getAllBlogs(){
		return blogService.getBlogs();
	}
	
	@GetMapping(value="id/{id}")
	public @ResponseBody Blog getBlogById(@PathVariable int id){
//		if(id <= 0) {
//			throw new CustomException("error in if statement");
//		}
		return blogService.getBlogById(id);
	}
	
	@GetMapping(value="name/{name}")
	public @ResponseBody List<Blog> getBlogsByName(@PathVariable String name){
		return blogService.getBlogByName(name);
	}
	
	@RequestMapping(value="/category", method = RequestMethod.GET)
	public @ResponseBody List<Blog> getBlogsByCategory1(){
		return blogService.getAllBlogsByCategory1();
	}
	
	@PostMapping(value="/")
	public @ResponseBody Blog addBlog(@RequestBody Blog blog) {
		return blogService.addBlog(blog);
	}
	
	@PostMapping(value="/bulk")
	public @ResponseBody List<Blog> addBlogs(@RequestBody List<Blog> blogs){
		return blogService.addBlogs(blogs);
	}
	
	@PutMapping(value="/")
	public @ResponseBody Blog updateBlog(@RequestBody Blog blog) {
		return blogService.updateBlog(blog);
	}
	
	@DeleteMapping(value="/{id}")
	public String deleteBlog(@PathVariable int id) {
		blogService.deleteBlog(id);
		return "successfully deleted";
	}
	
}
