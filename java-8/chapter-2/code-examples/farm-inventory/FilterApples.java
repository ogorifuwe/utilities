import java.util.List;
import java.util.ArrayList;

public class FilterApples {

  /**
   * naive solution.
   * Requires code duplication to meet changing requirements.
   * E.g if we wanted to filter Red Apples and then filter Dark Red Apples etc
   */
  public static List<Apple> filterGreenApples(List<Apple> inventory) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      if ("green".equals(apple.getColor())) {
        result.add(apple);
      }
    }
    return result;
  }

  /**
   * better solution.
   * A better solution is parameterizing the color.
   * That way we can filter for a specific color using the same method,
   * by just passing in the color as a param.
   */
  public static List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
    List<Apple> result = new ArrayList<>();
    for (Apple apple : inventory) {
      if (apple.getColor().equals(color)) {
        result.add(apple);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    List<Apple> greenApples = filterGreenApples(inventory);
    List<Apple> greenApples2 = filterApples(inventory, "green");
    List<Apple> redApples = filterApples(inventory, "red");
  }
}
