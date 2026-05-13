public class OshoFreePromoEngine{
    public static double applyPromo(double cartTotal, String promoCode){
        switch (promoCode){
            case "STARTER10":
                if (cartTotal >= 5_000 && cartTotal <= 14_999){
                    return cartTotal * 0.9;
                }
                return cartTotal;

            case "BIGBOY20":
                if (cartTotal >= 15_000 && cartTotal <= 29_999){
                    return cartTotal * 0.8;
                }
                return cartTotal;

            case "OSHOFREE35":
                if (cartTotal >= 30_000){
                    return cartTotal * 0.65;
                }
                return cartTotal;

            default:
                return cartTotal;
            }
    }
}
