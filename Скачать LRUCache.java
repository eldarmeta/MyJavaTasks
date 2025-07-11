
import java.util.*;

public class LRUCache {
    private final int capacity;
    private final Map<Integer, Integer> map;
    private final Deque<Integer> usage;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.usage = new LinkedList<>();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        usage.remove(key);
        usage.addFirst(key);
        return map.get(key);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            usage.remove(key);
        } else if (map.size() >= capacity) {
            int lru = usage.removeLast();
            map.remove(lru);
        }

        map.put(key, value);
        usage.addFirst(key);
    }

    public void printCacheState() {
        System.out.println("Current cache state: " + usage);
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);
        cache.put(3, 3);
        cache.printCacheState();  // Should be [3, 1]
        System.out.println(cache.get(2)); // -1
    }
}
