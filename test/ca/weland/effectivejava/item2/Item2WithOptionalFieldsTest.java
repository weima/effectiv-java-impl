package ca.weland.effectivejava.item2;

import ca.weland.effectivejava.item2.Item2WithOptionalFields;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Item2WithOptionalFieldsTest {
  @Test
  public void userBuilderToBuildItem2() {
    final float weight = 125.0f;
    final float height = 175.8f;

    var builder = new Item2WithOptionalFields.Item2Builder("Wei", 18);
    var item2 = builder.setWeight(weight).setHeight(height).build();
    assertEquals(item2.getClass(), Item2WithOptionalFields.class);
    assertEquals(weight, item2.getWeight());
    assertEquals(height, item2.getHeight());
  }
}
