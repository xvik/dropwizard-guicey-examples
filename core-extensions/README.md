### Extensions registration example

[Extensions](http://xvik.github.io/dropwizard-guicey/5.0.0/guide/extensions/) could be registered:

Directly:

```java
GuiceBundle.builder()
    .extensions(MyResource.class)
    .build()
```

By classpath scan:

```java
GuiceBundle.builder()
    .enableAutoConfig("ru.vyarus.dropwizard.guice.examples.rest.scan")
    .build()
```

(assume another resource is in specified package `ru.vyarus.dropwizard.guice.examples.rest.MyResource2`)

Recognized from guice binding:

```java
GuiceBundle.builder()
    .modules(new AbstractModule() {
        @Override
        protected void configure() {
            bind(MyResource3.class);
        }
    })
    .build()
```

Also, enabling diagnostic report to see what extensiosn would be found:

```java
GuiceBundle.builder()
    .pirntDiagnosticInfo()
``` 

When `ExtensionsDemoApplication` started, it will show:

``` 
    INSTALLERS and EXTENSIONS in processing order = 
        resource             (r.v.d.g.m.i.f.j.ResourceInstaller)    
            MyResource                   (r.v.d.g.e.rest)           
            MyResourceFromScan           (r.v.d.g.e.rest.scan)      *SCAN
            MyResourceFromBinding        (r.v.d.g.e.rest)           *BINDING  


    APPLICATION
    ├── extension  MyResource                   (r.v.d.g.e.rest)           
    ├── module     AppModule                    (r.v.d.guice.examples)     
    ├── module     GuiceBootstrapModule         (r.v.d.guice.module)       
    │   
    ├── CoreInstallersBundle         (r.v.d.g.m.installer)      
    │   ├── installer  ResourceInstaller            (r.v.d.g.m.i.f.jersey)     
    │   └── WebInstallersBundle          (r.v.d.g.m.installer)      
    │   
    ├── CLASSPATH SCAN
    │   └── extension  MyResourceFromScan           (r.v.d.g.e.rest.scan)      
    │   
    └── GUICE BINDINGS
        │   
        └── AppModule                    (r.v.d.guice.examples)     
            └── extension  MyResourceFromBinding        (r.v.d.g.e.rest)  
```         

As you can see, all extensions were recognized.  

Also see sample spock tests using both [GuiceyAppRule](https://github.com/xvik/dropwizard-guicey#testing) (start only guice context - very fast) and 
[DropwizardAppRule](http://www.dropwizard.io/1.0.0/docs/manual/testing.html) (when http server started).