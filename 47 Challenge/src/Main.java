import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(100,true);

        Scanner myPages = new Scanner(System.in);
        int toPrint = -1;


        System.out.println("Input number of pages to print");

        if (myPages.hasNextInt()) {
            toPrint = myPages.nextInt();
        }else {
            System.out.println("Invalid Input.");
        }

        System.out.println("Total pages printed = " + printer.getPagesPrinted());
        System.out.println("Total papers used = " + printer.getPaperUsed());
        System.out.println("Toner level = " + printer.getTonerLevel());
        printer.printPage(toPrint);
        System.out.println("Total pages printed = " + printer.getPagesPrinted());
        System.out.println("Total papers used = " + printer.getPaperUsed());
        System.out.println("Toner level = " + printer.getTonerLevel() + "%");

    }

}
