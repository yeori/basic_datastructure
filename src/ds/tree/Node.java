package ds.tree;

import java.util.Comparator;

/**
 * tree node containing user data and links to a parent and children(left, right)
 * 
 * <pre>
 *            parent
 *              ^
 *              |
 *          +---+---+
 *          |       |
 *          | value------> ref to user data 
 *          |       |
 *          +---+---+
 *          | L | R |
 *          +---+---+
 *         /         \
 *        /           \
 *   left node     right node
 *            
 * </pre>
 * @author chmin.seo
 *
 * @param <T>
 */
public class Node<T> {
    T value;
    
    Node<T> parent, left, right;

    Comparator<T> c ;
    Node( T data, Comparator<T> c ) {
        parent = null;
        value = data;
        this.c = c;
    }
    /**
     * returns parent node
     * @return
     */
    public Node<T> parent() {
        return parent;
    }
    /**
     * returns left child node
     * 
     * @return left child( may be null )
     */
    public Node<T> left() {
        return left;
    }
    /**
     * return right child node
     * 
     * @return right child( may be null )
     */
    public Node<T> right() {
        return right;
    }
    /**
     * return user data in this node
     * @return
     */
    public T value() {
        return value;
    }
    /**
     * whether it has left child node
     * @return true if left child exists, false if not exists
     */
    boolean hasLeft() {
        return left != null;
    }
    
    /**
     * whether it has right child node
     * @return true if right child exists, false if not exists
     */
    boolean hasRight() {
        return right != null;
    }
    /**
     * whether this node is root
     * @return true if root, false otherwise
     */
    boolean isRoot () {
        return parent == null;
    }
    /**
     * leaf node if no children exists
     * @return
     */
    boolean isLeaf() {
        return left == null && right == null;
    }
    /**
     * insert the given node into left or right
     * 
     * @param node
     */
    void insert(Node<T> node) {
        /*
         * TODO if ( node <= this ) goto left;
         *      else goto right
         * 
         * use comparator this.c for comparing nodes
         */
    }

    /**
     * return height of this node
     * @return
     */
    public int height() {
        /* 
         * TODO not implemented!
         * 
         * return 0 if leaf node
         * return 1 + MAX(height_of_left , height_of_right ) if not leaf node
         */
        return 0;
    }
    /**
     * <pre>
     * depth of this node
     * (depth of root is 0)
     * </pre>
     * @return
     */
    public int depth() {
        /*
         * TODO not implemented
         * 
         * return 0 if root node
         * return 1 + depth_of_parent if not root node
         */
        return 0;
    }
    /**
     * number of all nodes
     * @return
     */
    public int countNode() {
        /*
         * TODO count number of nodes recursively 
         * 
         * Leaf node returns 1
         * Non-leaf nodes return 1 + count_left + count_right
         * 
         */
        return -1;
    }
    
    
}