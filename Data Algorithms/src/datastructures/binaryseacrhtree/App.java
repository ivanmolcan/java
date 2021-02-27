package datastructures.binaryseacrhtree;

public class App {

    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(10, "desat");
        tree.insert(20, "dvadsat");
        tree.insert(15, "patnast");

        System.out.println(tree.findMin().key);
        System.out.println(tree.findMax().key);

        System.out.println(tree.remove(10));
        System.out.println(tree.findMin().key);
    }

}
