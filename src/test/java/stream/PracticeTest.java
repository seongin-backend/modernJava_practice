package stream;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PracticeTest {

    Practice practice = new Practice();

    Trader raoul = new Trader("Raoul", "Cambridge");
    Trader mario = new Trader("Mario", "Milan");
    Trader alan = new Trader("Alan", "Cambridge");
    Trader brian = new Trader("Brian", "Cambridge");

    List<Transaction> transactions = Arrays.asList(
        new Transaction(brian, 2011, 300),
        new Transaction(raoul, 2012, 1000),
        new Transaction(raoul, 2011, 400),
        new Transaction(mario, 2012, 710),
        new Transaction(mario, 2012, 700),
        new Transaction(alan, 2012, 950)
    );

    @Test
    public void 테스트1() {
        practice.pratice1(transactions);
    }

    @Test
    public void 테스트2() {
        practice.pratice2(transactions);
    }

    @Test
    public void 테스트3() {
        practice.pratice3(transactions);
    }

    @Test
    public void 테스트4() {
        practice.pratice4(transactions);
    }

    @Test
    public void 테스트5() {
        practice.pratice5(transactions);
    }

    @Test
    public void 테스트6() {
        practice.pratice6(transactions);
    }

    @Test
    public void 테스트7() {
        practice.pratice7(transactions);
    }

    @Test
    public void 테스트8() {
        practice.pratice8(transactions);
    }
}
