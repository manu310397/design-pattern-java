package com.manu.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    String print(MenuComponent menuComponent) {
        StringBuilder builder = new StringBuilder(menuComponent.name);
        builder.append(": ");
        builder.append(menuComponent.url);
        builder.append("\n");
        return builder.toString();
    }

    public abstract String toString();
}
