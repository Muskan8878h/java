import java.util.LinkedList;

public class hashing {
    static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        private class Node {
            K key;
            V value;
            Node next; // For chaining

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private LinkedList<Node>[] buckets;
        private int n; // Number of key-value pairs
        private int N; // Capacity of buckets array

        private void initBuckets(int N) {
            this.N = N;
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        private int hashFunction(K key) {
            return Math.abs(key.hashCode()) % N; // Handle negative hash codes
        }


        public int size() {
            return n;
        }

        public void put(K key, V value) {
            int bucketIndex = hashFunction(key);
            LinkedList<Node> bucket = buckets[bucketIndex];

            for (Node node : bucket) {
                if (node.key.equals(key)) {
                    node.value = value; // Update existing value
                    return;
                }
            }

            bucket.add(new Node(key, value));
            n++;

            // Check for rehashing
            double lambda = (double) n / N;
            if (lambda > DEFAULT_LOAD_FACTOR) {
                rehash();
            }
        }

        public V get(K key) {
            int bucketIndex = hashFunction(key);
            LinkedList<Node> bucket = buckets[bucketIndex];

            for (Node node : bucket) {
                if (node.key.equals(key)) {
                    return node.value;
                }
            }

            return null; // Key not found
        }

        public V remove(K key) {
            int bucketIndex = hashFunction(key);
            LinkedList<Node> bucket = buckets[bucketIndex];
            Node toRemove = null;
            for (Node node : bucket) {
                if (node.key.equals(key)) {
                    toRemove = node;
                    break;
                }
            }
            if(toRemove!=null){
                V val=toRemove.value;
                bucket.remove(toRemove);
                n--;
                return val;
            }
            return null;
        }

        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(N * 2); // Double the capacity

            for (LinkedList<Node> bucket : oldBuckets) {
                for (Node node : bucket) {
                    put(node.key, node.value); // Re-insert into new buckets
                }
            }
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        mp.put("apple", 1);
        mp.put("banana", 2);
        mp.put("cherry", 3);

        System.out.println(mp.get("apple"));   // Output: 1
        System.out.println(mp.get("grape"));   // Output: null
        System.out.println(mp.remove("banana")); // Output: 2
        System.out.println(mp.get("banana"));   // Output: null
        System.out.println(mp.size());       // Output: 2

    }
}