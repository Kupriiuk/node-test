public class Main {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        ReverseNode reverseNode = new ReverseNode();
        System.out.println(reverseNode.reverse(node));
    }
}
