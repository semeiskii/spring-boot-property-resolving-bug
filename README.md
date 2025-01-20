# Problem

A property which uses custom loader and contains placeholder inside it is not resolved.

Example:

```yaml
spring:
  config:
    import: sm-stub://

app:
  environment: qa
  a-service-url: ${sm-stub://projects/my-project/secrets/${app.environment}_a-service_url/versions/latest}
```

# Reproduction

## Spring Boot version

In `build.gradle` you can switch the version of Spring between:

* 3.3 which resolves the value properly
* 3.4 which doesn't resolve

## Test

Run the `de.gorbatykh.spring_boot.property_resolving_bug.SpringBootPropertyResolvingBugApplicationTest.should_resolve_app_aServiceUrl` test.

## Application

Run the `de.gorbatykh.spring_boot.property_resolving_bug.SpringBootPropertyResolvingBugApplication` it will log the resolved value.
