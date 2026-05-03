public class BackToSender {

    public static int calculateWage(int successfulDeliveries) {
        int percentage = successfulDeliveries; // out of 100 packages

        int amountPerParcel;

        if (percentage < 50) {
            amountPerParcel = 160;
        } else if (percentage <= 59) {
            amountPerParcel = 200;
        } else if (percentage <= 69) {
            amountPerParcel = 250;
        } else {
            amountPerParcel = 500;
        }

        return (successfulDeliveries * amountPerParcel) + 5000;
    }
}

