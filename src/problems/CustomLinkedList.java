package problems;

public class CustomLinkedList<T> {

    class Node<T> {

        private T data;
        private Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    Node<T> head, curr;

    public void add(T data) {

        Node<T> node = new Node(data);

        if (head == null) {
            head = node;
            curr = head;
        } else {
            curr.next = node;
            curr = node;
        }
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public T middleElement() {

        Node<T> slow, fast = slow = head;
        while (fast != null && fast.next != null) {

            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }

    public boolean cyclicDetection() {
        Node<T> slow, fast = slow = head;
        while (fast != null && fast.next != null) {

            if (fast == slow)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        CustomLinkedList<Integer> customLinkedList = new CustomLinkedList<>();
        customLinkedList.add(1);
        customLinkedList.add(3);
        customLinkedList.add(4);
        customLinkedList.add(5);

        // customLinkedList.display();

        System.out.println(customLinkedList.middleElement());
    }

}
