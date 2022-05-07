package com.gaara.base.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.gaara.base.domain.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author gaara
* @description 针对表【article】的数据库操作Mapper
* @createDate 2022-05-07 14:57:19
* @Entity com.gaara.base.domain.Article
*/
public interface ArticleMapper extends BaseMapper<Article> {

    List<Article> selectArticleById(@Param("id") Object id);

}
