### Custom installer usage in auto config mode

In auto config mode custom [installers](https://github.com/xvik/dropwizard-guicey#installers) are searched with classpath scan.
So `CustomInstaller` will be recognized and installed automatically.

After that `MarkerService` will be installed by just registered installer.

Installer implementation is simplified - the main intention was to show how installer registered.
