package com.builder;

public interface CarBuilder {
	CarBuilder setShape(String shape);
    CarBuilder setColor(String color);
    CarBuilder addType(String type);
    Car build();
}
