package com.gaara.base.infrastructure.exception;

import com.gaara.base.infrastructure.api.ApiResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author gaara
*   统一异常处理
* */
@RestControllerAdvice
public class GlobalExceptionHandler {
    private final static Logger _logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = {StringResponseException.class})
    public ApiResult<Object> handle(StringResponseException e){
        String exMessage = e.getMessage();
        Integer errorCode = e.getErrorCode();
        return new ApiResult<>(false,errorCode==null?200:errorCode,exMessage,null);
    }
    @ExceptionHandler(value = {Exception.class})
    public ApiResult<Object> handle(Exception e){
        _logger.error(e.getMessage());
        String exMessage = "网络或程序异常，请稍后再试";
        return new ApiResult<>(false,500,exMessage,null);
    }
}
