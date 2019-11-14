package ca.weland.effectivejava.item2;

public class Item2ClassHierarchiesSub1 extends Item2ClassHierarchies {

  public static class Builder extends Item2ClassHierarchies.Builder<Builder> {

    public Builder() {
      addMember(Members.ONE).addMember(Members.FIVE).addMember(Members.THREE);
    }

    @Override
    public Item2ClassHierarchiesSub1 build() {
      return new Item2ClassHierarchiesSub1(this);
    }

    @Override
    protected Builder self() {
      return this;
    }
  }

  private Item2ClassHierarchiesSub1(Builder builder) {
    super(builder);
  }
}
