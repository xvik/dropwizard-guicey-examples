# dropwizard-guicey examples
[![License](http://img.shields.io/badge/license-MIT-blue.svg?style=flat)](http://www.opensource.org/licenses/MIT)
[![Build Status](http://img.shields.io/travis/xvik/dropwizard-guicey-examples.svg)](https://travis-ci.org/xvik/dropwizard-guicey-examples)

### About

Usage examples for [dropwizard-guicey](https://github.com/xvik/dropwizard-guicey)
(and [extensions](https://github.com/xvik/dropwizard-guicey-ext))

If you can't find answer for your problem in provided examples, please request new sample by 
[creating new issue](https://github.com/xvik/dropwizard-guicey-examples/issues).

All samples build with guicey 5.0.0-rc.2 (dropwizard 2.0.0-rc10). [Extensions project BOM](https://github.com/xvik/dropwizard-guicey-ext/tree/master/guicey-bom) 
used for guicey, guice and dropwizard dependencies management.

* [guicey 4.2.0 examples](https://github.com/xvik/dropwizard-guicey-examples/tree/4.2.0)
* [guicey 4.1.0 examples](https://github.com/xvik/dropwizard-guicey-examples/tree/4.1.0)
* [Dropwizard 0.9 examples](https://github.com/xvik/dropwizard-guicey-examples/tree/dw-0.9)

### Example applications

* [Getting started](getting-started) - example application from getting started documentation chapter.
* [Autoconfig](autoconfig-base) 
application configured using classpath scan (auto config mode)
* [Manual config](manualconfig-base) 
application configured manually (without classpath scan)
* [SPA HTML5 routes](spa) - example of HTML5 routes correct handling in single page application 

### REST

* [Sub resources](rest-sub-resource)
application demonstrating sub resource usage

### Installers

* [Auto registered installer](autoconfig-installer) 
application with custom installer (auto config mode)
* [Manually registered installer](manualconfig-installer) 
application with custom installer configured manually (without classpath scan)

### Guicey bundles

* [Guicey bundle definition](bundle-base) 
application with sample guicey bundle

### Dropwizard modules

* [Auth](auth) application with dropwizard-auth integration
* [JDBI](jdbi) application with guicey JDBI integration (based on dropwizard-jdbi module)
* [JDBI3](jdbi3) application with guicey JDBI3 integration (based on dropwizard-jdbi3 module)
* [hibernate](hibernate) application with dropwizard-hibernate module integration
* [EventBus](eventbus) application with guava eventbus usage example

### 3rd party

* [Guice-validator](guice-validator) application with [guice-validator](https://github.com/xvik/guice-validator) integration used to 
validate method parameters and return values validation all guice beans + ability to use guice enabled validators. 
By default, dropwizard applies such validations only for [rest resources](http://www.dropwizard.io/1.2.2/docs/manual/validation.html).
* [dropwizard-jobs](dropwizard-jobs) application with [dropwizard-jobs](https://github.com/spinscale/dropwizard-jobs) integration used to run
quartz jobs. 