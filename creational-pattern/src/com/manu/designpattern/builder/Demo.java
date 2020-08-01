package com.manu.designpattern.builder;

public class Demo {
    public static void main(String[] args) {
        LunchOrderBuilderBean.Builder builder = new LunchOrderBuilderBean.Builder();
        LunchOrderBuilderBean lunchOrderBuilderBean = builder.bread("abc").condiments("xyz").dressing("pqr").meat("mno").build();

        LunchOrderBuilderBean.Builder builder2 = new LunchOrderBuilderBean.Builder();
        LunchOrderBuilderBean lunchOrderBuilderBean1 = builder2.bread("bcd").condiments("kyc").meat("pol").build();

        System.out.println(lunchOrderBuilderBean1.getBread());
        System.out.println(lunchOrderBuilderBean1.getCondiments());
        System.out.println(lunchOrderBuilderBean1.getDressing());
        System.out.println(lunchOrderBuilderBean1.getMeat());
    }
}
