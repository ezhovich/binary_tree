public class BinaryTree {
    Node root;

    public void insert(int data){
        Node node = new Node();
        node.setData(data);
        if(root == null){
            root = node;
        }else{
            Node current = root;
            Node previous = null;
            while (true){
                previous = current;
                if(data < previous.getData()){
                    current = current.getLeftChild();
                    if(current == null){
                        previous.setLeftChild(node);
                        return;
                    }
                }
                else {
                    current = current.getRightChild();
                    if(current == null){
                        previous.setRightChild(node);
                        return;
                    }
                }
            }
        }
    }

    public void deleteNode(int key){
        Node current = root;
        Node previous = null;
        while (current.getData() != key){
            if(current.getData() > key){
                previous = current;
                current = current.getLeftChild();
            } else {
                previous = current;
                current = current.getRightChild();
            }
        }
        if (previous.getData() > key){
            previous.setLeftChild(null);
        }
        else {
            previous.setRightChild(null);
        }

    }

    public Node find(int key){
        Node current = root;
        while (current.getData() != key){
            if(current.getData() > key){
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
            if(current == null){
                return null;
            }
        }
        return current;
    }

    public int sumTree(Node startNode){
        int res = 0;
        if(startNode != null){
            res += sumTree(startNode.getLeftChild());
            res += startNode.getData();
            res += sumTree(startNode.getRightChild());
        }
        return res;
    }

}
