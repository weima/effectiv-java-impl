package ca.weland.effectivejava.item2;

public class Item2ClassHierarchiesSub2 extends Item2ClassHierarchies {

  public static class Builder extends Item2ClassHierarchies.Builder<Builder> {

    public Builder() {
      addMember(Members.TWO).addMember(Members.FOUR);
    }

    @Override
    public Item2ClassHierarchiesSub2 build() {
      return new Item2ClassHierarchiesSub2(this);
    }

    @Override
    protected Builder self() {
      return this;
    }
  }

  private Item2ClassHierarchiesSub2(Builder builder) {
    super(builder);
  }
}
