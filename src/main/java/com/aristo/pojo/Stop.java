
package com.aristo.pojo;


public class Stop {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stop{" +
                "name='" + name + '\'' +
                '}';
    }
}
