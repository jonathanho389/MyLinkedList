public class MyLinkedList{
  private int size;
  private Node start, end;
  public MyLinkedList(){
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String value){
    Node next = new Node(value);
    if(size == 0){
      start = next;
      end = next;
      size++;
    }
    else{
      start.setNext(next);
    }
    return true;
  }

  
}
