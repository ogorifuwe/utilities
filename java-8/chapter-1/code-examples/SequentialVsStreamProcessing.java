import java.util.stream.Collectors;

class SequentialVsStreamProcessing {

  // sequential processing
  List<Apple> heavyApples = inventory
    .stream()
    .filter((Apple a) -> a.getWeight() > 150)
    .collect(Collectors.toList());

  // parallel processing
  List<Apple> heavyApples2 = inventory
    .parallelStream()
    .filter((Apple a) -> a.getWeight() > 150)
    .collect(Collectors.toList());

}
