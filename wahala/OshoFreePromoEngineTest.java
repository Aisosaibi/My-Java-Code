//A function that collects the cartTotal and the promoCode for each custoomer
//Returns the final price after applying the discount
//Accounts for invalid promo code
//
//Function takes in cartTotal, promoCode
//switch promoCode 
//
//default case _ = Invalid promo code 
//message = ₦cartTotal — %d%% (₦discount) = ₦finalPrice
//Returns finalPrice
//
//collect cart total and promo code
//calculate discount
//calculate final price
//if invalid promo code
//    return cart total
//else return final price

// Rule of thumb: Don't test what the compiler already checks
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OshoFreePromoEngineTest{
    
//    @Test
//    public void testApplyPromoExists(){
//        double cartTotal = 4_700;
//        String promoCode = "PROMO";
//        double promo = OshoFreePromoEngine.applyPromo(cartTotal, promoCode);
//    }
    

    @Test    
    public void testCartBelow5000ReturnsOriginalPriceEvenWithValidCode(){
// What cart total and promo code would represent the "no discount" case?
        double cartTotal = 3_000.00;
        String promoCode = "STARTER10";
        double expected = cartTotal;
        double result = OshoFreePromoEngine.applyPromo(cartTotal, promoCode);
        assertEquals(expected, result);
        assertEquals(expected, result, 0.001);
    }


    @Test    
    public void testCartBetween5000And14999Returns10PercentDiscountedPriceWithValidCode(){
        double cartTotal = 5_000.00;
        String promoCode = "STARTER10";
        double expected = cartTotal * 0.9;
        double result = OshoFreePromoEngine.applyPromo(cartTotal, promoCode);
        assertEquals(expected, result);
    }

    @Test
    public void testCartBetween5000And14999WithWrongCodeReturnsOriginalPrice(){
        double cartTotal = 5_000.00;        
        String promoCode = "BIGBOY20";
        double expected = cartTotal;
        double result = OshoFreePromoEngine.applyPromo(cartTotal, promoCode);
        assertEquals(expected, result);
    }

    @Test    
    public void testCartBetween15000And29999Returns20PercentDiscountedPriceWithValidCode(){
        double cartTotal = 15_000.00;
        String promoCode = "BIGBOY20";
        double expected = cartTotal * 0.8;
        double result = OshoFreePromoEngine.applyPromo(cartTotal, promoCode);
        assertEquals(expected, result);
    }


    @Test
    public void testCartBetween15000And29999WithWrongCodeReturnsOriginalPrice(){
        double cartTotal = 16_000.00;        
        String promoCode = "OSHOFREE35";
        double expected = cartTotal;
        double result = OshoFreePromoEngine.applyPromo(cartTotal, promoCode);
        assertEquals(expected, result);
    }

    @Test    
    public void testCartAbove30000Returns35PercentDiscountedPriceWithValidCode(){
        double cartTotal = 150_000.00;
        String promoCode = "OSHOFREE35";
        double expected = cartTotal * 0.65;
        double result = OshoFreePromoEngine.applyPromo(cartTotal, promoCode);
        assertEquals(expected, result);
    }

    @Test
    public void testCartAbove30000WithWrongCodeReturnsOriginalPrice(){
        double cartTotal = 100_000.00;        
        String promoCode = "BIGBOY20";
        double expected = cartTotal;
        double result = OshoFreePromoEngine.applyPromo(cartTotal, promoCode);
        assertEquals(expected, result);
    }

    @Test
    public void testAnyCartTotalReturnsOriginalCartPriceForInvalidPromoCode(){
        double cartTotal = 14_999.00;
        String promoCode = "FAKE99";
        double result = OshoFreePromoEngine.applyPromo(cartTotal, promoCode);
        double expected = 14_999.00;
        assertEquals(expected, result);
//        double[] cartTotalArray = {5_000.00, 15_000.00, 30_000.00};
//        String promoCode = "FAKE99";
//        double[] results = new double[3];
//
//        int index = 0;
//        for (double cartTotal: cartTotalArray){
//            results[index] = OshoFreePromoEngine.applyPromo(cartTotal, promoCode);
//            index++;
//        }
//
//        double[] expected = {5_000.00, 15_000.00, 30_000.00};
//
//        index = 0;
//        for (double result: results){
//            assertEquals(expected[index], result);
//            index++;
//        }
    }

//    @Test
//    public void testPromoCodeBoudariesReturn
}

//java -cp "junit-platform-console-standalone-1.12.2.jar:out" org.junit.platform.console.ConsoleLauncher --scan-class-path

//javac -cp "junit-platform-console-standalone-1.12.2.jar:out" -d out OshoFreePromoEngineTest.java OshoFreePromoEngine.java

//javac -cp "junit-platform-console-standalone-1.12.2.jar:out:." -d out OshoFreePromoEngine.java OshoFreePromoEngineTest.java  //The . means "also look in the current directory"
