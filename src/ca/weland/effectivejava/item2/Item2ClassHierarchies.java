package ca.weland.effectivejava.item2;

import java.util.EnumSet;
import java.util.Objects;

public abstract class Item2ClassHierarchies {
  public static enum Members {
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE
  }
  final EnumSet<Members> members;

  public abstract static class Builder<T extends Builder<T>> {
    EnumSet<Members> members = EnumSet.noneOf(Members.class);

    public T addMember(Members member) {
      members.add(Objects.requireNonNull(member));
      return self();
    }

    public abstract Item2ClassHierarchies build();

    protected abstract T self();
  }

  protected Item2ClassHierarchies(Builder<?> builder){
    this.members = builder.members.clone();
  }
}
