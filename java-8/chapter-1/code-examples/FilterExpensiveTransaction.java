import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors.toList;

class FilterExpensiveTransaction {
  
  Map<Currency, List<Transaction>> filterExpensiveTransaction(List<Transaction> transactions) {
    Map<Currency, List<Transaction>> transactionsByCurrencies = new HashMap<>();
    for (Transaction transaction : transactions) {
      if (transaction.getPrice() > 1000) {
        Currency currency = transaction.getCurrency();
        List<Transaction> transactionsForCurrency = transactionsByCurrencies.get(currency);
        if (transactionsForCurrency == null) {
          transactionsForCurrency = new ArrayList<>();
          transactionsByCurrencies.put(currency, transactionsForCurrency);
        }
        transactionsForCurrency.add(transaction);
      }
    }
    return transactionsByCurrencies;
  }

  Map<Currency, List<Transaction>> filterExpensiveTransaction2(List<Transaction> transaction) {
    return Map<Currency, List<Transaction>> transactionsByCurrencies = transactions
      .stream()
      .filter((Transaction t) -> t.getPrice() > 1000)
      .collect(groupingBy(Transaction::getCurrency));
  }
}
