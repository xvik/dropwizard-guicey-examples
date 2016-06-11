### Hibernate integration sample

[dropwiard-hibernate](http://www.dropwizard.io/0.9.2/docs/manual/hibernate.html) is configured exactly as
 it's described in docs, but extracted to [separate class](https://github.com/xvik/dropwizard-guicey-examples/tree/master/hibernate/src/main/java/ru/vyarus/dropwizard/guice/examples/hbn/HbnBundle.java) for simplicity:
 
 ```java
 public class HbnBundle extends HibernateBundle<HbnAppConfiguration> {
 
     public HbnBundle() {
         super(Sample.class);
     }
 
     @Override
     public PooledDataSourceFactory getDataSourceFactory(HbnAppConfiguration configuration) {
         return configuration.getDataSourceFactory();
     }
 }
 ```
 
 [Guice module](https://github.com/xvik/dropwizard-guicey-examples/tree/master/hibernate/src/main/java/ru/vyarus/dropwizard/guice/examples/hbn/HbnModule.java) 
 used to provide SessionFactory instance into guice context:
 
 ```java
 public class HbnModule extends AbstractModule {
 
     private final HbnBundle hbnBundle;
 
     public HbnModule(HbnBundle hbnBundle) {
         this.hbnBundle = hbnBundle;
     }
 
     @Override
     protected void configure() {
         bind(SessionFactory.class).toProvider(new Provider<SessionFactory>() {
             @Override
             public SessionFactory get() {
                 return hbnBundle.getSessionFactory();
             }
         });
     }
 }
 ```
 
 And in [application](https://github.com/xvik/dropwizard-guicey-examples/tree/master/hibernate/src/main/java/ru/vyarus/dropwizard/guice/examples/HbnApplication.java) init:
 
 ```java
 @Override
     public void initialize(Bootstrap<HbnAppConfiguration> bootstrap) {
         final HbnBundle hibernate = new HbnBundle();
         // register hbn bundle before guice to make sure factory initialized before guice context start
         bootstrap.addBundle(hibernate);
         bootstrap.addBundle(GuiceBundle.builder()
                 .enableAutoConfig("ru.vyarus.dropwizard.guice.examples")
                 .modules(new HbnModule(hibernate))
                 .build());
     }
 ```

Overall it's a complete example with [one entity](https://github.com/xvik/dropwizard-guicey-examples/main/java/hibernate/src/test/groovy/ru/vyarus/dropwizard/guice/examples/model/Sample.java)
and [simple resource](https://github.com/xvik/dropwizard-guicey-examples/tree/master/hibernate/src/main/java/ru/vyarus/dropwizard/guice/examples/rest/SampleResource.java).

[Test](https://github.com/xvik/dropwizard-guicey-examples/tree/master/hibernate/src/test/groovy/ru/vyarus/dropwizard/guice/examples/HbnResourceTest.groovy) starts application
with in-memory h2 db ([see config](https://github.com/xvik/dropwizard-guicey-examples/tree/master/hibernate/src/test/resources/config.yml)).
