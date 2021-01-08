public class LinkedTester{
  public static void main(String[] args) {
    MyLinkedList bruh = new MyLinkedList();
    bruh.add("pain");
    bruh.add("rocket");
    bruh.add("neon");
    bruh.add("place");
    bruh.add(0, "ricks");
    bruh.add(3, "go");
    System.out.println(bruh.toString());
    bruh.set(3, "pochinko");
    System.out.println(bruh.get(3));
    System.out.println(bruh.toString());
    System.out.println(bruh.toStringReversed());
    bruh.remove(3);
    System.out.println(bruh.toString());
  }

}
