package ru.vyarus.dropwizard.guice.examples;

import io.dropwizard.core.Application;
import io.dropwizard.core.Configuration;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import ru.vyarus.dropwizard.guice.GuiceBundle;
import ru.vyarus.guicey.spa.SpaBundle;

/**
 * @author Vyacheslav Rusakov
 * @since 23.10.2019
 */
public class SpaApplication extends Application<Configuration> {

    public static void main(String[] args) throws Exception {
        new SpaApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {

        bootstrap.addBundle(GuiceBundle.builder()
                .bundles(SpaBundle.app("app", "/app", "/app/").build())
                .build());
    }


    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {

    }
}
