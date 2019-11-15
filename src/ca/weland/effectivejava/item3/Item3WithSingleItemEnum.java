package ca.weland.effectivejava.item3;

/**
 * Using Single Item Enum  is the preferred way to create
 * Singleton. It gets serialization for free.
 * */
public enum Item3WithSingleItemEnum {
  INSTANCE;
  public void doSomething(){
    System.out.println("Do something");
  }
}
