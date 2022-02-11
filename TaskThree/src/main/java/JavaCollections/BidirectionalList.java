package JavaCollections;

public class BidirectionalList implements BidirectionalListInterface {

    private Node head;
    private Node tail;
    private int actualSize = 0;


    @Override
    public int size() {
        return actualSize;
    }

    @Override
    public void addElements(String element) {
        addTail(element);
    }

    @Override
    public void addElementsToIndex(String element, int index) {
        if (index < 0 || index > actualSize) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == 0) {
            addHead(element);
        } else if (index == actualSize) {
            addTail(element);
        }
        Node previousNode = head;

        for (int i = 0; i < index - 1; i++) {
            previousNode = previousNode.next;
        }

        Node nextNode = previousNode.next;
        Node node = new Node(element);

        node.next = nextNode;
        node.previous = previousNode;
        previousNode.next = node;
        nextNode.previous = node;
        actualSize++;
    }


    @Override
    public void remove(int index) {

        if (index < 0 || index >= actualSize) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (actualSize == 0) {
            return;
        }

        if (index == 0) {
            removeHead();
            return;
        } else if (index == actualSize - 1) {
            removeTail();
            return;
        }

        Node previousNode = head;
        for (int i = 0; i < index - 1; i++) {
            previousNode = previousNode.next;
        }

        Node node = previousNode.next;
        Node nextNode = node.next;
        previousNode.next = nextNode;
        nextNode.previous = previousNode;
    }

    private void addHead(String element) {
        Node node = new Node(element);
        node.next = head;
        if (head != null) {
            head.previous = node;
        }
        head = node;

        if (actualSize == 0) {
            tail = head;
        }
        actualSize++;
    }


    private void addTail(String element) {
        if (actualSize == 0) {
            addHead(element);
            return;
        }
        Node node = new Node(element);
        tail.next = node;
        node.previous = tail;
        tail = node;
        actualSize++;
    }

    public void removeHead() {
        if (actualSize == 0) {
            return;
        }

        head = head.next;
        if (head != null) {
            head.previous = null;
        }
        actualSize--;
    }

    public void removeTail() {
        if (actualSize == 0) {
            return;
        }
        if (actualSize == 1) {
            removeHead();
            return;
        }

        tail = tail.previous;
        tail.next = null;

        actualSize--;
    }
}
