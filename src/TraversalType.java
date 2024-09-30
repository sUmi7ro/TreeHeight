import java.util.LinkedList;

public class TraversalType {

    public static <E> void postOrder(Node<E> node) {
        for (Node<E> child : node.getChildren()) {
            postOrder(child);
        }
        System.out.println(node.getValue());
    }

    public static <E> void inOrder(Node<E> node) {

    }

    //Must have height of tree?????
    public static <E> void leverOrder(Node<E> root){
        LinkedList<Node<E>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node<E> n = queue.remove();
            for(Node<E> child : n.getChildren()){
                queue.add(child);
            }
        }
    }

    public static <E> void preOrder(Node<E> node) {
        System.out.println(node.getValue());
        for (Node<E> child : node.getChildren()) {
            preOrder(child);
        }
    }
}
