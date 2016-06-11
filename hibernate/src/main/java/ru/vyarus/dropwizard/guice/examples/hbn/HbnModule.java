package ru.vyarus.dropwizard.guice.examples.hbn;

import com.google.inject.AbstractModule;
import org.hibernate.SessionFactory;

import javax.inject.Provider;

/**
 * Guice module for {@link SessionFactory} binding.
 *
 * @author Vyacheslav Rusakov
 * @since 12.06.2016
 */
public class HbnModule extends AbstractModule {

    private final HbnBundle hbnBundle;

    public HbnModule(HbnBundle hbnBundle) {
        this.hbnBundle = hbnBundle;
    }

    @Override
    protected void configure() {
        bind(SessionFactory.class).toProvider(new Provider<SessionFactory>() {
            @Override
            public SessionFactory get() {
                return hbnBundle.getSessionFactory();
            }
        });
    }
}
