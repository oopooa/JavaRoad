package com.opoa.stream.pojo;

/**
 * @program: JavaRoad->Ball
 * @description: 球
 * @author: opoa
 * @create: 2021-06-26 22:11
 **/
public class Ball {

    /**
     * 尺寸
     */
    private int size;

    /**
     * 颜色
     */
    private String color;

    /**
     * 图案
     */
    private String pattern;

    /**
     * 重量
     */
    private double weight;

    /**
     * 价格
     */
    private double price;

    /**
     * 是否完好
     */
    private boolean isIntact;

    public Ball() {
    }

    public Ball(int size, String color, String pattern, double weight, double price, boolean isIntact) {
        this.size = size;
        this.color = color;
        this.pattern = pattern;
        this.weight = weight;
        this.price = price;
        this.isIntact = isIntact;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isIntact() {
        return isIntact;
    }

    public void setIntact(boolean intact) {
        isIntact = intact;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", pattern='" + pattern + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", isIntact=" + isIntact +
                '}';
    }

}
