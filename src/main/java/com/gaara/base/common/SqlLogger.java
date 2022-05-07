package com.gaara.base.common;

import com.gaara.base.util.SpiderStringUitls;
import com.p6spy.engine.spy.appender.MessageFormattingStrategy;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/********************************
 *    Author Gaara              *
 *    Version 1.0               *
 *    @ClassName SqlLogger
 *    @Date 2022/4/20 4:30 下午
 *    @Description TODO         *
 ********************************/
public class SqlLogger implements MessageFormattingStrategy {
    public SqlLogger(){

    }
    @Override
    public String formatMessage(int connectionId, String now, long elapsed, String category, String sql, String url) {
        StringBuffer stringBuffer = new StringBuffer();
        List<String> list = SpiderStringUitls.getSplit(url,"'","'");
        AtomicInteger count = new AtomicInteger();
        list.forEach(e->{
            if (count.get() != 0){
                stringBuffer.append(",");
            }
            stringBuffer.append(e);
            count.getAndIncrement();
        });

        System.out.println("┏━━━━━ Debug [Gaara SqlPlus  connectionId="+connectionId+"] ━━━");
        System.out.println("┣ SQL：\t  "+ sql.replaceAll("[\\s]+", " ") );
        System.out.println("┣ 参数：\t ["+stringBuffer.toString()+"]");
        System.out.println("┣ 耗时：\t "+elapsed+"ms");
        System.out.println("┣ 时间：\t "+now);
        System.out.println("┣ 结果：\t  ");
        System.out.println("┗━━━━━ Debug [Gaara SqlPlus :"+category+"] ━━━");
       /* return StringUtils.isNotBlank(sql) ? " Consume Time：" + elapsed + " ms "
                + now + "\n Execute SQL：" + sql.replaceAll("[\\s]+", " ") + "\n" : "";*/
        return null;
    }


}


