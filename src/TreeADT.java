import java.util.LinkedList;

public interface TreeADT<E> {
    void addRoot(E value, LinkedList<Node<E>> children);
    Node<E> addNode(E value, LinkedList<Node<E>> children);
    public Node<E> getRoot();
}
