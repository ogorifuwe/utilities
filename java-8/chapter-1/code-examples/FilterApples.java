class FilterApples {
  
  public static List<Apple> filterGreenApples(List<Apple> inventory) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      if ("green".equals(apple.getColor())) {
        result.add(apple);
      }
    }
    return result;
  }

  public static List<Apple> filterHeavyApples(List<Apple> inventory) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      if (apple.getWeight() > 150) {
        result.add(apple);
      }
    }
    return result;
  }

  public static boolean isGreenApple(Apple apple) {
    return "green".equals(apple.getColor());
  }

  public static boolean isHeavyApple(Apple apple) {
    return apple.getWeight() > 150;
  }

  public interface Predicate<T> {
    boolean test(T t);
  }

  static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      if (p.test(apple)) {
        result.add(apple);
      }
    }
    return result;
  }

  public static List<Apple> filterGreenApples(List<Apple> inventory) {
    return filterApples(inventory, Apple::isGreenApple);
  }

  public static List<Apple> filterGreenApples2(List<Apple> inventory) {
    return filterApples(inventory, (Apple a) -> "green".equals(a.getColor()));
  }

  public static List<Apple> filterHeavyApple(List<Apple> inventory) {
    return filterApples(inventory, Apple::isHeavyApple);
  }

  public static List<Apple> filterHeavyApple2(List<Apple> inventory) {
    return filterApples(inventory, (Apple a) -> a.getWeight() > 150);
  }

  public static List<Apple> filterGreenORLightApples(List<Apple> inventory) {
    return filterApples(inventory, (Apple a) -> "green".equals(a.getColor()) ||
                                                a.getWeight() < 80); 
  }

  public static List<Apple> filterHeavyApples2(List<Apple> inventory) {
    return filter(inventory, (Apple a) -> a.getWeight() > 150);
  }
}
