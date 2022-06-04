package com.archanajl.codewars.binarytree;

import java.util.*;

public class BinaryTree {
    public static List<Integer> treeByLevels(Node node)
    {
        List<Integer> sortList = new ArrayList<>();

        int treeheight = findHeight(node);

        for (int level = 1; level <= treeheight; level ++){
            addToList(sortList, level, node);
        }

        return sortList;
    }

    public static List<Integer> addToList(List<Integer> sortList, int level, Node node){
        if (node == null){
            return sortList;
        }
        if (level == 1){
            sortList.add(node.value);

        } else if (level > 1){
            addToList(sortList, level - 1 , node.left);
            addToList(sortList, level - 1 , node.right);
        }
        return sortList;
    }
    public static int findHeight(Node node){

        if (node == null)
            return 0;

        else{

            int lheight = findHeight(node.left);
            int rheight = findHeight(node.right);
            if (lheight > rheight)
                return lheight + 1;
            else
                return rheight + 1;

        }
    }
}