package ru.vyarus.dropwizard.guice.examples.service;

import ru.vyarus.dropwizard.guice.examples.installer.Marker;

/**
 * Service which must be recognized and installed by
 * {@link ru.vyarus.dropwizard.guice.examples.installer.CustomInstaller}.
 *
 * @author Vyacheslav Rusakov
 * @since 29.01.2016
 */
public class MarkedService implements Marker {
}
