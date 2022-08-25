package com.github.sgblug.app.controller;

import com.github.sgblug.app.model.entity.Blog;
import com.github.sgblug.app.model.request.NewBlogRequest;
import com.github.sgblug.app.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {
    private final BlogService blogService;

    @Inject
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping
    public List<Blog> getAllBlogs() {
        return blogService.getBlogs();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blog> getBlog(@PathVariable(value = "id") Long id) {
        Blog blog = blogService.getBlog(id);
        if (blog == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

    @PostMapping
    public Blog newBlog(@RequestBody @Valid NewBlogRequest newBlogRequest) {
        return blogService.newBlog(newBlogRequest.title(), newBlogRequest.description(), newBlogRequest.content());
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Blog> modifyBlog(
            @PathVariable(value = "id") Long id,
            @RequestBody @Valid NewBlogRequest newBlogRequest
    ) {
        Blog blog = blogService.modifyBlog(id, newBlogRequest.title(), newBlogRequest.description(), newBlogRequest.content());
        if (blog == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteBlog(
            @PathVariable(value = "id") Long id
    ) {
        blogService.deleteBlog(id);
    }
}
