package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Practice {

    /*2011년에 일어난 모든 트랜잭션을 찾아 오름차순으로 정렬하시오.*/
    public void pratice1(List<Transaction> transactions) {
        List<Transaction> collect = transactions.stream()
            .filter(transaction -> 2011 == transaction.getYear())
            .sorted(Comparator.comparing(Transaction::getValue))
            .collect(Collectors.toList());

        System.out.println(collect);
    }

    /*거래자가 근무하는 모든 도시를 중복 없이 나열하시오.*/
    public void pratice2(List<Transaction> transactions) {
        List<String> collect = transactions.stream()
            .map(Transaction::getTrader)
            .map(Trader::getCity)
            .distinct()
            .collect(Collectors.toList());

        System.out.println(collect);
    }

    /*케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오.*/
    public void pratice3(List<Transaction> transactions) {
        List<Trader> collect = transactions.stream()
            .map(Transaction::getTrader)
            .filter(trader -> "Cambridge".equals(trader.getCity()))
            .sorted(Comparator.comparing(Trader::getName))
            .collect(Collectors.toList());

        System.out.println(collect);
    }

    /*모든 거래자의 이름을 알파벳 순으로 정렬해서 반환하시오.*/
    public void pratice4(List<Transaction> transactions) {
        List<String> collect = transactions.stream()
            .map(Transaction::getTrader)
            .map(Trader::getName)
            .sorted()
            .distinct()
            .collect(Collectors.toList());

        System.out.println(collect);
    }

    /*밀라노에 거래자가 있는가?*/
    public void pratice5(List<Transaction> transactions) {
        boolean b = transactions.stream()
            .anyMatch(transaction -> "Milan".equals(transaction.getTrader().getCity()));

        System.out.println(b);
    }

    /*케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오.*/
    public void pratice6(List<Transaction> transactions) {
        List<Transaction> collect = transactions.stream()
            .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
            .collect(Collectors.toList());

        System.out.println(collect);
    }

    /*전체 트랜잭션 중 최댓값은 얼마인가?*/
    public void pratice7(List<Transaction> transactions) {
        Optional<Transaction> max = transactions.stream()
            .max(Comparator.comparing(Transaction::getValue));

        System.out.println(max.get().getValue());
    }

    /*전체 트랜잭션 중 최솟값은 얼마인가? */
    public void pratice8(List<Transaction> transactions) {
        Optional<Transaction> min = transactions.stream().min(Comparator.comparing(Transaction::getValue));

        System.out.println(min.get().getValue());
    }
}