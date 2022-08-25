package com.github.sgblug.app.repository;

import com.github.sgblug.app.model.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
}
