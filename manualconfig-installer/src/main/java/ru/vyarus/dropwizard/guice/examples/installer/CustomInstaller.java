package ru.vyarus.dropwizard.guice.examples.installer;

import com.google.inject.Binder;
import com.google.inject.Binding;
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
    public void bindExtension(Binder binder, Class<?> type, boolean lazy) {
        binder.bind(type).in(Singleton.class);
    }

    @Override
    public <T> void checkBinding(Binder binder, Class<T> type, Binding<T> manualBinding) {
        // nothing to do if already bound to guice
    }

    @Override
    public void installBinding(Binder binder, Class<?> type) {

    }

    @Override
    public void report() {

    }
}
