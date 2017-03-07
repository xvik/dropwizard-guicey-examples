### Guava EventBus integration example

Use [eventbus guicey extension](https://github.com/xvik/dropwizard-guicey-ext/tree/master/guicey-eventbus) to:
* automatically register listeners
* bind eventbus (for publication)
* print available listeners to console

Installation:

```java
GuiceBundle.builder()
      .bundles(new EventBusBundle())
```

[EventListener](src/main/java/ru/vyarus/dropwizard/guice/examples/service/EventListener.java) listens for 
`FooEvent`, `BarEvent` and `BaseEvent` - base class for both events.

[SampleResource](src/main/java/ru/vyarus/dropwizard/guice/examples/resource/SampleResource.java) 
used to trigger both events and receive overall calls stats.