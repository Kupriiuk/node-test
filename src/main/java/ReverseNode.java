public class ReverseNode {
    public Node reverse(Node node) {
        Node previous = null;
        Node next;

        while (node != null) {
            next = node.next;
            node.next = previous;
            previous = node;
            node = next;
        }
        return previous;
    }
}