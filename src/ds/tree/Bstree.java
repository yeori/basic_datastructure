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
	 * find the left most node and return user data
	 * <pre>
	 *           [ROOT]
	 *           /
	 *        [left]
	 *        /
	 *      ...
	 *     /
	 * [[left most]]
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
	 *            [[right most]]
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
		// FIXME use data.equals()
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
	
	public T findSibling( T data ) {
		return null;
	}
}
