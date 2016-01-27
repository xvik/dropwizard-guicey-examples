### Sample application with manual config mode

By default no installers defined, so they must be manually installed either as bundle (all installers)

```java
GuiceBundle.builder().bundles(new CoreInstallersBundle())
```

or only specific installers:

```java
GuiceBundle.builder().installers(ResourceInstaller.class)
```

NOTE: both bundles and installers may be used together if required


All extensions must be also registered by hand:

```java
GuiceBundle.builder()
  ...
 .extensions(SampleResource.class)
```

Also see sample spock tests using both [GuiceyAppRule](https://github.com/xvik/dropwizard-guicey#testing) (start only guice context - very fast) and 
[DropwizardAppRule](http://www.dropwizard.io/0.9.2/docs/manual/testing.html) (when http server started).