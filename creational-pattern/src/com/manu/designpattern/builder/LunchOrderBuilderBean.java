package com.manu.designpattern.builder;

public class LunchOrderBuilderBean {

    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public LunchOrderBuilderBean build() {
            return new LunchOrderBuilderBean(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }
    }

    private LunchOrderBuilderBean(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
