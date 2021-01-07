public class LinkedTester{
  public static void main(String[] args) {
    MyLinkedList bruh = new MyLinkedList();
    bruh.add("pain");
    bruh.add("rocket");
    bruh.add("neon");
    bruh.add("place");
    bruh.add("bang");
    bruh.add("git");
    bruh.add(0, "ricks");
    bruh.add(3, "go");
    bruh.add(8, "clink");
    System.out.println(bruh.toString());
    bruh.set(3, "pochinko");
    System.out.println(bruh.get(3));
    System.out.println(bruh.toString());
  }

}
