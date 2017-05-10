# dropwizard-guicey examples
[![License](http://img.shields.io/badge/license-MIT-blue.svg?style=flat)](http://www.opensource.org/licenses/MIT)
[![Build Status](http://img.shields.io/travis/xvik/dropwizard-guicey-examples.svg)](https://travis-ci.org/xvik/dropwizard-guicey-examples)

### About

Usage examples for [dropwizard-guicey](https://github.com/xvik/dropwizard-guicey)
(and [extensions](https://github.com/xvik/dropwizard-guicey-ext))

If you can't find answer for your problem in provided examples, please request new sample by 
[creating new issue](https://github.com/xvik/dropwizard-guicey-examples/issues).

All samples build with guicey 4.1.0 (dropwizard 1.1.0). [Extensions project BOM](https://github.com/xvik/dropwizard-guicey-ext/tree/master/guicey-bom) 
used for guicey, guice and dropwizard dependencies management.

[Dropwizard 0.9 examples](https://github.com/xvik/dropwizard-guicey-examples/tree/dw-0.9)

### Example applications

* [Getting started](getting-started) - example application from getting started documentation chapter.
* [Autoconfig](autoconfig-base) 
application configured using classpath scan (auto config mode)
* [Manual config](manualconfig-base) 
application configured manually (without classpath scan)

### Installers

* [Auto registered installer](autoconfig-installer) 
application with custom installer (auto config mode)
* [Manually registered installer](manualconfig-installer) 
application with custom installer configured manually (without classpath scan)

### Guicey bundles

* [Guicey bundle definition](bundle-base) 
application with sample guicey bundle

### Dropwizard modules

* [JDBI](jdbi) application with guicey JDBI integration (based on dropwizard-jdbi module)
* [hibernate](hibernate) application with dropwizard-hibernate module integration
* [EventBus](eventbus) application with guava eventbus usage example
