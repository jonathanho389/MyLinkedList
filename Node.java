public class Node{
  private String data;
  private Node next, prev;
  public Node(String value){
    data = value;
  }
  public String get(){
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
}
