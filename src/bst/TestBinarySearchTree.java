package bst;

public class TestBinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(60);
        tree.insert(30);
        tree.insert(14);
        tree.insert(1);
        tree.insert(54);
        tree.insert(38);
        tree.insert(44);
        tree.insert(55);
        tree.insert(72);
        tree.insert(73);

        tree.remove(54);
    }
}
