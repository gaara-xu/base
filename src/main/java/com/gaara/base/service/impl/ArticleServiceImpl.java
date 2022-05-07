package com.gaara.base.service.impl;

import com.gaara.base.domain.Article;
import com.gaara.base.mapper.ArticleMapper;
import com.gaara.base.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author gaara
* @description 针对表【article】的数据库操作Service实现
* @createDate 2022-05-07 14:57:19
*/
@Service
public class ArticleServiceImpl implements ArticleService{
    @Autowired
    private ArticleMapper articleMapper;

    public List<Article> selectArticleById(String id){
        return articleMapper.selectArticleById(id);
    }
}
