package com.gaara.base.controller;

import com.gaara.base.common.RedisOperator;
import com.gaara.base.domain.Article;
import com.gaara.base.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/********************************
 *    Author Gaara              *
 *    Version 1.0               *
 *    @ClassName BaseController
 *    @Date 2022/5/7 3:06 下午
 *    @Description TODO         *
 ********************************/
@RestController
public class BaseController {

    @Autowired
    private ArticleService service;
    @Autowired
    private RedisOperator redis;

    @GetMapping("/sql/{id}")
    public Article getArticle(@PathVariable("id")String id){
        return service.selectArticleById(id).get(0);
    }


    @GetMapping("/redis/{str}")
    public String getRedis(@PathVariable("str")String str){
        redis.set("test","redis返回的是："+str,1_000);
        return redis.get("test");
    }
}
