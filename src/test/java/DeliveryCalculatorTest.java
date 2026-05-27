import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class DeliveryCalculatorTest {

    DeliveryCalculator calculator = new DeliveryCalculator();

    @Test
    void same_day_document() {
        assertThat(calculator.calculate("same day", "document")).isEqualTo(4.00);
    }

    @Test
    void same_day_small() {
        assertThat(calculator.calculate("same day", "small")).isEqualTo(7.00);
    }

    @Test
    void same_day_large() {
        assertThat(calculator.calculate("same day", "large")).isEqualTo(9.00);
    }

    @Test
    void two_day_document() {
        assertThat(calculator.calculate("two day", "document")).isEqualTo(1.00);
    }

    @Test
    void two_day_small() {
        assertThat(calculator.calculate("two day", "small")).isEqualTo(2.50);
    }

    @Test
    void two_day_large() {
        assertThat(calculator.calculate("two day", "large")).isEqualTo(3.00);
    }
}
