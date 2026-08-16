class MyHashMap {
    int[] map = new int[1000001];
    boolean[] present = new boolean[1000001];

    public MyHashMap() {
    }

    public void put(int key, int value) {
        map[key] = value;
        present[key] = true;
    }

    public int get(int key) {
        return present[key] ? map[key] : -1;
    }

    public void remove(int key) {
        present[key] = false;
    }
}