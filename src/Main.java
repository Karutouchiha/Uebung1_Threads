/**********************
 * date: 30.09.2021   *
 * name: Haböck Sarah *
 **********************/
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
/**************************************************************************************************************
 * - Was fällt auf?                                                                                           *
 * Die Programmen werden Trotzdem scheibar nacheinander ausgeführt.                                           *
 * - Versuche das Phänomen zu erklären!                                                                       *
 * Die Aufgaben in den Threads sind zu kurz. Der Thread wird beendet befor der nächste Thread zum Zug kommt.  *
 * - Ändere nun dein Programm, sodass jeweils mehr Ausgaben je Thread erfolgen (200, 2000, 20000, ...)        *
 * - was beobachtest du dabei?                                                                                *
 * Beide Threads kommen zum Zug.
 **************************************************************************************************************/
