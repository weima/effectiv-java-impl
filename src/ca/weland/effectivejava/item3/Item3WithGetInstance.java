package ca.weland.effectivejava.item3;

public class Item3WithGetInstance {
  private static final Item3WithGetInstance instance = new Item3WithGetInstance();
  private Item3WithGetInstance() {}
  public static Item3WithGetInstance getInstance(){
    return instance;
  }
}
