package LC_707_Design_Linked_List;

class MyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public void addAtHead(int val) {
        Node newNode = new Node();
        newNode.val = val;
        newNode.next = head;

        if (head == null) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }

        head = newNode;
        size++;
    }

    public void addAtTail(int val) {
        if (head == null) {
            head = new Node();
            head.val = val;
            tail = head;
        } else {
            Node searchNode = head;

            while (searchNode.next != null) {
                searchNode = searchNode.next;
            }

            Node newNode = new Node();
            newNode.val = val;
            newNode.prev = searchNode;

            searchNode.next = newNode;
            tail = newNode;
        }
        size++;
    }

    private Node findNodeByIndex(int index) {
        Node searchNode;

        int mid = size / 2;
        if (index <= mid) {
            searchNode = head;

            int i = 0;
            while (i++ < index) {
                searchNode = searchNode.next;
            }
        } else {
            searchNode = tail;

            int i = size - 1;
            while (i-- > index) {
                searchNode = searchNode.prev;
            }
        }

        return searchNode;
    }

    public int get(int index) {
        if (index > size - 1) return -1;

        return findNodeByIndex(index).val;
    }

    public void addAtIndex(int index, int val) {

        if (index > size) System.out.println("Max possible index: " + size);
        else if (index == 0) addAtHead(val);
        else if (index == size) addAtTail(val);
        else {
            Node nodeAtIndex = findNodeByIndex(index);
            Node newNode = new Node();
            newNode.val = val;
            newNode.next = nodeAtIndex;
            newNode.prev = nodeAtIndex.prev;

            Node prevNode = nodeAtIndex.prev;
            prevNode.next = newNode;

            nodeAtIndex.prev = newNode;

            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index <= size - 1 && size != 0) {
            Node nodeAtIndex = findNodeByIndex(index);

            Node prevNode = nodeAtIndex.prev;
            Node nextNode = nodeAtIndex.next;

            if (prevNode == null) head = nextNode;
            else prevNode.next = nextNode;

            if (nextNode == null) tail = prevNode;
            else nextNode.prev = prevNode;

            nodeAtIndex.next = null;
            nodeAtIndex.prev = null;

            size--;
        }
    }
}

class Node {

    int val;
    Node next;
    Node prev;

}