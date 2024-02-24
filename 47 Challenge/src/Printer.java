public class Printer {

    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private int paperUsed = 0;
    private final boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel <= 100 & tonerLevel >= 0) {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }

    public void fillToner() {
        this.tonerLevel = 100;
        System.out.println("Toner filled.");
    }

    public void printPage(int numberOfPages) {
        if (duplex){
            System.out.println("Printing in duplex mode.");
        }
        for (int printed = 0; printed < numberOfPages; printed++) {
            if (duplex & numberOfPages - printed > 1) {
                if (tonerLevel - 20 < 0) {
                    System.out.println("Please refill toner.");
                    break;
                }
                this.tonerLevel -= 20;
                this.pagesPrinted += 2;
                printed++;
            } else {
                if (tonerLevel - 10 < 0) {
                    System.out.println("Please refill toner.");
                    break;
                }
                this.tonerLevel -= 10;
                this.pagesPrinted++;
            }
            this.paperUsed++;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getPaperUsed() {
        return paperUsed;
    }

    public boolean isDuplex() {
        return duplex;
    }

//    public static void main(String[] args) {
//
//        Printer printer = new Printer(120,true);
//
//        System.out.println("Total pages printed = " + printer.getPagesPrinted());
//        System.out.println("Total papers used = " + printer.getPaperUsed());
//        System.out.println("Toner level = " + printer.getTonerLevel());
//        printer.printPage(4);
//        System.out.println("Total pages printed = " + printer.getPagesPrinted());
//        System.out.println("Total papers used = " + printer.getPaperUsed());
//        System.out.println("Toner level = " + printer.getTonerLevel() + "%");
//
//    }

}
