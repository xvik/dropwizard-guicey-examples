package ru.vyarus.dropwizard.guice.examples.bundle;

import ru.vyarus.dropwizard.guice.examples.bundle.installer.CustomInstaller;
import ru.vyarus.dropwizard.guice.examples.bundle.service.MarkedService;
import ru.vyarus.dropwizard.guice.module.installer.bundle.GuiceyBootstrap;
import ru.vyarus.dropwizard.guice.module.installer.bundle.GuiceyBundle;

/**
 * Sample bundle groups custom installer and service (installed by this installer).
 *
 * @author Vyacheslav Rusakov
 * @since 29.01.2016
 */
public class SomeBundle implements GuiceyBundle {

    @Override
    public void initialize(GuiceyBootstrap bootstrap) {
        bootstrap.installers(CustomInstaller.class)
                .extensions(MarkedService.class);
    }
}
