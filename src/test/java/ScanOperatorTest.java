import org.junit.Assert;
import org.junit.Test;
import rx.Observable;

public class ScanOperatorTest {

    @Test
    public void runScan() {
        String[] letters = {"a", "b", "c"};
        StringBuilder result = new StringBuilder()   ;
        Observable.from(letters)
                .scan(new StringBuilder(), StringBuilder::append)
                .subscribe(total -> result.append(total.toString()));

        Assert.assertTrue(result.toString().equals("aababc"));
    }
}
