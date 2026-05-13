import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OshoFreePromoEngineTest{

    @Test    
    public void testCartBelow5000ReturnsOriginalPriceEvenWithValidCode(){
        double cartTotal = 3_000.00;
        String promoCode = "STARTER10";
        double expected = cartTotal;
        double result = OshoFreePromoEngine.applyPromo(cartTotal, promoCode);
        assertEquals(expected, result, 0.001);
    }


    @Test    
    public void testCartBetween5000And14999Returns10PercentDiscountedPriceWithValidCode(){
        double cartTotal = 5_000.00;
        String promoCode = "STARTER10";
        double expected = cartTotal * 0.9;
        double result = OshoFreePromoEngine.applyPromo(cartTotal, promoCode);
        assertEquals(expected, result, 0.001);
    }


    @Test
    public void testCartBetween5000And14999WithWrongCodeReturnsOriginalPrice(){
        double cartTotal = 5_000.00;        
        String promoCode = "BIGBOY20";
        double expected = cartTotal;
        double result = OshoFreePromoEngine.applyPromo(cartTotal, promoCode);
        assertEquals(expected, result, 0.001);
    }


    @Test    
    public void testCartBetween15000And29999Returns20PercentDiscountedPriceWithValidCode(){
        double cartTotal = 15_000.00;
        String promoCode = "BIGBOY20";
        double expected = cartTotal * 0.8;
        double result = OshoFreePromoEngine.applyPromo(cartTotal, promoCode);
        assertEquals(expected, result, 0.001);
    }


    @Test
    public void testCartBetween15000And29999WithWrongCodeReturnsOriginalPrice(){
        double cartTotal = 16_000.00;        
        String promoCode = "OSHOFREE35";
        double expected = cartTotal;
        double result = OshoFreePromoEngine.applyPromo(cartTotal, promoCode);
        assertEquals(expected, result, 0.001);
    }


    @Test    
    public void testCartAboveOrEqualTo30000Returns35PercentDiscountedPriceWithValidCode(){
        double cartTotal = 30_000.00;
        String promoCode = "OSHOFREE35";
        double expected = cartTotal * 0.65;
        double result = OshoFreePromoEngine.applyPromo(cartTotal, promoCode);
        assertEquals(expected, result, 0.001);
    }


    @Test
    public void testCartAbove30000WithWrongCodeReturnsOriginalPrice(){
        double cartTotal = 100_000.00;        
        String promoCode = "BIGBOY20";
        double expected = cartTotal;
        double result = OshoFreePromoEngine.applyPromo(cartTotal, promoCode);
        assertEquals(expected, result, 0.001);
    }


    @Test
    public void testAnyCartTotalReturnsOriginalCartPriceForInvalidPromoCode(){
        double cartTotal = 14_999.00;
        String promoCode = "FAKE99";
        double result = OshoFreePromoEngine.applyPromo(cartTotal, promoCode);
        double expected = 14_999.00;
        assertEquals(expected, result, 0.001);
    }


    @Test
    public void testStarter10PromoCodeCaseAtUpperBoundary(){
        double cartTotal = 14_999.50;
        String promoCode = "STARTER10";
        double expected = cartTotal * 0.9;
        double result = OshoFreePromoEngine.applyPromo(cartTotal, promoCode);
        assertEquals(expected, result, 0.001);
    }


    @Test
    public void testBigBoy20PromoCodeCaseAtUpperBoundary(){
        double cartTotal = 29_999.50;
        String promoCode = "BIGBOY20";
        double expected = cartTotal * 0.8;
        double result = OshoFreePromoEngine.applyPromo(cartTotal, promoCode);
        assertEquals(expected, result, 0.001);
    }


    @Test
    public void testInvalidAmountsRaisesValueError(){
        double cartTotal = -30_000.00;
        String promoCode = "OSHOFREE35";
        assertThrows(IllegalArgumentException.class, () -> {OshoFreePromoEngine.applyPromo(cartTotal, promoCode);});
    }
}
