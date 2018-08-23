package com.demo.bean;


/**
 * @ClassName Color
 * @Description TODO
 * @Author lyk
 * @Date 2018/8/17 09:28
 * @Version 1.0
 **/
public class Color {
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Color{" +
                "car=" + car +
                '}';
    }
}
