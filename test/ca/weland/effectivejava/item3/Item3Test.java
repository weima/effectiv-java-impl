package ca.weland.effectivejava.item3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Item3Test {
  @Test
  public void useGetInstance() {
    var i1 = Item3WithGetInstance.getInstance();
    var i2 = Item3WithGetInstance.getInstance();
    assertEquals(i1, i2);
  }

  @Test
  public void useStaticInit() {
    var i1 = Item3WithStaticInit.Instance;
    var i2 = Item3WithStaticInit.Instance;
    assertEquals(i1, i2);
  }

  @Test
  public void useSingleItemEnum() {
    var i1 = Item3WithSingleItemEnum.INSTANCE;
    var i2 = Item3WithSingleItemEnum.INSTANCE;
    assertEquals(i1, i2);
  }
}
