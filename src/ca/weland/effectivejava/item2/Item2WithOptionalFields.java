package ca.weland.effectivejava.item2;

/**
 * Item2: Use builder to force initializing required fields and allow
 * setting optional fields
 * */
public class Item2WithOptionalFields {

  private final String name;
  private final int age;
  private final float weight;
  private final float height;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public float getWeight() {
    return weight;
  }

  public float getHeight() {
    return height;
  }

  public static class Item2Builder {
    // Required fields
    private final String name;
    private final int age;

    // Optional fields
    private float weight = 0;
    private float height = 0;

    public Item2Builder setWeight(float weight) {
      this.weight = weight;
      return this;
    }

    public Item2Builder setHeight(float height) {
      this.height = height;
      return this;
    }

    public Item2Builder(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public Item2WithOptionalFields build() {
      return new Item2WithOptionalFields(this);
    }
  }

  private Item2WithOptionalFields(Item2Builder builder) {
    this.age = builder.age;
    this.name = builder.name;
    this.height = builder.height;
    this.weight = builder.weight;
  }
}
