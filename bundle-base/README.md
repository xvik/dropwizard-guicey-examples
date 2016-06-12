### Guicey bundle basic sample

[Guicey bundle](https://github.com/xvik/dropwizard-guicey#guicey-bundles) used to group re-usable parts
like installers, extensions or guice modules (much like dropwizard bundles).

Bundle configuration is very like guice bundle configuration in manual mode. Manual config is important because
bundle usually group pre-build (and well tested) services for further reuse and it makes no sense to resolve such
parts dynamically (no time spent).

```java
bootstrap.addBundle(GuiceBundle.builder()
                .bundles(new SomeBundle())
```

Sample is based on [manual installer configuration sample](../manualconfig-installer)
where extensions were used directly.
