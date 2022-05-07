package com.gaara.base.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/********************************
 *    Author Gaara              *
 *    Version 1.0               *
 *    @ClassName StringUitls
 *    @Date 2022/4/20 4:50 下午
 *    @Description TODO         *
 ********************************/
public class SpiderStringUitls {

    /**
     * 获取全部匹配的词组  比如获取 <div><div/>之间的内容
     * @param param
     * @param keyStart
     * @param keyEnd
     * @return
     */
    public static List<String> getSplit(String param, String keyStart, String keyEnd, int haveKey,List<String> list){
        // 匹配规则
        String reg = keyStart+"(.*?)"+keyEnd;
        Pattern pattern = Pattern.compile(reg);

        // 内容 与 匹配规则 的测试
        Matcher matcher = pattern.matcher(param);

        if( matcher.find() ){
            list.add(matcher.group(haveKey));
           /* // 包含前后的两个字符
            System.out.println(matcher.group());
            // 不包含前后的两个字符
            System.out.println( matcher.group(1) );*/
            String a = param.split(keyEnd)[0];
            // 要删掉 匹配字符前面所有的， 匹配字符的长度 ， 加上两个匹配字符的长度
            String newStr = param.substring(a.length()+matcher.group(haveKey).length()
                    +keyStart.length()+keyEnd.length());
            getSplit(newStr,keyStart,keyEnd,haveKey,list);
        }else{
            if (list.size()==0){
                System.out.println(" 没有匹配到内容....");
            }

        }
        return list;
    }
    // true就是包含
    public static List<String> getSplit(String param, String keyStart, String keyEnd, boolean haveKey){
        if (haveKey){
           return getSplit(param,keyStart,keyEnd,0,new ArrayList<>());
        }else {
           return getSplit(param,keyStart,keyEnd,1,new ArrayList<>());
        }
    }
    // 默认不包含
    public static List<String> getSplit(String param, String keyStart, String keyEnd){
        return getSplit(param,keyStart,keyEnd,1,new ArrayList<>());
    }



}
