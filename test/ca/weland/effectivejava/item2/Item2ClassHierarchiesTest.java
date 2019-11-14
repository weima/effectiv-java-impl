package ca.weland.effectivejava.item2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Item2ClassHierarchiesTest {

  @Test
  public void sub1Has135() {
    var sub1 = new Item2ClassHierarchiesSub1.Builder().build();
    var has135 =
        sub1.members.containsAll(
            Arrays.asList(
                Item2ClassHierarchies.Members.ONE,
                Item2ClassHierarchies.Members.THREE,
                Item2ClassHierarchies.Members.FIVE));
    assert (has135);
  }

  @Test
  public void sub2Has24() {
    var sub2 = new Item2ClassHierarchiesSub2.Builder().build();
    var has24 =
        sub2.members.containsAll(
            Arrays.asList(Item2ClassHierarchies.Members.TWO, Item2ClassHierarchies.Members.FOUR));
    assert (has24);
  }
}
