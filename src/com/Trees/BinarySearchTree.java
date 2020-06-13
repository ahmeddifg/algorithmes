package com.Trees;

import java.util.*;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node insert(int value) {
        if (this.root == null) {
            this.root = new Node(value);
            this.root.data = value;
            return this.root;
        } else {
            Node newNode = new Node(value);
            Node currentNode = root;
            while (currentNode != null) {
                if (currentNode.data > newNode.data) {
                    if (currentNode.left != null) {
                        currentNode = currentNode.left;
                    } else {
                        currentNode.left = newNode;
                        return currentNode.left;
                    }
                } else {
                    if (currentNode.right != null) {
                        currentNode = currentNode.right;
                    } else {
                        currentNode.right = newNode;
                        return currentNode.right;
                    }
                }
            }
        }
        return null;
    }

    public Node find(Node nodeData) {
        Node currentNode = this.root;
        while (currentNode != null) {
            if (currentNode.data == nodeData.data) {
                return currentNode;
            } else if (nodeData.data > currentNode.data) {
                if (currentNode.right != null) {
                    currentNode = currentNode.right;
                } else return null;
            } else {
                if (nodeData.data < currentNode.data) {
                    if (currentNode.left != null) {
                        currentNode = currentNode.left;
                    } else return null;
                }
            }
        }
        return null;
    }

    public void printLevelByLevel(Node root) {
        if (root == null)
            return;
        Queue<Object> myQueue = new LinkedList<>();
        if (root != null) {
            myQueue.add(root);
            myQueue.add("*");
        }
        while (true) {
            Object current = myQueue.poll();
            if (!(current + "").equals("*")) {
                Node temp = (Node) current;
                System.out.print(temp.data + " ");
                if (temp.right != null)
                    myQueue.add(temp.right);
                if (temp.left != null)
                    myQueue.add(temp.left);
            } else {
                System.out.println("");
                if (myQueue.isEmpty())
                    break;
                myQueue.add("*");
            }

        }

    }

    //Binary-search-tree-lowest-common-ancestor
    public Node lca(Node root, int v1, int v2) {
        if (v1 > root.data && v2 > root.data) {
            return lca(root.right, v1, v2);
        }
        if (v1 > root.data && v2 > root.data) {
            return lca(root.left, v1, v2);
        }
        return root;
    }

    boolean checkBST(Node root) {
        return false;
    }

    public void implementBreathFirstSearch(Node root) {
        Queue<Node> tempQueue = new LinkedList<>();
        ArrayList<Node> list = new ArrayList<>();
        Node current = null;
        if (root == null)
            return;
        tempQueue.add(root);
        while (!tempQueue.isEmpty()) {
            current = tempQueue.poll();
            list.add(current);
            if (current.left != null) {
                tempQueue.add(current.left);
            }
            if (current.right != null) {
                tempQueue.add(current.right);
            }
        }
        list.stream().map(e -> e.data).forEach(System.out::println);
    }

    public ArrayList<Node> implementBreathFirstSearchR(Queue<Node> nodes, ArrayList<Node> list) {
        if (nodes.isEmpty()) {
            return list;
        }
        Node current = nodes.poll();
        list.add(current);
        if (current.left != null) {
            nodes.add(current.left);
        }
        if (current.right != null) {
            nodes.add(current.right);
        }
        return implementBreathFirstSearchR(nodes, list);
    }

    public void printPreOrder(Node root) {

    }

    public void printPostOrder(Node root) {

    }

    public void printInOrder(Node root) {
        ArrayList<Node> list=new ArrayList<>();
        list=inOrderTraverse( root, list);
        list.stream().map(e->e.data).forEach(System.out::println);
    }

    public ArrayList<Node> inOrderTraverse(Node current, ArrayList<Node> list) {
        if(root==null)
            return list;
        if(current.left!=null)
            inOrderTraverse(current.left,list);
        list.add(current);
        if(current.right!=null) {
            inOrderTraverse(current.right, list);
        }
        return list;
    }


    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(9);
        binarySearchTree.insert(20);
        binarySearchTree.insert(100);
        binarySearchTree.insert(15);
        binarySearchTree.insert(4);
        binarySearchTree.insert(6);
        binarySearchTree.insert(1);
//        binarySearchTree.implementBreathFirstSearch(binarySearchTree.root);
        ArrayList<Node> list = new ArrayList<>();
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(binarySearchTree.root);
        binarySearchTree.printInOrder(binarySearchTree.root);
//        list=binarySearchTree.implementBreathFirstSearchR(nodes,list);
//        list.stream().map(e->e.data).forEach(System.out::println);


    }
}
