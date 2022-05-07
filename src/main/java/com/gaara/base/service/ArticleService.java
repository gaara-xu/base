package com.gaara.base.service;


import com.gaara.base.domain.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author gaara
* @description 针对表【article】的数据库操作Service
* @createDate 2022-05-07 14:57:19
*/
public interface ArticleService {
    List<Article> selectArticleById(String id);
}
