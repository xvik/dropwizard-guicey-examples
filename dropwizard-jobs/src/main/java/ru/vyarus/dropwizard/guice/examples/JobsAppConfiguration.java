package ru.vyarus.dropwizard.guice.examples;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.spinscale.dropwizard.jobs.JobConfiguration;
import io.dropwizard.Configuration;

import java.util.Map;

/**
 * @author Vyacheslav Rusakov
 * @since 11.03.2018
 */
public class JobsAppConfiguration extends Configuration implements JobConfiguration {

    @JsonProperty("quartz")
    private Map<String, String> quartz;

    public Map<String, String> getQuartzConfiguration() {
        return quartz;
    }
}
