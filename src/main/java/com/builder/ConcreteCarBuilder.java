package com.builder;

public class ConcreteCarBuilder implements CarBuilder {
    private Car car = new Car();

    @Override
    public CarBuilder setShape(String shape) {
        car.setShape(shape);
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public CarBuilder addType(String type) {
        car.getType().add(type);
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}