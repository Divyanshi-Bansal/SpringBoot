package com.example.springBoot.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springBoot.model.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Integer> {

	List<Blog> findByName(String name);
	
	@Query(value="SELECT * FROM Blog WHERE category=1", nativeQuery = true)
	List<Blog> findAllSameCategoryBlogs();

}
