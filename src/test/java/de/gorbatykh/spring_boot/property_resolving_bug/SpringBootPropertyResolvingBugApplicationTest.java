package de.gorbatykh.spring_boot.property_resolving_bug;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static de.gorbatykh.spring_boot.property_resolving_bug.SecretManagerStubPropertySource.EXPECTED_VALUE;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringBootPropertyResolvingBugApplicationTest {
    @Value("${app.a-service-url}")
    private String aServiceUrl;

    @Test
    void should_resolve_app_aServiceUrl() {
        assertEquals(EXPECTED_VALUE, aServiceUrl);
    }
}
