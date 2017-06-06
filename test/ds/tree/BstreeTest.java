package ds.tree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

import ds.tree.Bstree;

public class BstreeTest {

    static Comparator<String> c = (a,b) -> a.compareTo(b);
    Bstree<String> tree;
    @Before
    public void setUp() throws Exception {
        tree = new Bstree<>(c);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test_tree_structure() {
        /* 
         *   M F J Q U H R D
         * 
         *         +-  M1  -+
         *        /          \     
         *      F2            Q4
         *    /    \             \
         *   D8     J3            U5
         *         /             /
         *        H6           R7
         *             
         */
        String [] token = "MFJQUHRD".split("");
        for(String s : token ) {
            tree.insert(s);
        }
        // 1. HEIGHT : 3
        assertEquals ( 3, tree.height());
        
        // 2. path
        // M-F-J-H
        assertEquals ( "H", tree.root().left().right().left().value());
        // M-F-D
        assertEquals ( "D", tree.root().left().left().value());
        // M-Q-U-R
        assertEquals ( "R", tree.root().right().right().left().value());
        
        // 3. left most, right most
        assertEquals ( "D", tree.getLeftMostData());
        assertEquals ( "U", tree.getRightMostData());
        
        // 4. search 
        assertTrue ( tree.contains("J"));
        assertTrue ( tree.contains("R"));
        assertFalse ( tree.contains("X"));
        
        // 4. leat node
        assertEquals ( Arrays.asList("D", "H", "R"), tree.findLeafData());
    }

}

