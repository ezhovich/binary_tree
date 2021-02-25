public class App {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(3);
        tree.insert(11);
        tree.insert(21);
        tree.insert(8);
        Node start = tree.find(10);
        System.out.println(tree.sumTree(start));
        tree.deleteNode(3);
        System.out.println(tree.sumTree(start));
    }
}
