package ru.vyarus.dropwizard.guice.examples.job;

import de.spinscale.dropwizard.jobs.Job;
import de.spinscale.dropwizard.jobs.annotations.Every;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import javax.inject.Singleton;

/**
 * Job will be registered automatically by {@link de.spinscale.dropwizard.jobs.GuiceJobManager}
 * (which is activate in  {@link ru.vyarus.dropwizard.guice.examples.support.JobsManager}).
 *
 * @author Vyacheslav Rusakov
 * @since 11.03.2018
 */
@Singleton
@Every("1s")
public class SampleJob extends Job {

    public boolean iDidIt;

    @Override
    public void doJob(JobExecutionContext context) throws JobExecutionException {
        iDidIt = true;
    }
}
