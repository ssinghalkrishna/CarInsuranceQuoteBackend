package code;

public class QuickQuoteCalculations {
    public double vehicleTypeFactor(String vehicleType) {
        double vehicleTypeFactor;

        switch (vehicleType) {
            case "Cabriolet":
                vehicleTypeFactor = 1.3;
                break;
            case "Coupe":
                vehicleTypeFactor = 1.4;
                break;
            case "Estate":
                vehicleTypeFactor = 1.5;
                break;
            case "Hatchback":
                vehicleTypeFactor = 1.6;
                break;
            default:
                vehicleTypeFactor = 1.7;
                break;
        }
        return vehicleTypeFactor;
    } // End of vehicleTypeFactor() method


    public double engineCCFactor(int engineCC) {
        double engineCCFactor;

        switch (engineCC) {
            case 1000:
                engineCCFactor = 1.0;
                break;
            case 1600:
                engineCCFactor = 1.6;
                break;
            case 2000:
                engineCCFactor = 2.0;
                break;
            case 2500:
                engineCCFactor = 2.5;
                break;
            case 3000:
                engineCCFactor = 3.0;
                break;
            default:
                engineCCFactor = 3.5;
                break;
        }
        return engineCCFactor;
    } // End of engineCCFactor() method


    public double additionalDriversFactor(int numberOfAdditionalDrivers) {
        double additionalDriversFactor = 0;

        try {
            if (numberOfAdditionalDrivers < 2) {
                additionalDriversFactor = 1.1;
            } else {
                additionalDriversFactor = 1.2;
            }
        } catch (Exception e) {
            System.out.println("Exception Invalid Number of Additional Drivers");
        }
        return additionalDriversFactor;
    } // End of additionalDriversFactor() method


    public double commercialUseFactor(boolean commercialUse) {
        double commercialUseFactor = 0;
        try {
            if (commercialUse) {
                commercialUseFactor = 1.1;
            } else {
                commercialUseFactor = 1.0;
            }
        } catch (Exception e) {
            System.out.println("Exception Invalid Commercial Use");
        }
        return commercialUseFactor;
    } // End of commercialUseFactor() method

    public double outsideStateUseFactor(boolean outsideStateUse) {
        double outsideStateUseFactor = 0;
        try {
            if (outsideStateUse) {
                outsideStateUseFactor = 1.1;
            } else {
                outsideStateUseFactor = 1.0;
            }
        } catch (Exception e) {
            System.out.println("Exception Invalid Outside State Use");
        }
        return outsideStateUseFactor;
    } // End of outsideStateUseFactor() method

    public double vehicleValueFactor(double vehicleValue) {
        double vehicleValueFactor = 0;
        try {
            vehicleValueFactor = vehicleValue <= 5000 ? 1.0 : 1.2;

        } catch (Exception e) {
            System.out.println("Exception Invalid Vehicle Value");
        }
        return vehicleValueFactor;
    } // End of vehicleValueFactor() method


    public double calculateQuote(String vehicleType, int engineCC,
                                 int numberOfAdditionalDrivers,
                                 boolean commercialUse,
                                 boolean outsideStateUse,
                                 int vehicleValue) {
        return Math.round(100 * vehicleTypeFactor(vehicleType) * engineCCFactor(engineCC)
                * additionalDriversFactor(numberOfAdditionalDrivers)
                * commercialUseFactor(commercialUse)
                * outsideStateUseFactor(outsideStateUse)
                * vehicleValueFactor(vehicleValue)
        );
    } // End of calculateQuote() method

}
