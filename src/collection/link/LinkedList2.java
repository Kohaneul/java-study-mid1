package collection.link;
public class LinkedList2<E> {
    private MyNode<E> first;
    private int size;

    public void add(E e){
        MyNode<E> newNode = new MyNode<>(e);
        if(size==0){
            first = newNode;
        }
        else{
            MyNode<E> lastNode = findLastNode();
            lastNode.next = newNode;
        }
        size++;
    }


    private MyNode<E> findLastNode() {
        MyNode<E> x = first;
       while(x.next!=null){
           x = x.next;
       }
       return x;
    }

    public void add(int index, E e){
        MyNode<E> newNode = new MyNode<>(e);
        if(index == 0){
            first = newNode;
        }
        else{
            MyNode<E> prevNode = findByNode(index - 1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
        }

    }

    public void removeNode(int index){
        MyNode<E> myNode = findByNode(index);
        if(index ==0){
            first = findByNode(index+1);
        }
        else{
            MyNode<E> beforeNode = findByNode(index - 1);
            beforeNode.next = myNode.next;
        }
        myNode.item= null;
        myNode.next = null;
        size--;
    }

    public MyNode<E> findByNode(int index){
        MyNode<E> node = first;
        for(int i = 0; i<index;i++) {
            node = first.next;
        }
        return node;
    }


    @Override
    public String toString() {
        return first.toString() + "size : "+size;
    }

    private class MyNode<E>{
    E item;
    MyNode<E> next;


        public MyNode(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            MyNode<E> x = this;
            sb.append("[");
            while(true){
                sb.append(x.item);
                x = x.next;
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
