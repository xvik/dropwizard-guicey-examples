package ru.vyarus.dropwizard.guice.examples

import ru.vyarus.dropwizard.guice.examples.job.SampleJob
import ru.vyarus.dropwizard.guice.test.spock.UseGuiceyApp
import spock.lang.Specification

import javax.inject.Inject

/**
 * @author Vyacheslav Rusakov
 * @since 11.03.2018
 */
@UseGuiceyApp(JobsApplication)
class JobsAppTest extends Specification {

    @Inject
    SampleJob job

    def "Check task execution"() {

        expect: "task called"
        job.iDidIt
    }
}
