package LeetCode;

public class MyLinkedList {


        /** Initialize your data structure here. */
        Node head;
        int count;
        public MyLinkedList() {

        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
            //System.out.println(index);
            // System.out.println("count"+count);
            if(index > count-1 || count == 0){
                //  System.out.println("Indiad");
                return -1;
            }
            else{
                // System.out.println("else");
                int localCount = 0;
                Node currentNode = head;
                while(currentNode.next!= null){
                    if(localCount == index){
                        break;
                    }
                    localCount++;
                    currentNode = currentNode.next;

                }
                //System.out.println("get value"+currentNode.val);
                return currentNode.val;
            }
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
            Node newNode = new Node(val);
            if(head == null){
                head = newNode;
                count++;
            }
            else{
                Node currentNode = head;
                newNode.next = currentNode  ;
                head = newNode;
                count++;
            }
        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            Node newNode = new Node(val);

            if(head == null){
                head = newNode;
                count++;
            }
            else{
                Node currentNode = head;
                while(currentNode.next != null){
                    currentNode = currentNode.next;
                }
                currentNode.next = newNode;
                count++;

            }
        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {

            Node newNode = new Node(val);
            Node currentNode = head;
            if(index == count){

                if(index == 0){
                    addAtHead(val) ;
                }
                else{
                    addAtTail(val);
                }
                // count++;
            }
            else if(index > count){

            }
            else{
                Node localNode = head;
                int localCount = 0;
                if(index-1 < 0){
                    addAtHead(val);
                }
                else{
                    while(localNode.next!= null){
                        if(index-1 == localCount){
                            break;
                        }
                        localNode = localNode.next;
                        localCount++;
                    }
                    Node nextNode = localNode.next;
                    localNode.next = newNode;
                    newNode.next = nextNode;
                    count++;
                }
            }


        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {

            if( index > 0  && index < count){
                int localCount = 0;
                Node currentNode = head;
                Node previousNode = null;
                while (currentNode.next!= null){
                    if(index == localCount){
                        break;
                    }
                    previousNode = currentNode;
                    currentNode = currentNode.next;
                    localCount++;
                }

                previousNode.next = currentNode.next;
                count--;


            }
            else if(index == 0){
                Node localNode = head;
                head = localNode.next;
            }

        }

        public class Node{
            public int val;
            public Node next;

            public Node(int data){
                this.val = data;
                this.next = null;
            }


        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

