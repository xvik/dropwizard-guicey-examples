### Custom installer usage in auto config mode

In manual mode both [installer](https://github.com/xvik/dropwizard-guicey#installers) 
and extension (which must be registered by installer) must be registered manually.

```java
bootstrap.addBundle(GuiceBundle.builder()
                .installers(CustomInstaller.class)
                .extensions(MarkedService.class)
```

Installer implementation is simplified - the main intention was to show how installer registered.
