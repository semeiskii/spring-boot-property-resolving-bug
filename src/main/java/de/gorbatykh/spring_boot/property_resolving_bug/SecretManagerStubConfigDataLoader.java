package de.gorbatykh.spring_boot.property_resolving_bug;

import org.springframework.boot.context.config.ConfigData;
import org.springframework.boot.context.config.ConfigDataLoader;
import org.springframework.boot.context.config.ConfigDataLoaderContext;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;

import java.util.List;

public class SecretManagerStubConfigDataLoader implements ConfigDataLoader<SecretManagerStubConfigDataResource> {
    @Override
    public boolean isLoadable(ConfigDataLoaderContext context, SecretManagerStubConfigDataResource resource) {
        return ConfigDataLoader.super.isLoadable(context, resource);
    }

    @Override
    public ConfigData load(ConfigDataLoaderContext context, SecretManagerStubConfigDataResource resource)
            throws ConfigDataResourceNotFoundException {
        return new ConfigData(List.of(new SecretManagerStubPropertySource()));
    }
}
