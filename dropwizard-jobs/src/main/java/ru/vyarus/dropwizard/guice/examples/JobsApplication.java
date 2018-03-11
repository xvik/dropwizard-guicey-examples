package ru.vyarus.dropwizard.guice.examples;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import ru.vyarus.dropwizard.guice.GuiceBundle;

/**
 * @author Vyacheslav Rusakov
 * @since 11.03.2018
 */
public class JobsApplication extends Application<JobsAppConfiguration> {

    public static void main(String[] args) throws Exception {
        new JobsApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<JobsAppConfiguration> bootstrap) {
        bootstrap.addBundle(GuiceBundle.builder()
                .enableAutoConfig(JobsApplication.class.getPackage().getName())
                .build());
    }

    @Override
    public void run(JobsAppConfiguration configuration, Environment environment) throws Exception {

    }
}
