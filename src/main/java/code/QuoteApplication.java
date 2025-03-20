package code;

public class QuoteApplication {
    public static void main(String[] args) {
        QuickQuoteCalculations myQuickQuoteCalculations = new QuickQuoteCalculations();
        System.out.println(myQuickQuoteCalculations.calculateQuote("Hatchback", 1600, 3, true, true, 5000));
        System.out.println(myQuickQuoteCalculations.calculateQuote("Estate", 3000, 1, false, false, 10000));
    }
}
