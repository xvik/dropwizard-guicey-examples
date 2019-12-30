package ru.vyarus.dropwizard.guice.examples;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import ru.vyarus.dropwizard.guice.GuiceBundle;

/**
 * Autoconfig mode sample application.
 *
 * @author Vyacheslav Rusakov
 * @since 27.01.2016
 */
public class AutoscanApplication extends Application<Configuration> {

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {
        bootstrap.addBundle(GuiceBundle.builder()
                .enableAutoConfig("ru.vyarus.dropwizard.guice.examples")
                // module is not required, but used here to show precise guice beans configuration
                .modules(new AutoscanModule())
                .build());
    }

    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {
    }
}
