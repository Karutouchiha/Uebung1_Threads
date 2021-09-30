/**********************
 * date: 30.09.2021   *
 * name: Haböck Sarah *
 **********************/
public class CountPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            System.out.println(i+1+": ");
        }
    }
}
