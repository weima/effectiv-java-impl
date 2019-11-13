package ca.weland.effectivejava.item1;

import ca.weland.effectivejava.item1.Item1;
import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Item1Test {

  @Test
  void meaningfulInstance() {
    var jnstance = Item1.meaningfulInstance();
    // if we are here, it's a pass
    assert (true);
  }

  @Test
  void cachedInstance() {
    var instance1 = Item1.cachedInstance();
    var instance2 = Item1.cachedInstance();
    assert (instance1 == instance2);
  }

  @Test
  void differentTypeBasedOnParameterValue() throws ExecutionControl.NotImplementedException {
    var instance1 = Item1.differentTypeBasedOnParameterValue(1);
    var instance2 = Item1.differentTypeBasedOnParameterValue(2);
    var class1 = instance1.getClass();
    var class2 = instance2.getClass();
    assertNotEquals(class1, class2);
  }

  @Test
  void differentTypeBasedOnNonSupportedParameterValue()
      throws ExecutionControl.NotImplementedException {
    assertThrows(
        ExecutionControl.NotImplementedException.class,
        () -> Item1.differentTypeBasedOnParameterValue(3));
  }

  @Test
  void instanceOfInternalClass() {
    var instance = Item1.instanceOfInternalClass();
    var clazz = instance.getClass();
    assertNotEquals(clazz, Item1.class);
  }
}
