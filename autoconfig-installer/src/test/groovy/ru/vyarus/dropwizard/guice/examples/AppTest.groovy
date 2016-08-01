package ru.vyarus.dropwizard.guice.examples

import com.google.inject.Injector
import com.google.inject.Key
import ru.vyarus.dropwizard.guice.examples.installer.CustomInstaller
import ru.vyarus.dropwizard.guice.examples.service.MarkedService
import ru.vyarus.dropwizard.guice.module.GuiceyConfigurationInfo
import ru.vyarus.dropwizard.guice.test.spock.UseGuiceyApp
import spock.lang.Specification

import javax.inject.Inject

/**
 * @author Vyacheslav Rusakov
 * @since 29.01.2016
 */
@UseGuiceyApp(AutoconfigInstallerApplication)
class AppTest extends Specification {

    @Inject
    GuiceyConfigurationInfo info
    @Inject
    Injector injector

    def "Check feature installation"() {

        expect: "installer and feature registered"
        info.installers.contains(CustomInstaller)
        injector.getExistingBinding(Key.get(MarkedService)) != null

    }
}