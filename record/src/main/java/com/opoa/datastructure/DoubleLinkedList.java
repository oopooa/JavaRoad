package com.opoa.datastructure;


/**
 * @program: DoubleLinkedList
 * @description: 自定义双链表
 * @author: opoa
 * @create: 2021-04-05 16:25
 **/
public class DoubleLinkedList<T> {

    /**
     * 头结点
     */
    private Node head;

    /**
     * 尾结点
     */
    private Node tail;

    /**
     * 链表元素个数
     */
    private int size;

    /**
     * 结点
     */
    class Node {

        /**
         * 结点数据
         */
        private T t;

        /**
         * 上一个结点
         */
        private Node prev;

        /**
         * 下一个结点
         */
        private Node next;

        Node() {}

        Node(Node prev, T t, Node next) {
            this.prev = prev;
            this.t = t;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" + t + '}';
        }
    }

    public DoubleLinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * 根据下标获取结点
     * @param index  下标参数
     * @return       对应结点
     */
    public Node getNode(int index) {

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("非法下标参数");
        }

        Node curNode = this.head;
        // 下标为0 直接返回头结点
        if (index == 0) {
            return head;
        }
        for (int i = 0; i < index; i++) {
            curNode = curNode.next;
        }
        return curNode;
    }

    /**
     * 根据元素值返回对应结点
     * @param t  要查找的元素值
     * @return   对应结点
     */
    public Node getNode(T t) {

        // 从头结点开始
        Node curNode = head;
        // 当前结点不为空且传入结点数据不等于传入元素
        while (null != curNode && curNode.t != t) {
            curNode = curNode.next;
        }
        return curNode;
    }

    /**
     * 新增一个结点
     * @param t  要插入的元素值
     * @return   插入是否成功
     */
    public boolean add(T t) {

        // 如果头结点为空,则链表为空 新增结点既是头节点也是尾结点
        if (null == head) {
            this.head = new Node(null, t, null);
            this.tail = head;
            this.size ++;
            return true;
        }

        // 新增的结点 以之前的尾结点作为前结点
        Node node = new Node(tail, t, null);
        // 把当前结点的地址赋值给尾结点的next
        tail.next = node;
        // 当前结点作为新的尾结点
        this.tail = node;
        this.size ++;
        return true;
    }

    /**
     * 打印输出双链表
     * @return  整个双链表
     */
    @Override
    public String toString() {

        if (size == 0) {
            return null;
        }
        Node curNode = head;
        StringBuilder sb = new StringBuilder();
        while (null != curNode) {
            sb.append(curNode.t.toString())
              .append(" -> ");
            curNode = curNode.next;
        }
        sb.append("null");
        return sb.toString();
    }
}
