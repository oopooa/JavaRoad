package com.opoa.datastructure;


/**
 * @program: SinglyLinkedList
 * @description: 自定义单链表
 * @author: opoa
 * @create: 2021-02-28 20:21
 **/
public class SinglyLinkedList<T> {

    /**
     * 头结点
     */
    private Node head;

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
         * 下一个结点
         */
        private Node next;

        Node(T t, Node next) {
            this.t = t;
            this.next = next;
        }

        public Node(T t) {
            this(t, null);
        }

        @Override
        public String toString() {
            return "Node{" + t + '}';
        }
    }

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * 根据下标获取一个结点
     * @param index 下标参数
     * @return      对应结点
     */
    public Node getNode(int index) {

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("非法下标参数");
        }
        Node curNode = this.head;
        // 下标为0 直接返回头结点
        if (index == 0) {
            return curNode;
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
        Node curNode = this.head;
        // 当前结点不为空且结点数据不等于传入元素
        while (null != curNode && curNode.t != t) {
            // 当前结点后移
            curNode = curNode.next;
        }
        return curNode;
    }

    /**
     * 在指定下标处插入一个结点
     * @param t      要插入的元素
     * @param index  要插入的下标
     * @return       插入是否成功
     */
    public boolean insert(T t, int index) {

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("非法下标参数");
        }

        Node node = new Node(t);
        // 链表头部插入结点
        if (index == 0) {
            node.next = this.head;
            this.head = node;
            this.size++;
            return true;
        }

        // 找到要插入结点的前一个结点
        Node preNode = getNode(index - 1);
        // 前一个结点的下一个结点地址赋给当前结点的next
        node.next = preNode.next;
        // 当前结点的地址赋给前一个结点的next
        preNode.next = node;
        this.size++;
        return true;
    }

    /**
     * 使用头插法插入一个元素
     * @param t  要插入的元素
     * @return   插入是否成功
     */
    public boolean insertFirst(T t) {
        return insert(t, 0);
    }

    /**
     * 使用尾插法插入一个元素
     * @param t  要插入的元素
     * @return   插入是否成功
     */
    public boolean insertLast(T t) {
        return insert(t, size);
    }

    /**
     * 根据下标删除结点
     * @param index  要删除的下标参数
     * @return       将要删除的结点
     */
    public Node remove(int index) {

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("非法下标参数");
        }
        Node removeNode = null;
        // 删除头结点
        if (index == 0) {
            removeNode = this.head;
            // 把头结点的下一结点作为头节点
            this.head = head.next;
            this.size--;
            return removeNode;
        }
        // 找到删除结点的前一结点
        Node preNode = getNode(index - 1);
        // 把要删除的结点保存和返回
        removeNode = preNode.next;
        // 把前一结点的下下个结点地址赋值给前一结点的next
        preNode.next = preNode.next.next;
        this.size--;
        return removeNode;
    }

    /**
     * 根据数据删除结点
     * @param t  要删除的数据
     * @return   将要删除的结点
     */
    public Node remove(T t) {
        // 链表或元素为空 直接返回
        if (size == 0 || null == t) {
            return null;
        }

        Node removeNode = null;
        for (int i = 0; i < size; i++) {
            Node node = getNode(i);
            if (t == node.t) {
                removeNode = remove(i);
                break;
            }
        }
        return removeNode;
    }

    /**
     * 返回当前链表长度
     * @return  链表长度
     */
    public int length() {
        return this.size;
    }

    /**
     * 打印输出单链表
     * @return  整个单链表
     */
    @Override
    public String toString() {

        if (size == 0) {
            return null;
        }
        Node curNode = this.head;
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
