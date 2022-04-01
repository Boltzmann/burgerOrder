import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderSystemTest {

    @Test
    void addMenue() {
        Menue noOne = new Menue("Hamburger", 5.99);
        OrderSystem foodOne = new OrderSystem();
        boolean result = foodOne.addMenue(1, noOne);
        assertTrue(result);
    }

    @Test
    void addMenue_ExpectedFalse() {
        Menue noOne = new Menue("Hamburger", 5.99);
        OrderSystem foodOne = new OrderSystem();
        foodOne.addMenue(1, noOne);
        boolean result = foodOne.addMenue(1, noOne);

        assertFalse(result);
    }

    @Test
    void getOrderById() {
        Menue noOne = new Menue("Hamburger", 5.99);
        OrderSystem foodOne = new OrderSystem();
        foodOne.addMenue(1, noOne);

        assertEquals(noOne, foodOne.getOrderById(1));
    }


}