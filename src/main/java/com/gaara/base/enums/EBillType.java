package com.gaara.base.enums;

/********************************
 *    Author Gaara              *
 *    Version 1.0               *
 *    @ClassName EBillType
 *    @Date 2019/4/15 下午2:43     
 *    @Description TODO         *
 ********************************/
public enum EBillType {
    Life(1), // 日常
    Travel(2), // 旅行模式
    All(3), // 游客 访客
    Year(4), // 过年模式
    Honeymoon(5); //蜜月模式
    private int value;

    EBillType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}