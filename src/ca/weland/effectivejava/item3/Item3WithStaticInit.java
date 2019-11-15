package ca.weland.effectivejava.item3;

public class Item3WithStaticInit {
  public static final Item3WithStaticInit Instance = new Item3WithStaticInit();

  private Item3WithStaticInit() {}
}
