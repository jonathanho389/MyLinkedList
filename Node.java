public class Node{
  private String data;
  private Node next, prev;
  public Node(String value){
    data = value;
  }
  public String getData(){
    return data;
  }

  public String set(String value){
    String temp = data;
    data = value;
    return temp;
  }

  public Node getNext(){
    return next;
  }

  public Node setNext(Node value){
    Node temp = next;
    next = value;
    return temp;
  }

  public Node getPrev(){
    return prev;
  }

  public Node setPrev(Node value){
    Node temp = prev;
    prev = value;
    return temp;
  }
}
