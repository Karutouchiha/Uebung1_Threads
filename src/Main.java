public class Main {
    public static void main(String[] args) {
        DatePrinter dateprin = new DatePrinter();
        CountPrinter countprin = new CountPrinter();

        Thread threaddate = new Thread(dateprin);
        Thread threadcount = new Thread(countprin);

        threadcount.start();
        threaddate.start();

    }
}
