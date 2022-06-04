package com.archanajl.codewars;

import java.util.*;

import com.archanajl.codewars.binarytree.BinaryTree;
import com.archanajl.codewars.binarytree.Node;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {
    @Test
    public void nullTest() {
        assertEquals(Arrays.asList(), BinaryTree.treeByLevels(null));
    }

    @Test
    public void basicTest() {
        assertEquals(Arrays.asList(1,2,3,4,5,6), BinaryTree.treeByLevels(new Node(new Node(null, new Node(null, null, 4), 2),
                new Node(new Node(null, null, 5), new Node(null, null, 6), 3), 1)));
    }
}