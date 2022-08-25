package com.github.sgblug.app.repository;

import com.github.sgblug.app.model.entity.Blog;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.inject.Inject;

/**
 * @author 20312
 * @author 2022/8/23 19:00
 */
@SpringBootTest
public class BlogRepositoryTest {
    @Inject
    private BlogRepository blogRepository;
    @Test
    void testAdd(){
        Blog blog = new Blog();
        blog.setTitle("a");
        blog.setDescription("b");
        blog.setContent("""
                ccccccc""");
        blogRepository.save(blog);
    }
}
