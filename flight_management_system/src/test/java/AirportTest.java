import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.example.BusinessFlight;
import com.example.EconomyFlight;
import com.example.Flight;
import com.example.Passenger;

public class AirportTest {
    @DisplayName("Given there is an economy flight")
    @Nested
    class EconomyFlightTest {
        private Flight economyFlight;

        @BeforeEach
        void setUp() {
            economyFlight = new EconomyFlight("1");
        }
        // @DisplayName("Given there is an economy flight")
        // @Nested
        // class EconomyFlightTest {
        // private Flight economyFlight;

        // @BeforeEach
        // void setUp() {
        // economyFlight = new Flight("1", "Economy");
        // }

        @Test
        public void testEconomyFlightRegularPassenger() {
            Passenger mike = new Passenger("Mike", false);
            assertEquals("1", economyFlight.getId());
            assertEquals(true, economyFlight.addPassenger(mike));
            assertEquals(1, economyFlight.getPassengersList().size());
            assertEquals("Mike", economyFlight.getPassengersList().get(0).getName());
            assertEquals(true, economyFlight.removePassenger(mike));
            assertEquals(0, economyFlight.getPassengersList().size());
        }

        @Test
        public void testEconomyFlightVipPassenger() {
            Passenger james = new Passenger("James", true);
            Passenger hafiz = new Passenger("Hafiz", true);
            Passenger yanto = new Passenger("Yanto", false);
            assertEquals("1", economyFlight.getId());
            assertEquals(true, economyFlight.addPassenger(james));
            assertEquals(true, economyFlight.addPassenger(hafiz));
            assertEquals(true, economyFlight.addPassenger(yanto));
            assertEquals(3, economyFlight.getPassengersList().size());
            assertEquals("James", economyFlight.getPassengersList().get(0).getName());
            assertEquals("Hafiz", economyFlight.getPassengersList().get(1).getName());
            assertEquals(false, economyFlight.removePassenger(james));
            assertEquals(3, economyFlight.getPassengersList().size());
        }
    }

    @DisplayName("Given there is a business flight")
    @Nested
    class BusinessFlightTest {
        private Flight businessFlight;

        @BeforeEach
        void setUp() {
            businessFlight = new BusinessFlight("2");
        }

        // @DisplayName("Given there is a business flight")
        // @Nested
        // class BusinessFlightTest {
        // private Flight businessFlight;

        // @BeforeEach
        // void setUp() {
        // businessFlight = new Flight("2", "Business");
        // }

        @Test
        public void testBusinessFlightRegularPassenger() {
            Passenger mike = new Passenger("Mike", false);
            assertEquals(false, businessFlight.addPassenger(mike));
            assertEquals(0, businessFlight.getPassengersList().size());
            assertEquals(false, businessFlight.removePassenger(mike));
            assertEquals(0, businessFlight.getPassengersList().size());
        }

        @Test
        public void testBusinessFlightVipPassenger() {
            Passenger james = new Passenger("James", true);
            Passenger wildan = new Passenger("Wildan", false);
            assertEquals(true, businessFlight.addPassenger(james));
            assertEquals(false, businessFlight.addPassenger(wildan));
            assertEquals(1, businessFlight.getPassengersList().size());
            assertEquals(false, businessFlight.removePassenger(james));
            assertEquals(1, businessFlight.getPassengersList().size());
        }
    }
}
