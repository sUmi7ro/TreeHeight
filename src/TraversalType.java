import java.util.LinkedList;
import java.util.function.Consumer;

public class TraversalType {

    public static <E> void postOrder(Consumer<E> c, Node<E> node) {
        for (Node<E> child : node.getChildren()) {
            postOrder(c, child);
        }
        c.accept(node.getValue());
    }

    public static <E> void inOrder(Consumer<E> c, Node<E> node) {

    }

    //Must have height of tree?????
    public static <E> void leverOrder(Consumer<E> c, Node<E> root){
        LinkedList<Node<E>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node<E> n = queue.remove();
            c.accept(n.getValue());
            for(Node<E> child : n.getChildren()){
                queue.add(child);
            }
        }
    }

    public static <E> void preOrder(Consumer<E> c, Node<E> node) {
        c.accept(node.getValue());
        for (Node<E> child : node.getChildren()) {
            preOrder(c, child);
        }
    }
}
