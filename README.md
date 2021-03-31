# Template multi-module 

Just a starting point for a Maven multi-module project, with many useful plugins configured.

- Jenkins pipeline file with recognition of Gitflow (release/feature/develop/master-main branches)
- Unit tests / integration tests with JUnit 5, AssertJ, Mockito
- Unit tests and integration tests coverage with Jacoco / Surefire / Failsafe
- Support for Mutation Testing with PITest - https://pitest.org
- Several commons dependencies configured - slf4j/logback, commons lang/collection/io,
- Documentation site with checkstyle, spotbugs, detection of dependencies/plugins updates, and many commons reports.  

Support for Kotlin is provided out-of-the-box, so you can mix Java and Kotlin in the same project with ease. 

Clone and run:
````
mvn clean install site
````
... to see the magic operate.

## IntelliJ

IntelliJ may have problems to launch the tests from the IDE views. 

A solution is available here: https://stackoverflow.com/a/35378564/5375288