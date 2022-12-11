import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;


public class StatsServiceTest {

    @Test
    public void shouldFindSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.salesAmount(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldFindAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.average(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldFindMaximumSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;
        long actual = service.maximumSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldFindMinimumSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.minimumSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldFindMonthsLessThanAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.LessThanAverage(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldFindMonthsAboveThanAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.AboveThanAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

}


