public class Node {
    private int data;
    private Node leftChild;
    private Node rightChild;

    public int getData(){
        return data;
    }

    public void setData(int nodeData){
        data = nodeData;
    }

    public Node getLeftChild(){
        return leftChild;
    }

    public void setLeftChild(Node node){
        leftChild = node;
    }

    public Node getRightChild(){
        return rightChild;
    }

    public void setRightChild(Node node){
        rightChild = node;
    }

    public void printNode(){
        System.out.println(data);
    }
}


