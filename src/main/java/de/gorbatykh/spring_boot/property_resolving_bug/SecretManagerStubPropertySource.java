package de.gorbatykh.spring_boot.property_resolving_bug;

import org.springframework.core.env.PropertySource;

import static de.gorbatykh.spring_boot.property_resolving_bug.SecretManagerStubConfigDataLocationResolver.PREFIX;

public class SecretManagerStubPropertySource extends PropertySource<Object> {
    public static final String EXPECTED_VALUE = "value-resolved-from-secret-manager-stub";

    public SecretManagerStubPropertySource() {
        super("secret-manager-stub", new Object());
    }

    @Override
    public Object getProperty(String name) {
        if (!name.startsWith(PREFIX)) {
            return null;
        }
        if ("sm-stub://projects/my-project/secrets/qa_a-service_url/versions/latest".equals(name)) {
            return EXPECTED_VALUE;
        }
        throw new IllegalArgumentException();
    }
}
