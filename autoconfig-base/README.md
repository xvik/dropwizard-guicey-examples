### Sample application with auto config mode

```java
GuiceBundle.builder().enableAutoConfig("ru.vyarus.dropwizard.guice.examples")
```

`enableAutoConfig` implicitly installs `CoreInstallersBundle` (all core installers) and perform classpath scan for 
extensions. So `SampleResource` will be found and registered automatically.

Also see sample spock tests using both [GuiceyAppRule](https://github.com/xvik/dropwizard-guicey#testing) (start only guice context - very fast) and 
[DropwizardAppRule](http://www.dropwizard.io/0.9.2/docs/manual/testing.html) (when http server started).