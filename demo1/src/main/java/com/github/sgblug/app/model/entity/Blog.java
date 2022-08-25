package com.github.sgblug.app.model.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "t_blog")
@SQLDelete(sql = "UPDATE t_blog SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
public class Blog extends BaseEntity {
    /**
     * 博文标题
     */
    @Column(nullable = false, length = 100)
    private String title;

    /**
     * 博文描述
     */
    private String description;

    /**
     * 博文内容
     */
    @Column(columnDefinition = "TEXT", length = 10000)
    private String content;

    public Blog() {
    }

    public Blog(Long id, Instant createdAt, Instant updatedAt, Boolean deleted, String title, String description, String content) {
        super(id, createdAt, updatedAt, deleted);
        this.title = title;
        this.description = description;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Blog blog = (Blog) o;
        return Objects.equals(title, blog.title) && Objects.equals(description, blog.description) && Objects.equals(content, blog.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title, description, content);
    }

    @Override
    public String toString() {
        return "Blog{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                "} " + super.toString();
    }
}
