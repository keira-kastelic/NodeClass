public class ArrayListNode {
    private Node root; // creating instance variables
    private int length = 1;

    public ArrayListNode (){ // creating an empty constructor
        this.root = root;
    }

    boolean add (Node bucket){ // creating an add boolean method
        Node temp = root; // adding a temporary Node to keep track of the last node
        while (temp.getChild() != null) { // looping through all the filled nodes
            temp = temp.getChild(); // setting the temp to the latest node
            length += 1;
        }
        temp.setChild(bucket); // adding to the last node
        return true; // returning true
    }

    void add (int index, Node bucket){ // creating a method to set the index of the node
        Node temp = root; // creating a temporary node
        for (int i = 0; i <= index; i++){ // looping through the nodes until the last one before the index
            temp = temp.getChild(); // updating the temp node
        }
        temp.setChild(bucket); // setting the node to its index
    }




}
