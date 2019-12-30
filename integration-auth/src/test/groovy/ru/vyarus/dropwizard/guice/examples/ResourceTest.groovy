package ru.vyarus.dropwizard.guice.examples

import groovyx.net.http.HTTPBuilder
import groovyx.net.http.HttpResponseException
import ru.vyarus.dropwizard.guice.test.spock.UseDropwizardApp
import spock.lang.Specification

import javax.ws.rs.core.HttpHeaders;

/**
 * @author Vyacheslav Rusakov
 * @since 27.01.2016
 */
@UseDropwizardApp(AuthApplication)
class ResourceTest extends Specification {

    def "Check auth"() {

        when: "calling resource without auth"
        new HTTPBuilder("http://localhost:8080/adm").get([:])

        then: "user authorized"
        def ex = thrown(HttpResponseException)
        ex.statusCode == 401


        when: "calling resource without auth"
        new HTTPBuilder("http://localhost:8080/auth").get([:])

        then: "user authorized"
        ex = thrown(HttpResponseException)
        ex.statusCode == 401


        when: "calling resource with incorrect auth"
        new HTTPBuilder("http://localhost:8080/adm").get(
                headers: ["${HttpHeaders.AUTHORIZATION}": "Bearer invalid"])

        then: "user authorized"
        ex = thrown(HttpResponseException)
        ex.statusCode == 401


        when: "calling resource with proper auth and role"
        def res = new HTTPBuilder("http://localhost:8080/adm").get(
                headers: ["${HttpHeaders.AUTHORIZATION}": "Bearer valid"]).text

        then: "user authorized"
        res == 'admin'


        when: "calling resource required auth"
        res = new HTTPBuilder("http://localhost:8080/auth").get(
                headers: ["${HttpHeaders.AUTHORIZATION}": "Bearer valid"]).text

        then: "user authorized"
        res == 'admin'


        when: "calling resource using user without proper role"
        new HTTPBuilder("http://localhost:8080/deny").get(
                headers: ["${HttpHeaders.AUTHORIZATION}": "Bearer valid"])

        then: "user authorized"
        ex = thrown(HttpResponseException)
        ex.statusCode == 403

    }
}
