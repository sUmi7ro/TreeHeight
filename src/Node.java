import java.util.LinkedList;

public class Node<E> {
    private E value;
    private LinkedList<Node<E>> children;

    public Node(E value, LinkedList<Node<E>> children){
        setValue(value);
        setChildren(children);
    }

    public LinkedList<Node<E>> getChildren(){
        return this.children;
    }
    public E getValue(){
        return value;
    }

    public void setValue(E value){
        this.value = value;
    }
    public void setChildren(LinkedList<Node<E>> children){
         this.children = children;
    }
    public void addChild(Node<E> child){
        this.children.add(child);
    }
}
