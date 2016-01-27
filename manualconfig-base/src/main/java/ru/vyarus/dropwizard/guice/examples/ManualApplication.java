package ru.vyarus.dropwizard.guice.examples;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import ru.vyarus.dropwizard.guice.GuiceBundle;
import ru.vyarus.dropwizard.guice.examples.rest.SampleResource;
import ru.vyarus.dropwizard.guice.module.installer.CoreInstallersBundle;

/**
 * Manual mode sample application.
 *
 * @author Vyacheslav Rusakov
 * @since 27.01.2016
 */
public class ManualApplication extends Application<Configuration> {

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {
        bootstrap.addBundle(GuiceBundle.builder()
                // by default no installers registered in manual mode
                .bundles(new CoreInstallersBundle())
                // module is not required, but used here to show precise guice beans configuration
                .modules(new ManualModule())
                // in manual mode extension classes must be declared explicitly to be recognized by installer and properly installed
                .extensions(SampleResource.class)
                .build());
    }

    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {
    }
}
