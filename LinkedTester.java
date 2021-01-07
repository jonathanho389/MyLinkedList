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
    bruh.add(9, "clink");
    System.out.println(bruh.get(0));
    System.out.println(bruh.get(1));
    System.out.println(bruh.get(2));
    System.out.println(bruh.get(3));
    System.out.println(bruh.get(4));
    System.out.println(bruh.get(5));
    System.out.println(bruh.get(6));
  }

}
