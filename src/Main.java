import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Tree<Character> tree = new Tree<>();
        tree.addRoot('a', new LinkedList<>());

        createNodes(tree);



        TraversalType.preOrder(tree.getRoot());
        System.out.println("-----------------------------");
        TraversalType.postOrder(tree.getRoot());
        System.out.println("-----------------------------");
        TraversalType.inOrder(tree.getRoot());
        System.out.println("-----------------------------");
        System.out.println("Height of this tree is: "+getHeight(tree.getRoot()));
    }

    public static void createNodes(Tree<Character> tree){
        Node<Character> rootNode = tree.getRoot();
        Node<Character> nK = tree.addNode('k', new LinkedList<>());
        Node<Character> nJ = tree.addNode('j', new LinkedList<>());
        Node<Character> nI = tree.addNode('i', new LinkedList<>());
        Node<Character> nH = tree.addNode('h', new LinkedList<>());
        Node<Character> nG = tree.addNode('g', new LinkedList<>());
        Node<Character> nF = tree.addNode('f', new LinkedList<>());
        Node<Character> nE = tree.addNode('e', new LinkedList<>());
        Node<Character> nD = tree.addNode('d', new LinkedList<>());
        Node<Character> nC = tree.addNode('c', new LinkedList<>());
        Node<Character> nB = tree.addNode('b', new LinkedList<>());


        nB.addChild(nD);
        nB.addChild(nE);

        nC.addChild(nF);

        nD.addChild(nG);
        nD.addChild(nH);

        nE.addChild(nI);
        nE.addChild(nJ);

        nG.addChild(nK);

        rootNode.addChild(nB);
        rootNode.addChild(nC);
    }

    public static void createRandomNodes(Tree<Character> tree){
        Random rand = new Random();
        int randNum = rand.nextInt(3)+1;

        LinkedList<Node<Character>> list = new LinkedList<>();
        for (int i = 0; i < randNum; i++) {

        }
    }


    public static <E> int getHeight(Tree<E> tree){
        return recursiveHeight(tree.getRoot())-1;
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


    public static enum DepthFirstTraversalType{
        PREORDER, INORDER, POSTORDER
    }
/*
    public <E> void traverseDepthFirst(Consumer<E> c, Node<E> n, DepthFirstTraversalType tOrder){
        if(n == null) return;
        if(tOrder == DepthFirstTraversalType.PREORDER) {
            c.accept(n.getValue());


            traverseDepthFirst(c, n, tOrder);
        }
        if(tOrder == DepthFirstTraversalType.INORDER) {
            c.accept(n.getValue());
            TraversalType.inorder();
        }
        if(tOrder == DepthFirstTraversalType.POSTORDER) {
            c.accept(n.getValue());
            TraversalType.postorder();
        }
    }
    */
}