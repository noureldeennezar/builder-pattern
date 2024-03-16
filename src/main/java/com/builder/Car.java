package com.builder;
import java.util.ArrayList;
import java.util.List;

public class Car {
	private String shape;
    private String color;
    private List<String> type = new ArrayList<>();

    // Getters and Setters
    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }
}
