import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.StatsService;

public class StatsServiceTest {

            @Test
    void shouldShowTheSumOfAllSales() {
        StatsService service = new StatsService();

        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.sum(allSales);
        int exected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(exected, actual);
    }

    @Test
    void shouldAverageSalesPerMonth() {
        StatsService service = new StatsService();

        int[] averSum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.sum(averSum)/12;
        int exected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(exected, actual);
    }
    @Test
    void shouldMinM() {
        StatsService service = new StatsService();

        long[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSales(minMonth);
        long exected = 9;

        Assertions.assertEquals(exected, actual);

    }
    @Test
    void shouldMaxM() {
        StatsService service = new StatsService();

        int[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSales(maxMonth);
        int exected = 8;

        Assertions.assertEquals(exected, actual);

    }
    @Test
    void shoudAboveAverS() {
        StatsService service = new StatsService();

        int[] aboveAverS = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.aboveAverS(aboveAverS);
        int exected = 5;

        Assertions.assertEquals(exected, actual);

    }

    @Test
    void shoudSmallerAverS() {
        StatsService service = new StatsService();

        int[] smallerAverS = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.smallerAverS(smallerAverS);
        int exected = 5;

        Assertions.assertEquals(exected,actual);

    }
}
