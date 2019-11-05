import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import Apple; // assuming we have a POJO; Apple
class SortApples {

  
  /**
   * Using Java 7 to sort a list of Apple.
   */
  private List<Apple> sortApples(List<Apple> inventory) {
    Collections.sort(inventory, new Comparator<Apple>(){
      public int compare(Apple a1, Apple a2) {
        return a1.getWeight().compareTo(a2.getWeight());
      }
    })

    return inventory;
  }

  /**
   * Uses Java 8 to sort a list of Apple.
   */
  private List<Apple> sortApple2(List<Apple> inventory) {
    return inventory.sort(comparing(Apple::getWeight));
  }
}
