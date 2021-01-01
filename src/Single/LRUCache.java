package Single;

import java.util.HashMap;

/**
 * @author shenyvhao
 * @program Algorithm
 * @description
 * @create 2020-07-06 23
 **/


public class LRUCache {

    class Node {

        int key;
        int value;
        Node prev;
        Node next;

        public Node() {
        }

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

    }

    HashMap<Integer, Node> map = new HashMap<>();
    private int capacity, count;

    private Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.head = new Node();
        this.tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            removeNode(node);
            //node插入到头部
            moveToHead(node);
            return map.get(key).value;
        }
        return -1;
    }

    public void put(int key, int value) {
        Node node;
        if (map.containsKey(key)) {
            node = map.get(key);
            removeNode(node);
            count--;
        }
        node = new Node(key, value);
        count++;
        checkCapacity();
        moveToHead(node);
        map.put(key, node);
    }

    private void checkCapacity() {
        //消除最后一个
        if (this.capacity < this.count) {
            Node node = this.tail.prev;
            map.remove(node.key);
            this.tail.prev = this.tail.prev.prev;
            this.tail.prev.next = this.tail;
            count--;
        }
    }

    private void moveToHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next = node;
        node.next.prev = node;
    }

    private void removeNode(Node node) {
        //当前位置删除node
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(2, 1);
        lruCache.put(1, 1);
        lruCache.put(2, 3);
        lruCache.put(4, 1);

        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(2));
    }

}
