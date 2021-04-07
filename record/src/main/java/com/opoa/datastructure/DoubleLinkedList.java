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
     */
    public void add(T t) {

        // 如果头结点为空,则链表为空 新增结点既是头节点也是尾结点
        if (null == head) {
            this.head = new Node(null, t, null);
            this.tail = head;
            this.size ++;
            return;
        }

        // 新增的结点 以之前的尾结点作为前结点
        Node node = new Node(tail, t, null);
        // 把当前结点的地址赋值给尾结点的next
        tail.next = node;
        // 当前结点作为新的尾结点
        this.tail = node;
        this.size ++;
    }

    /**
     * 在链表尾部插入一个结点
     * @param t  要插入的元素
     */
    private void insertLast(T t) {

        // 记录之前的尾结点
        final Node l = tail;
        // 新增一个结点
        Node node = new Node(l, t, null);
        // 该结点作为新的尾结点
        this.tail = node;
        // 如果之前的尾结点为空
        if (null == l) {
            // 则新插入的结点是头结点
            this.head = node;
        } else {
            // 不为空 则把当前结点的引用赋值给之前尾结点的next
            l.next = node;
        }
        size ++;
    }

    /**
     * 在某个结点前插一个结点
     * @param t     要插入的结点
     * @param old   要插入结点的后驱结点
     */
    private void insertBefore(T t, Node old) {

        // 之前结点的前驱结点 也是即将插入结点的前驱结点
        Node prev = old.prev;
        // 新增一个结点
        Node node = new Node(prev, t, old);
        // 当前结点的引用赋值给旧结点的prev
        old.prev = node;
        // 如果之前的前驱结点为空
        if (null == prev) {
            // 则新插入的结点是头结点
            this.head = node;
        } else {
            // 不为空 则把当前结点的引用赋值给前驱结点的next
            prev.next = node;
        }
        size ++;
    }

    /**
     * 在指定下标处插入一个结点
     * @param t      要插入的元素
     * @param index  要插入的下标
     */
    public void insert(T t, int index) {

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("非法下标参数");
        }

        // 判断是否新增尾结点
        if (index == size) {
            insertLast(t);
        } else {
            insertBefore(t, getNode(index));
        }
    }

    /**
     * 给指定下标结点设置数据
     * @param t      要设置的元素
     * @param index  要设置结点的下标
     */
    public T set(int index, T t) {

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("非法下标参数");
        }

        // 获取要设置的结点
        Node old = getNode(index);
        // 保存结点中旧的数据
        T oldVal = old.t;
        // 为结点数据赋值
        old.t = t;
        // 返回旧值
        return oldVal;
    }

    /**
     * 返回链表长度
     * @return  链表长度
     */
    public int length() {
        return size;
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
