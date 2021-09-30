/**********************
 * date: 30.09.2021   *
 * name: Haböck Sarah *
 **********************/
import java.util.Date;

public class DatePrinter implements Runnable {
    @Override
    public void run() {
        Date date = new Date();
        for (int i = 0; i < 20000; i++) {
            System.out.println(date);
        }
    }
}
