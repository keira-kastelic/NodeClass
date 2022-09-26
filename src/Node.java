public class Node<N> {
    private Node parent; // creating private varables to store in the node type
    private Node child;
    private N data;

    // constructors
    public void Node () {} // creating an empty constructor

    public void Node (N data){ // creating a data note constructor
        this.data = data;
    }

    public void Node (Node parent, Node child, N data){ // creating a constructor to read in the variables
        this.parent = parent;
        this.child = child;
        this.data = data;
    }
    // methods
    // accessors

    public Node<N> getParent(){
        return parent;
    }

    public Node<N> getChild(){
        return child;
    }

    public N getData(){
        return this.data;
    }


}
