package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyLinkedList<E> implements MyList<E>{
    private Node<E> first;
    private int size= 0;

    public void add(E e){
        Node<E> newNode = new Node<>(e);
        //첫번째면
        if(first ==null){
            first = newNode;
        }
        else{
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }


    //추가코드
    public void add(int index, E e){
        Node<E> newNode = new Node<>(e);
        if(index==0){
            newNode.next = first;
            first = newNode;
        }
        else{
            Node<E> prevNode = getNode(index-1);
            newNode.next=prevNode.next;
            prevNode.next = newNode;
        }
        size++;
    }


    //삭제
    public E remove(int index){
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        if(index==0){
          first =  removeNode.next;
        }else{
            Node<E> node = getNode(index - 1);
            node.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }
    


    private Node<E> getLastNode(){
        Node<E> x = first;
        while(x.next !=null){
           x = x.next;
        }
        return x;
    }

    public E set(int index ,E element){
        Node<E> findNode = getNode(index);
        E oldValue = findNode.item;
        findNode.item = element;
        return oldValue;
    }

    public E get(int index){
        Node<E> findNode = getNode(index);
        return findNode.item;
    }

    private Node<E> getNode(int index){
        Node<E> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int indexOf(E o){
        int index=0;
      for(Node<E> x = first; x != null ;  x = x.next){
        if(o.equals(x.item)){
            return index;
        }
          index++;
      }
        return -1;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }


    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;

        }


        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x= this;
            String arrow = "->";
            sb.append("[");
            while(true){
                sb.append(x.item);
                x =  x.next;
                if(x==null){
                    break;
                }
                sb.append("->");
            }
            sb.append("]");


            return sb.toString();
        }


    }
}
