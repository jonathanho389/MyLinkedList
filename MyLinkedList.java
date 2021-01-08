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
    if(index < 0 || index > size){
      throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
    }
    Node next = start;
    if(index == size - 1){
      return end.getData();
    }
    for(int i = 0;i < index;i++){
      next = next.getNext();
    }
    return next.getData();
  }

  private Node getNode(int index){
    if(index < 0 || index > size){
      throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
    }
    Node next = start;
    if(index == size - 1){
      return end;
    }
    for(int i = 0;i < index;i++){
      next = next.getNext();
    }
    return next;
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
    if(index < 0 || index > size){
      throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
    }
    Node next = new Node(value);
    if(size == 0){
      start = next;
      end = next;
    }
    else if(index == 0){
      start.setPrev(next);
      next.setNext(start);
      start = next;
    }
    else if(index == size){
      next.setPrev(end);
      end.setNext(next);
      end = next;
    }
    else{
      Node ahead = getNode(index);
      Node behind = ahead.getPrev();
      next.setPrev(behind);
      next.setNext(ahead);
      behind.setNext(next);
      ahead.setPrev(next);
    }
    size++;
  }

  public String set(int index, String value){
    if(index < 0 || index > size){
      throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
    }
    Node current = getNode(index);
    Node temp = current;
    Node news = new Node(value);
    current.set(value);
    return temp.getData();
  }

  public String toString(){
    String finale = "";
    Node next = start;
    if(size == 0){
      return "[]";
    }
    else{
      for(int i = 0;i < size - 1;i++){
      finale += next.getData() + ", ";
      next = next.getNext();
    }
  }
    return "[" + finale + get(size - 1) + "]";
  }

  public String toStringReversed(){
    String finale = "";
    Node next = end;
    if(size == 0){
      return "[]";
    }
    else{
      for(int i = size;i > 1;i--){
        finale += next.getData() + ", ";
        next = next.getPrev();
      }
    }
    return "[" + finale + get(0) + "]";
  }

  public String remove(int index){
    if(index < 0 || index > size){
      throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
    }
    Node ahead = new Node("temp");
    Node behind = new Node("temp");
    Node middle = new Node("temp");
    if(size == 1){
      start = null;
      end = null;
    }
    else if(index == 0){
      start = start.getNext();
      start.setPrev(null);
    }
    else if(index == size - 1){
      end = end.getPrev();
      end.setNext(null);
    }
    else{
      ahead = getNode(index + 1);
      behind = getNode(index - 1);
      middle = getNode(index);
      ahead.setPrev(behind);
      behind.setNext(ahead);
    }
    size--;
    return middle.getData();
  }

  public void extend(MyLinkedList other){
    if(other.size() == 0){

    }
    else{
      end.setNext(other.getNode(0));
      size += other.size();
      end = other.getNode(other.size - 1);
    }
    other.size = 0;
  }

}
