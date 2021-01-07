public class MyLinkedList{
  private int size;
  private Node start, end;
  public MyLinkedList(){
    size = 0;
  }

  public int size(){
    return size;
  }


  public String get(int index){
    Node next = start;
    if(index == size - 1){
      return end.get();
    }
    for(int i = 0;i < index - 1;i++){
      next = next.getNext();
    }
    return next.get();
  }


  public boolean add(String value){
    Node next = new Node(value);
    if(size == 0){
      start = next;
      end = next;
    }
    else{
      next.setPrev(end);
      end.setNext(next);
      end = next;
    }
    size++;
    return true;
  }

  public void add(int index, String value){
    Node next = new Node(value);

  }
}
