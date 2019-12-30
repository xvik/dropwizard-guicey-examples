package ru.vyarus.dropwizard.guice.examples;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import ru.vyarus.dropwizard.guice.GuiceBundle;

/**
 * Sample application for custom installer in autoconfig mode.
 *
 * @author Vyacheslav Rusakov
 * @since 29.01.2016
 */
public class AutoconfigInstallerApplication extends Application<Configuration> {

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {
        bootstrap.addBundle(GuiceBundle.builder()
                .enableAutoConfig("ru.vyarus.dropwizard.guice.examples")
                .build());
    }

    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {
    }
}
