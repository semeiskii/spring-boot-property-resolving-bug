package de.gorbatykh.spring_boot.property_resolving_bug;

import org.springframework.boot.context.config.*;

import java.util.List;

public class SecretManagerStubConfigDataLocationResolver implements ConfigDataLocationResolver<SecretManagerStubConfigDataResource> {
    public static final String PREFIX = "sm-stub://";

    @Override
    public boolean isResolvable(ConfigDataLocationResolverContext context, ConfigDataLocation location) {
        return location.hasPrefix(PREFIX);
    }

    @Override
    public List<SecretManagerStubConfigDataResource> resolve(ConfigDataLocationResolverContext context, ConfigDataLocation location)
            throws ConfigDataLocationNotFoundException, ConfigDataResourceNotFoundException {
        return List.of(new SecretManagerStubConfigDataResource());
    }
}
