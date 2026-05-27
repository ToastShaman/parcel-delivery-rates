public class DeliveryCalculator {

    public double calculate(String deliveryType, String parcelType) {
        if (deliveryType == "same day") {
            if (parcelType == "document") {
                return 4.00;
            } else if (parcelType == "small") {
                return 7;
            } else if (parcelType == "large") {
                return 9;
            }
        }
        if (deliveryType == "two day") {
            if (parcelType == "document") {
                return 1;
            } else if (parcelType == "small") {
                return 2.5;
            } else if (parcelType == "large") {
                return 3;
            }
        }
        return 0;
    }
}
