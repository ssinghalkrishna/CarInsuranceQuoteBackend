package tdd;

import code.QuickQuoteCalculations;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFactors {

    private QuickQuoteCalculations quickQuoteCalculations;

    @Before
    public void setUp() {
        quickQuoteCalculations = new QuickQuoteCalculations();
    }

    @Test
    public void vehicleTypeFactorCabriolet() {
//        QuickQuoteCalculations quickQuoteCalculations = new QuickQuoteCalculations();
        Assert.assertEquals(1.3, quickQuoteCalculations.vehicleTypeFactor("Cabriolet"), 0.00);
    }

    @Test
    public void vehicleTypeFactorCoupe() {
        //      QuickQuoteCalculations quickQuoteCalculations = new QuickQuoteCalculations();
        Assert.assertEquals(1.4, quickQuoteCalculations.vehicleTypeFactor("Coupe"), 0.00);
    } // End of vehicleTypeFactorCoupe() test method

    @Test
    public void vehicleTypeFactorEstate() {
        //       QuickQuoteCalculations quickQuoteCalculations = new QuickQuoteCalculations();
        Assert.assertEquals(1.5, quickQuoteCalculations.vehicleTypeFactor("Estate"), 0.00);
    } // End of vehicleTypeFactorEstate() test method

    @Test
    public void vehicleTypeFactorHatchback() {
//        QuickQuoteCalculations quickQuoteCalculations = new QuickQuoteCalculations();
        Assert.assertEquals(1.6, quickQuoteCalculations.vehicleTypeFactor("Hatchback"), 0.00);
    } // End of vehicleTypeFactorHatchback() test method

    @Test
    public void vehicleTypeFactorSUV() {
        //       QuickQuoteCalculations quickQuoteCalculations = new QuickQuoteCalculations();
        Assert.assertEquals(1.7, quickQuoteCalculations.vehicleTypeFactor("SUV"), 0.00);
    } // End of vehicleTypeFactorSUV() test method

    @Test
    public void engineCCFactor1000() {
        //       QuickQuoteCalculations quickQuoteCalculations = new QuickQuoteCalculations();
        Assert.assertEquals(1.0, quickQuoteCalculations.engineCCFactor(1000), 0.00);
    } // End of engineCCFactor1000() test method

    @Test
    public void engineCCFactor1600() {
        //       QuickQuoteCalculations quickQuoteCalculations = new QuickQuoteCalculations();
        Assert.assertEquals(1.6, quickQuoteCalculations.engineCCFactor(1600), 0.00);
    } // End of engineCCFactor1600() test method

    @Test
    public void additionalDrivers1() {
        //       QuickQuoteCalculations quickQuoteCalculations = new QuickQuoteCalculations();
        Assert.assertEquals(1.1, quickQuoteCalculations.additionalDriversFactor(1), 0.00);
    } // End of additionalDrivers1() test method

    @Test
    public void additionalDrivers2() {
        //       QuickQuoteCalculations quickQuoteCalculations = new QuickQuoteCalculations();
        Assert.assertEquals(1.2, quickQuoteCalculations.additionalDriversFactor(2), 0.00);
    } // End of additionalDrivers2() test method


    @Test
    public void commercialUseYes() {
        //       QuickQuoteCalculations quickQuoteCalculations = new QuickQuoteCalculations();
        Assert.assertEquals(1.1, quickQuoteCalculations.commercialUseFactor(true), 0.0);
    } // // End of commercialUseYes() test method

    @Test
    public void commercialUseNo() {
//        QuickQuoteCalculations quickQuoteCalculations = new QuickQuoteCalculations();
        Assert.assertEquals(1.0, quickQuoteCalculations.commercialUseFactor(false), 0.0);
    } // End of commercialUseNo() test method

    @Test
    public void outsideStateUseYes() {
        //       QuickQuoteCalculations quickQuoteCalculations = new QuickQuoteCalculations();
        Assert.assertEquals(1.1, quickQuoteCalculations.outsideStateUseFactor(true), 0.0);
    } // End of outsideStateUseYes() test method

    @Test
    public void outsideStateUseNo() {
        //       QuickQuoteCalculations quickQuoteCalculations = new QuickQuoteCalculations();
        Assert.assertEquals(1.0, quickQuoteCalculations.outsideStateUseFactor(false), 0.0);
    } // End of outsideStateUseNo() test method

    @Test
    public void vehicleValueLessThan5000() {
        //       QuickQuoteCalculations quickQuoteCalculations = new QuickQuoteCalculations();
        Assert.assertEquals(1.0, quickQuoteCalculations.vehicleValueFactor(4000), 0.0);
    }

    @Test
    public void vehicleValueGreaterThan5000() {
//        QuickQuoteCalculations quickQuoteCalculations = new QuickQuoteCalculations();
        Assert.assertEquals(1.2, quickQuoteCalculations.vehicleValueFactor(6000), 0.0);
    }

    @Test
    public void calculateQuote1() {
        //       QuickQuoteCalculations quickQuoteCalculations = new QuickQuoteCalculations();
        Assert.assertEquals(372.0, quickQuoteCalculations.calculateQuote("Hatchback", 1600, 3, true, true, 5000), 0.2);
    }

    @Test
    public void calculateQuote2() {
        //       QuickQuoteCalculations quickQuoteCalculations = new QuickQuoteCalculations();
        Assert.assertEquals(594.00, quickQuoteCalculations.calculateQuote("Estate", 3000, 1, false, false, 10000), 0.2);
    }

    // Testing Boolean - check if the commercialUseFactor method returns 1.1 when provided with true.
    @Test
    public void testCommercialUseFactorTrue() {
//        QuickQuoteCalculations quickQuoteCalculations = new QuickQuoteCalculations();
        Assert.assertTrue(quickQuoteCalculations.commercialUseFactor(true) == 1.1);
    }

    // Testing Boolean - check if the commercialUseFactor method returns 1.0 when provided with true.
    @Test
    public void testCommercialUseFactorFalse() {
        //      QuickQuoteCalculations quickQuoteCalculations = new QuickQuoteCalculations();
        Assert.assertTrue(quickQuoteCalculations.commercialUseFactor(false) == 1.0);
    }

}
