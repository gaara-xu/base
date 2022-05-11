package com.gaara.base.infrastructure.api;

import com.alibaba.fastjson.JSON;
import org.jetbrains.annotations.NotNull;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 *  @author gaara
 * 接口统一返回值处理
 * */
@RestControllerAdvice(basePackages = "com.gaara.base.controller")
public class ApiResultWrapperHandler implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(@NotNull MethodParameter returnType, @NotNull Class converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, @NotNull MethodParameter returnType, @NotNull MediaType selectedContentType, @NotNull Class selectedConverterType, @NotNull ServerHttpRequest request, @NotNull ServerHttpResponse response) {
        if (body instanceof ApiResult) {
            return body;
        }
        // 接口返回string会出异常，手动处理
        if (body instanceof String){
            return JSON.toJSONString( ApiResult.success(body));
        }
        // 返回文件之类的
        if(body instanceof byte[]){
            return body;
        }
        return ApiResult.success(body);
    }
}
