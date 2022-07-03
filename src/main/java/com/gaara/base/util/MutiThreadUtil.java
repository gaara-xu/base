package com.gaara.base.util;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;
import org.yeauty.pojo.Session;

import java.util.concurrent.Future;

/**
 * Created by Gaara_Xu
 * on 2022/7/3.
 * Async 修饰的仅可以void 和 future
 */

@Component
@Slf4j
public class MutiThreadUtil {
    @Async("msgThreadPool")
    public void sendMessageText(Session session, String msg){
        log.info("线程名：" + Thread.currentThread().getName());
        if(session!=null && session.isActive()){
            session.sendText(msg);
        }
    }

    @Async("msgThreadPool")
    public Future<String> sendMessageText(String msg){
        log.info("线程名：" + Thread.currentThread().getName());
        System.out.println("============="+msg);
        return new AsyncResult<>("this = "+msg);
    }
}