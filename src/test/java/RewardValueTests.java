import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 200;
        double expectedMiles = cashValue / 0.0035;
//        to convert value from cash to miles
        RewardValue rewardValue = new RewardValue(cashValue);
        double actualMiles = rewardValue.getMilesValue();

        assertEquals(expectedMiles, actualMiles);
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 5000;
        double expectedCash = milesValue * 0.0035;
//       to convert value from miles to cash
        RewardValue rewardValue = new RewardValue(expectedCash);
        double actualCash = rewardValue.getCashValue();

        assertEquals(expectedCash, actualCash);
    }
}
