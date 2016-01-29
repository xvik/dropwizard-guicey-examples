package ru.vyarus.dropwizard.guice.examples

import com.google.inject.Injector
import com.google.inject.Key
import ru.vyarus.dropwizard.guice.examples.bundle.installer.CustomInstaller
import ru.vyarus.dropwizard.guice.examples.bundle.service.MarkedService
import ru.vyarus.dropwizard.guice.module.installer.internal.FeaturesHolder
import ru.vyarus.dropwizard.guice.test.spock.UseGuiceyApp
import spock.lang.Specification

import javax.inject.Inject

/**
 * @author Vyacheslav Rusakov
 * @since 29.01.2016
 */
@UseGuiceyApp(BundleBaseApplication)
class AppTest extends Specification {

    @Inject
    FeaturesHolder holder
    @Inject
    Injector injector

    def "Check feature installation"() {

        expect: "installer and feature registered"
        holder.installers.find { return it instanceof CustomInstaller } != null
        injector.getExistingBinding(Key.get(MarkedService)) != null

    }
}