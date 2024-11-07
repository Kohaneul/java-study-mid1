package collection.link;

public class MyLinkedListV2 {
    private Node first;
    private int size= 0;

    public void add(Object e){
        Node newNode = new Node(e);
        //첫번째면
        if(first ==null){
            first = newNode;
        }
        else{
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }


    //추가코드
    public void add(int index, Object e){
        Node newNode = new Node(e);
        if(index==0){
            newNode.next = first;
            first = newNode;
        }
        else{
            Node prevNode = getNode(index-1);
            newNode.next=prevNode.next;
            prevNode.next = newNode;
        }
        size++;
    }


    //삭제
    public Object remove(int index){
        Node removeNode = getNode(index);
        Object removedItem = removeNode.item;
        if(index==0){
          first =  removeNode.next;
        }else{
            Node node = getNode(index - 1);
            node.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }
    


    private Node getLastNode(){
        Node x = first;
        while(x.next !=null){
           x = x.next;
        }
        return x;
    }

    public Object set(int index ,Object element){
        Node findNode = getNode(index);
        Object oldValue = findNode.item;
        findNode.item = element;
        return oldValue;
    }

    public Object get(int index){
        Node findNode = getNode(index);
        return findNode.item;
    }

    private Node getNode(int index){
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int indexOf(Object o){
        int index=0;
      for(Node x = first; x != null ;  x = x.next){
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
}
