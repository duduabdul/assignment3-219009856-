public class Node {
    int element;
    Node next;

    private Node(int element, Node next){
        this.element = element;
        this.next = next;
    }

    public static void main(String[] args) {
//        Node node2 = new Node(2, null);
//        Node node1 = new Node(1, null);
//        node1.next = node2;
//        Node head  = new Node(1,
//                new Node(2,
//                        new Node(3,
//                                new Node(4,
//                                        new Node(5, null))))
//                );
        // node creation phase
        Node head = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);
        Node node4 = new Node(4, null);
        Node node5 = new Node(5, null);

        // node linking phase
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

    }
}
