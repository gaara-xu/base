package com.gaara.base.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/********************************
 *    Author Gaara              *
 *    Version 1.0               *
 *    @ClassName Context
 *    @Date 2022/5/10 10:46 上午
 *    @Description TODO         *
 ********************************/
@Component
public class Context {


    public static String BaseHost;

    @Value("${BaseHost}")
    public void setBaseHost(String baseHost) {
        BaseHost = baseHost;
    }
}
