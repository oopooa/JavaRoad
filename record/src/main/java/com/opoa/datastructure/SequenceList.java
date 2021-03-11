package com.opoa.datastructure;


import java.util.Arrays;

/**
 * @description: 自定义顺序表
 * @author: opoa
 * @create: 2021-02-17 14:53
 **/
public class SequenceList {

    /**
     * 数据
     */
    private String[] data;

    /**
     * 当前长度
     */
    private int length = 0;

    /**
     * 最大容量 默认为10
     */
    private int capacity = 10;

    public SequenceList() {
        this.data = new String[capacity];
    }

    public SequenceList(int capacity) {
        this.capacity = capacity;
        this.data = new String[capacity];
    }

    public int getLength() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }

    /**
     * 在指定下标处插入一个元素
     * @param index 下标
     * @param str   新增的字符串
     * @return      插入是否成功
     */
    public boolean insert(int index, String str) {
        // 下标不能超过数组最大容量
        if (index > capacity) {
            throw new IndexOutOfBoundsException("数组下标越界");
        }
        // 下标不能超过数组当前长度
        if (index > length) {
            throw new IllegalArgumentException("下标参数异常");
        }
        // 从后往前移动每个元素
        for (int i = length; index < i; i--) {
            data[i] = data[i-1];
        }
        data[index] = str;
        ++ length;
        return true;
    }

    /**
     * 在数组末尾插入一个元素
     * @param str  插入的字符串
     * @return     插入是否成功
     */
    public boolean insert(String str) {
        // 如果数组长度等于最大容量, 表示已经装满, 直接返回
        if (length == capacity) {
            return false;
        }
        data[length] = str;
        ++ length;
        return true;
    }

    /**
     * 根据下标删除一个元素
     * @param index  数组下标
     * @return       被删除的元素
     */
    public String remove(int index) {
        if (index < 0 || index > length - 1) {
            throw new IllegalArgumentException("下标参数异常");
        }
        String temp = data[index];
        for (int i = index; i < length; i++) {
            data[i] = data[i + 1];
        }
        -- length;
        return temp;
    }

    /**
     * 根据下标获取一个元素
     * @param index  数组下标
     * @return       返回的元素
     */
    public String getElement(int index) {
        if (index < 0 || index > length - 1) {
            throw new IllegalArgumentException("下标参数异常");
        }
        return data[index];
    }

    /**
     * 根据字符串的值返回其元素所在的下标
     * @param value  要查找的字符串
     * @return       该字符串在数组中的下标
     */
    public int getElement(String value) throws Exception {
        for (int i = 0; i < length; i++) {
            if (value.equals(data[i])) {
                return i;
            }
        }
        throw new Exception("字符串不存在");
    }

    /**
     * 对数组进行2倍扩容
     */
    public void enlarge() {
        String[] strs = new String[capacity * 2];
        for (int i = 0; i < length; i++){
            strs[i] = data[i];
        }
        this.data = strs;
        this.capacity = capacity * 2;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
