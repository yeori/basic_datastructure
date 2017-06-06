package ds.tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * binary search tree
 * 
 * @author chmin.seo
 *
 */
public class Bstree<T> {

    /**
     * used for sorting data in Node.insert() 
     */
    private Comparator<T> comparing;

    private Node<T> root;
    
    public Bstree(Comparator<T> comp) {
        comparing = comp;
    }
    
    public Node<T> root() {
        return root;
    }
    
    /**
     * insert the given user data into this tree
     * @param userData
     * @return
     */
    public Bstree<T> insert ( T userData ) {
        Node<T> newNode = new Node<T>(userData, comparing);
        if ( root == null) {
            root = newNode;
        } else {
            // FIXME should implement Node.insert()
            root.insert (newNode );
        }
        return this;
    }
    /**
     * the height of tree
     * @return
     */
    public int height() {
        if ( root == null) {
            throw new RuntimeException("empty tree has no height");
        }
        
        // FIXME should implement Node.height();
        return root.height();
    }
    /**
     * number of nodes
     * @return
     */
    public int countNodes () {
        if ( root == null) {
            return 0;
        }
        
        /*
         * FIXME should implement Node.countNodes()
         * 
         */
        return root.countNode();
    }
    /**
     * find the left most node and return user data
     * <pre>
     *           [ROOT]
     *           /
     *        [left]
     *        /
     *      ...
     *     /
     * [[LEFT MOST]]
     *           \
     *         [right or null]
     * </pre>  
     * @return
     */
    public T getLeftMostData() {
        // FIXME from root to root.left().left() ... until not null
        return null;
    }
    /**
     * find the right most node and return user data
     * <pre>
     *   [ROOT]
     *        \
     *       [right]
     *            \
     *            ...
     *              \
     *            [[RIGHT MOST]]
     *             /
     *  [left or null]
     * </pre>  
     * @return
     */
    
    public T getRightMostData() {
        // FIXME from root to root.right().right().right() ... until not null
        return null;
    }
    /**
     * check if the data exists in this three
     * @param data
     * @return true if exists, false if not exists
     */
    public boolean contains ( T data ) {
        // FIXME use node.value().equals ( data ) for each node
        return false;
    }
    /**
     * returns all leaf nodes
     * @return list of leaf nodes
     */
    public List<T> findLeafData ( ) {
        List<T> leaves = new ArrayList<>();
        /*
         * FIXME add data in the leaf nodes into the list 'leaves'
         * two ways for implementations
         * 1. Queue + node.isLeaf()
         * 2. recursive call + node.isLeaf();
         */
        
        return leaves;
    }
    /**
     * 
     * find sibling data
     * <pre>
     *   sibling nodes - same parent!
     *   
     *          [parent]
     *            /  \
     *           /    \
     *          A      B
     *  
     *  if userData is in node A, sibling data is in B(if B is not null)
     *  if userData is in node B, sibling data is in A(if A is not null)
     *  if no sibling node, return null
     *  
     *  if userData does not exist, throw any runtime exception
     *  
     *  Root node has no sibling
     * </pre>
     * 
     * @param data
     * @return
     */
    public T siblingData( T userData ) {
        return null;
    }
    /**
     * find tree node containing the given user data, or return null if not exist 
     * @param userData
     * @return tree node containing userData
     */
    public Node<T> findNode( T userData) {
        /*
         * FIXME 
         */
        return null;
    }

    /**
     * <pre>
     * find the closest common anscestor of two nodes
     * (d1 and d2 should exist in this tree)
     * </pre>
     * @param d1 data existing in this tree
     * @param d2 data existing in this tree
     * @return closest common ancestor node
     * @throws RuntimeException if either d1 or d2 is null
     */
    public Node<T> closestAnscestor ( T d1, T d2) {
        /*
         * FIXME three cases
         * 
         * 1) both are left side
         *            node
         *           /
         *         ...
         *       /    \
         *     dx     ...
         *             |
         *             dy
         *             
         * 2) both are right side
         *  
         *             node
         *                 \
         *                 ...
         *               /    \
         *             dx     ...
         *                     dy
         * 
         * 3) one is at left, another is at right
         * 
         *             node
         *           /      \
         *          ...     ...
         *         /          \
         *        dx          ...
         *                     dy
         */
        return null;
    }
}
