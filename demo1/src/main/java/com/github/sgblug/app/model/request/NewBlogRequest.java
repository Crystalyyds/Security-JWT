package com.github.sgblug.app.model.request;

import javax.validation.constraints.Size;

public record NewBlogRequest(
        @Size(max = 100, message = "博客标题不能超过100个字") String title,
        @Size(max = 255, message = "博客描述不能超过255个字") String description,
        @Size(max = 10000, message = "博客能容不能超过10000个字") String content
) {
}
