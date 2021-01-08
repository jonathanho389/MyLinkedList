public class LinkedTester{
  public static void main(String[] args) {
    MyLinkedList bruh = new MyLinkedList();
    MyLinkedList one = new MyLinkedList();
    bruh.add("pain");
    bruh.add("rocket");
    bruh.add("neon");
    bruh.add("place");
    bruh.add("torch");
    bruh.add("room");
    bruh.add(0, "ricks");
    bruh.add(3, "go");
    System.out.println(bruh.toString());
    bruh.set(3, "pochinko");
    System.out.println(bruh.get(3));
    System.out.println(bruh.toString());
    System.out.println(bruh.toStringReversed());
    bruh.remove(3);
    System.out.println(bruh.toString());
    one.add("punch");
    one.remove(0);
    System.out.println(one.toString());
    bruh.remove(0);
    System.out.println(bruh.toString());
    bruh.remove(5);
    System.out.println(bruh.toString());
  }

}
