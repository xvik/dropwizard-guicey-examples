package ru.vyarus.dropwizard.guice.examples.bundle.service;

import ru.vyarus.dropwizard.guice.examples.bundle.installer.CustomInstaller;
import ru.vyarus.dropwizard.guice.examples.bundle.installer.Marker;

/**
 * Service which must be recognized and installed by
 * {@link CustomInstaller}.
 *
 * @author Vyacheslav Rusakov
 * @since 29.01.2016
 */
public class MarkedService implements Marker {
}
