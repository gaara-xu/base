package com.gaara.base.infrastructure.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author gaara
 * 自定义业务异常
 */
public class StringResponseException extends RuntimeException  {
    @Getter
    @Setter
    private Integer errorCode;
    public StringResponseException(Integer errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }
    public StringResponseException(String message) {
        super(message);
        this.errorCode = 200;
    }
}
