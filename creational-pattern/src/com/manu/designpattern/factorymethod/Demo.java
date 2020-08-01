package com.manu.designpattern.factorymethod;

public class Demo {
    public static void main(String[] args) {
        Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(blog.getPages());

        Website shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(shop.getPages());
    }
}
