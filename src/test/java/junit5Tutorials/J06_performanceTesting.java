package junit5Tutorials;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import static org.junit.jupiter.api.Assertions.assertTimeout;
class J06_PerformanceTesting {
    @Test
    void performance() {
        //assertTimeout(Duration.ofSeconds(1),()-> IntStream.rangeClosed(0,1000)).forEach(System.out::print);//print süreye dahil değil
        assertTimeout(Duration.ofMillis(10),()-> IntStream.rangeClosed(0,100).sum());//print süreye dahil
        //assertTimeout(Duration.ofSeconds(1),()-> LongStream.rangeClosed(0,10000).forEach(System.out::print));//print süreye dahil
        // assertTimeout(Duration.ofMillis(1),()-> LongStream.rangeClosed(0,10000).forEach(System.out::print));//print süreye dahil
    }
}
