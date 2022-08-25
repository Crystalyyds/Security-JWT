package com.github.sgblug.app.mapper;

/**
 * @author 20312
 * @author 2022/8/24 20:11
 */
import com.github.sgblug.app.model.entity.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

import java.util.List;


@Mapper
public interface BlogMapper {

    @Select( "SELECT A.id,A.name FROM role A LEFT JOIN user_role B ON A.id=B.role_id WHERE B.user_id=${userId}" )
    List<Blog> getBlogsByUserId(@Param("userId") Long userId);

}
