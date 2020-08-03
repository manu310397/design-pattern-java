package com.manu.designpattern.bridge.bridge3;

import java.util.List;

public interface Formatter {
    String format(String header, List<Detail> details);
}
