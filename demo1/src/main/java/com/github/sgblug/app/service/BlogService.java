package com.github.sgblug.app.service;

import com.github.sgblug.app.model.entity.Blog;

import java.util.List;

public interface BlogService {
    /**
     * 新建博客
     *
     * @param title       博客标题
     * @param description 博客描述
     * @param content     博客内容
     * @return 博客
     */
    Blog newBlog(String title, String description, String content);

    /**
     * 根据 ID 获取博客
     *
     * @param id ID
     * @return 博客
     */
    Blog getBlog(Long id);

    /**
     * 获取所有博客
     *
     * @return 博客列表
     */
    List<Blog> getBlogs();

    /**
     * 根据 ID 删除博客
     *
     * @param id ID
     */
    void deleteBlog(Long id);

    /**
     * 根据 ID 修改博客
     *
     * @param id          ID
     * @param title       博客标题
     * @param description 博客描述
     * @param content     博客内容
     * @return 博客
     */
    Blog modifyBlog(Long id, String title, String description, String content);
}
