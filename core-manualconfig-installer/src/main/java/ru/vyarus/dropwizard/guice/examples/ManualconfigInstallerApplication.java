package ru.vyarus.dropwizard.guice.examples;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import ru.vyarus.dropwizard.guice.GuiceBundle;
import ru.vyarus.dropwizard.guice.examples.installer.CustomInstaller;
import ru.vyarus.dropwizard.guice.examples.service.MarkedService;

/**
 * Sample application for custom installer in manual config mode.
 *
 * @author Vyacheslav Rusakov
 * @since 29.01.2016
 */
public class ManualconfigInstallerApplication extends Application<Configuration> {

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {
        bootstrap.addBundle(GuiceBundle.builder()
                .installers(CustomInstaller.class)
                .extensions(MarkedService.class)
                .build());
    }

    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {
    }
}
