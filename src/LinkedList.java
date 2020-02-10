import javax.swing.plaf.synth.SynthEditorPaneUI;

public class LinkedList {

    Node headNode;
    int count=0;

    public LinkedList(){
        headNode = null;
        count=0;
    }

    public LinkedList(Node newNode){
        headNode = newNode;
        count= 1;
    }


    public void add(int newData){

        Node newNode = new Node(newData);
        Node currentNode = headNode;

        if(headNode == null){
            headNode = new Node(newData);
            count = 1;
        }
        else {

            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
            count++;
        }

    }

    public int get(int index){
        if(index <0 || index > count){
            return -1;
        }
        else {
            Node currentNode = headNode;
            for (int i = 1; i < index; i++) {
                currentNode = currentNode.getNextNode();
            }
            return currentNode.getData();
        }
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return headNode == null;
    }

    public void remove(){
        Node currentNode = headNode;
        while (currentNode.getNextNode() != null){
            Node nextNode = currentNode.getNextNode();
            if(nextNode.getNextNode() == null){
                System.out.println("Inside remove :"+nextNode.getData());
                currentNode.setNextNode(null);
                count--;
            }
            else{
                System.out.println("Inside remove :"+currentNode.getData());

                currentNode = currentNode.getNextNode();
            }

        }


    }

    public static void main(String[] args){
        LinkedList newList = new LinkedList();
        newList.add(34);
        newList.add(56);
        newList.add(788);
        System.out.println(newList.size());
        System.out.println(newList.get(2));
        newList.remove();
        System.out.println(newList.size());
        System.out.println(newList.get(3));
    }

}
