package bst;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int value) {
        Node newNode = new Node(value);

        if (this.root == null) {
            this.root = newNode;
        } else {
            Node currentNode = this.root;
            //while will finish when set the newNode at the left side or right.
            while(true) {
                if (value < currentNode.getValue()) {
                    //left
                    if (currentNode.getLeft() == null) {
                        currentNode.setLeft(newNode);
                        return;
                    }
                    currentNode = currentNode.getLeft();
                } else {
                    if (currentNode.getRight() == null) {
                        currentNode.setRight(newNode);
                        return;
                    }
                    currentNode = currentNode.getRight();
                }
            }
        }
    }

    public boolean remove(int value) {
        if (this.root == null) {
            return false;
        }

        Node currentNode = this.root;
        Node parentNode = null;
        while (true) {
            if (value < currentNode.getValue()) {
                parentNode = currentNode;
                currentNode = currentNode.getLeft();
            } else if (value > currentNode.getValue()) {
                parentNode = currentNode;
                currentNode = currentNode.getRight();
            } else if (currentNode.getValue() == value) {

                //Option 1: No right child node
                if (currentNode.getRight() == null) {
                   if (parentNode == null) {
                       this.root = currentNode.getLeft();
                   } else {

                       // parent > current value, make current left child of a parent
                       if (currentNode.getValue() < parentNode.getValue()) {
                           parentNode.setLeft(currentNode.getLeft());
                       }
                       // parent < current value, make left child  a right child of parent
                       else if (currentNode.getValue() > parentNode.getValue()) {
                           parentNode.setRight(currentNode.getLeft());
                       }
                   }
                }
                //Option 2: Right child which does not have a left child
                else if (currentNode.getRight().getLeft() == null) {
                    currentNode.getRight().setLeft(currentNode.getLeft());
                    if (parentNode == null) {
                        this.root = currentNode.getRight();
                    } else {
                        //parent > current, make right child a right child of the parent
                        if (currentNode.getValue() < parentNode.getValue()) {
                            parentNode.setLeft(currentNode.getRight());
                        }
                        //parent < current, make right child a right child of the parent
                        else if (currentNode.getValue() > parentNode.getValue()) {
                            parentNode.setRight(currentNode.getRight());
                        }
                    }
                }
                //Option 3: Right child that has a left child
                else {
                    //find the right child's left most child
                    Node leftMost = currentNode.getRight().getLeft();
                    Node leftMostParent = currentNode.getRight();
                    while (leftMost.getLeft() != null) {
                        leftMostParent = leftMost;
                        leftMost = leftMost.getLeft();
                    }

                    //parent's left subtree is now leftmost's right subtree
                    leftMostParent.setLeft(leftMost.getRight());
                    leftMost.setLeft(currentNode.getLeft());
                    leftMost.setRight(currentNode.getRight());

                    if (parentNode == null) {
                        this.root = leftMost;
                    } else {
                        if (currentNode.getValue() < parentNode.getValue()) {
                            parentNode.setLeft(leftMost);
                        } else if (currentNode.getValue() > parentNode.getValue()) {
                            parentNode.setRight(leftMost);
                        }
                    }
                }
                return  true;
            }
        }
    }

    public boolean lookup(int value) {
        if (this.root == null) {
            return false;
        }

        Node currentNode = this.root;

        if (currentNode.getValue() == value) {
            return true;
        }
        while (currentNode != null) {
            if (value < currentNode.getValue()) {
                currentNode = currentNode.getLeft();
                if (currentNode != null && currentNode.getValue() == value) {
                    return true;
                }
            } else {
                currentNode = currentNode.getRight();
                if (currentNode != null && currentNode.getValue() == value) {
                    return true;
                }
            }
        }
        return false;
    }
}
