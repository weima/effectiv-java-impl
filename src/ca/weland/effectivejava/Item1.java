package ca.weland.effectivejava;

import jdk.jshell.spi.ExecutionControl;

/**
 * Item1, prefer Static Methods over constructors because 1) They have names, so that the caller
 * has clear understanding of the instances that being returned; 2) They can return pre-built
 * instances instead of creating a new instance every time; 3) They can return instances of
 * sub-class instead of the exact type, simplifying API
 */
public class Item1 {

  private static Item1 cached = new Item1();

  /** @return With a meaningful name */
  public static Item1 meaningfulInstance() {
    return new Item1();
  }

  /** @return cached instance */
  public static Item1 cachedInstance() {
    return cached;
  }

  /** @return instance of internal class */
  public static Item1 instanceOfInternalClass() {
    return new SubItem1();
  }

  /** @return instance of different typ based on input parameter */
  public static Item1 differentTypeBasedOnParameterValue(int subTypes)
      throws ExecutionControl.NotImplementedException {
    if (subTypes == 1) {
      return new SubItem1();
    } else if (subTypes == 2) {
      return new SubItem2();
    } else {
      throw new ExecutionControl.NotImplementedException(
          "Sub type " + subTypes + " is not supported");
    }
  }

  private static class SubItem1 extends Item1 {}

  private static class SubItem2 extends Item1 {}
}
