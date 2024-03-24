package com.vogella.unittest.services;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

class DataServiceTest {

    // Other test methods omitted for brevity

    @Test
    void ensureUpdateMethodExecutesInReasonableTime() {
        DataService dataService = new DataService();

        // Assert that the update method executes within 3 seconds
        assertTimeout(Duration.ofSeconds(3), () -> {
            boolean result = dataService.update();
            // Optionally, assert the result or any other conditions after the method execution
        });
    }
}
