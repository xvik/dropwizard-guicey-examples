### Sample application with manual config mode

Default installers are always registered, but if you want to disable it use `.noDefaultInstallers()`
and specify only specific installers:

```java
GuiceBundle.builder()   
    .noDefaultInstallers()
    .installers(ResourceInstaller.class)
```

All extensions must be also registered by hand:

```java
GuiceBundle.builder()
  ...
 .extensions(SampleResource.class)
```

Also see sample spock tests using both [GuiceyAppRule](https://github.com/xvik/dropwizard-guicey#testing) (start only guice context - very fast) and 
[DropwizardAppRule](http://www.dropwizard.io/1.0.0/docs/manual/testing.html) (when http server started).