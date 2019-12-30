package ru.vyarus.dropwizard.guice.examples;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import ru.vyarus.dropwizard.guice.GuiceBundle;
import ru.vyarus.dropwizard.guice.examples.bundle.SomeBundle;

/**
 * Guicey bundle usage sample.
 *
 * @author Vyacheslav Rusakov
 * @since 29.01.2016
 */
public class BundleBaseApplication extends Application<Configuration> {

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {
        bootstrap.addBundle(GuiceBundle.builder()
                .bundles(new SomeBundle())
                .build());
    }

    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {
    }
}
