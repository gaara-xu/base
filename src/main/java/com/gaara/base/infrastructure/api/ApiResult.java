package com.gaara.base.infrastructure.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author gaara
 * @param <TResult>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResult<TResult>{
    private boolean success;
    private Integer errorCode; // 0 表示业务处理成功
    private String message;
    private TResult result; // 返回数据

    public static <TResult> ApiResult<TResult> success(){
        return new ApiResult<>(true,0,"ok", null);
    }
    public static <TResult> ApiResult<TResult> success(TResult result){
        return new ApiResult<>(true,0,"ok", result);
    }

    public static <TResult> ApiResult<TResult> fail(Integer errorCode, String message){
        return new ApiResult<>(false,errorCode,message, null);
    }
}
