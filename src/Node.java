public class Node {

    Node nextNode;
    int data;

    public Node(int newData){
        data = newData;
        nextNode = null;
    }

    public Node(Node newNode, int newData){
        nextNode = newNode;
        data = newData;
    }


    public Node getNextNode(){
        return nextNode;
    }

    public int getData(){
        return data;
    }


    public void setNextNode(Node newNextNode){
        nextNode = newNextNode;
    }

    public void setData(int newData){
        data = newData;
    }
}
