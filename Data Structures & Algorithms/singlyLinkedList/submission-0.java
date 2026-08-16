class LinkedList {
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;
    Node tail;
    int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node curr = head;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        return curr.val;
    }

    public void insertHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (size == 0) {
            tail = node;
        }

        size++;
    }

    public void insertTail(int val) {
        Node node = new Node(val);

        if (size == 0) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

        size++;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            return false;
        }

        if (index == 0) {
            head = head.next;
            size--;

            if (size == 0) {
                tail = null;
            }

            return true;
        }

        Node curr = head;

        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }

        if (curr.next == tail) {
            tail = curr;
        }

        curr.next = curr.next.next;
        size--;

        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList<>();
        Node curr = head;

        while (curr != null) {
            result.add(curr.val);
            curr = curr.next;
        }

        return result;
    }
}