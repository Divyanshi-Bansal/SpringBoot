package com.example.springBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springBoot.model.Blog;
import com.example.springBoot.repository.BlogRepository;

@Service
public class BlogService{
	
	@Autowired
	private BlogRepository blogRepository;
	
	public List<Blog> getBlogs() {
		return blogRepository.findAll();
	}
	
	public Blog getBlogById(int blogId) {
		return blogRepository.findById(blogId).orElse(null);
	}
	
	public List<Blog> getBlogByName(String name) {
		return blogRepository.findByName(name);
	}
	
	public Blog addBlog(Blog blog) {
		return blogRepository.save(blog);
	}
	
	public List<Blog> addBlogs(List<Blog> blogs) {
		return blogRepository.saveAll(blogs);
	}
	
	public Blog updateBlog(Blog blog) {
		Blog existingBlog = blogRepository.findById(blog.getId()).orElse(null);
		existingBlog.setName(blog.getName());
		existingBlog.setDescription(blog.getDescription());
		existingBlog.setCategory(blog.getCategory());
		return blogRepository.save(existingBlog);
	}
	
	public void deleteBlog(int blogId) {
		blogRepository.deleteById(blogId);
	}
	
	public List<Blog> getAllBlogsByCategory1(){
		return blogRepository.findAllSameCategoryBlogs();
	}

}
