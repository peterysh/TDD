package toy.TDD.dollar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import toy.TDD.domain.Dollar;
import toy.TDD.domain.Franc;
import toy.TDD.domain.Money;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class DollarServiceTest {
    @Test
    public void testMultiplication() throws Exception{
        Dollar five = new Dollar(5);
        assertThat(new Dollar(10)).isEqualTo(five.times(2));
    }

    @Test
    public void testMultiplication2times() throws Exception{
        Money five = Money.dollar(5);
        assertThat(five.times(2)).isEqualTo(Money.dollar(10));
        assertThat(five.times(3)).isEqualTo(Money.dollar(15));
    }

    @Test
    public void testEquality(){
        assertTrue(Money.dollar(5).equals(new Dollar(5)));
        assertFalse(Money.dollar(5).equals( new Dollar(6)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals( new Franc(6)));
        assertFalse(new Franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}
