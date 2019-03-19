package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    private Node root;
    private int size;

    public SinglyLinkedList() {
        this.root = new Node();
        size = 0;
    }

    public void setSize(int s) {
        this.size = s;
    }

    public int getSize() {
        return this.size;
    }



    public Node add(int data) {
        Node newNode = new Node(data, root);
        this.root = newNode;
        this.size++;
        return newNode;
    }

    public int get(int index) throws Exception {

        Node tempNode = root;
        if (index < 0 || index > size)
            throw new Exception("Invalid Index");
        else
            for (int i = 0; i < index; i++) {
                tempNode = tempNode.nextNode;

            }
        return tempNode.getData();

    }

    public Node find(int data) {
        Node thisNode = this.root;
        while (thisNode != null) {
            if (thisNode.getData() == data)
                return thisNode;
            thisNode = thisNode.getNextNode();
        }
        return null;
    }


    public boolean remove(int data) {
        Node thisNode = this.root;
        Node prevNode = thisNode;

        while ((thisNode != null)) {
            if (thisNode.getData() == data) {
                prevNode.setNextNode(thisNode.getNextNode());
                this.setSize(this.getSize() - 1);
                return true;
            }
            prevNode = thisNode;
            thisNode = thisNode.getNextNode();

        }
        return false;
    }


    public boolean contains(int data) throws Exception {
        Node thisNode = this.root;
        Node prevNode = thisNode;
        for (int i = 0; i < size; i++) {

            if (data == get(i)) {

            }
            return true;
        }

        return false;

    }



    public Node copy(){

        Node current = root;
        Node tail;
        Node dummy = new Node();
        tail = dummy;
        while (current !=null){

            tail.nextNode = new Node(current.data, tail.nextNode);
            tail = tail.nextNode;
            current = current.nextNode;
        }

        return dummy.nextNode;

    }

    public Node sort(){
        Node currentNode= root;
        Node next = root.nextNode;


        if(size>1) {
            for (int i = 0; i < size; i++) {
                currentNode = root;
                next = root.nextNode;
                for (int j = 0; j < size - 1; j++) {
                    if (currentNode.data > next.data) {

                        int temp = currentNode.data;
                        currentNode.data = next.data;
                        next.data = temp;
                    }
                    currentNode = next;
                    next = next.nextNode;
                }
            }
        }
        return next;
    }


    public void reverse(){
        Node pointer = root;
        Node previous = null;

        while (pointer != null){

          Node  current = pointer;
            pointer = pointer.nextNode;

            current.nextNode = previous;
            previous = current;
            root= current;

        }
       // return root;

    }


    public void print(){
        Node node = root;
        while(node!=null){
            System.out.print(node.getData() + " ");
            node = node.nextNode;

        }
        System.out.println("");
    }



    private class Node {

        private Node nextNode;
        private int data;

        private Node() {
        }

        private Node(int val) {
            this.data = val;

        }

        private Node(int val, Node next) {
            data = val;
            nextNode = next;
        }

        private void setData(int val) {
            this.data = val;

        }


        private int getData() {
            return this.data;
        }

        private void setNextNode(Node n) {
            this.nextNode = n;
        }

        private Node getNextNode() {
            return this.nextNode;
        }

    }


}
