package ru.vyarus.dropwizard.guice.examples.bundle.installer;

import com.google.inject.Binder;
import ru.vyarus.dropwizard.guice.module.installer.FeatureInstaller;
import ru.vyarus.dropwizard.guice.module.installer.install.binding.BindingInstaller;
import ru.vyarus.dropwizard.guice.module.installer.util.FeatureUtils;

import javax.inject.Singleton;

/**
 * Installer recognize classes implementing {@link Marker} interface and bind in guice context as singletons
 * (simplified example).
 *
 * @author Vyacheslav Rusakov
 * @since 29.01.2016
 */
public class CustomInstaller implements FeatureInstaller<Marker>, BindingInstaller {

    @Override
    public boolean matches(Class<?> type) {
        return FeatureUtils.is(type, Marker.class);
    }

    @Override
    public <T> void install(Binder binder, Class<? extends T> type, boolean lazy) {
        binder.bind(type).in(Singleton.class);
    }

    @Override
    public void report() {

    }
}
