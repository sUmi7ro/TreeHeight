import java.util.LinkedList;

public class Tree<E> implements TreeADT<E>{
    private Node<E> root=null;

    @Override
    public void addRoot(E value, LinkedList<Node<E>> children){
        if(root == null){
            root = addNode(value, children);
        } else{
            throw new IllegalStateException("Root exists");
        }
    }

    @Override
    public Node<E> addNode(E value, LinkedList<Node<E>> children){
        if(value == null) throw new NullPointerException();
        Node<E> newNode = new Node<>(value, children);
        return newNode;
    }

    @Override
    public Node<E> getRoot(){return root;};

    public static <E> int getHeight(Node<E> node){
        return recursiveHeight(node)-1;
    }

    public static <E> int recursiveHeight(Node<E> node){
        int height = 0;

        if(node.getChildren().isEmpty()) return 1;
        for(Node<E> child : node.getChildren()){
            int childH = recursiveHeight(child);
            if(childH > height) height = childH;
        }
        return height;
    }
}
