package stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class PracticeAnswer {
    public static void practice1(List<Transaction> transactions) {
        List<Transaction> result = transactions.stream()
            .filter(transaction -> 2011 == transaction.getYear())
            .sorted(Comparator.comparing(Transaction::getValue))
            .collect(toList());

        System.out.println(result);
    }

    public static void practice2(List<Transaction> transactions) {
        List<String> result = transactions.stream()
            .map(Transaction::getTrader)
            .map(Trader::getCity)
            .distinct().collect(toList());

        System.out.println(result);
    }

    public static void practice3(List<Transaction> transactions) {
        List<Trader> result = transactions.stream()
            .map(Transaction::getTrader)
            .filter(trader -> "Cambridge".equals(trader.getCity()))
            .sorted(Comparator.comparing(Trader::getName))
            .collect(toList());

        System.out.println(result);
    }

    public static void practice4(List<Transaction> transactions) {
        String result = transactions.stream()
            .map(Transaction::getTrader)
            .map(Trader::getName)
            .distinct()
            .sorted()
            .collect(Collectors.joining(","));

        System.out.println(result);
    }

    public static void practice5(List<Transaction> transactions) {
        boolean result = transactions.stream()
            .anyMatch(transaction -> "Milan".equals(transaction.getTrader().getCity()));

        System.out.println(result);
    }

    public static void practice6(List<Transaction> transactions) {
        List<Transaction> result = transactions.stream()
            .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
            .collect(toList());

        System.out.println(result);
    }

    public static void practice7(List<Transaction> transactions) {
        Optional<Transaction> result = transactions.stream()
            .max(Comparator.comparing(Transaction::getValue));

        System.out.println(result.get().getValue());
    }

    public static void practice8(List<Transaction> transactions) {
        Optional<Transaction> result = transactions.stream()
            .min(Comparator.comparing(Transaction::getValue));

        System.out.println(result.get().getValue());
    }
}
