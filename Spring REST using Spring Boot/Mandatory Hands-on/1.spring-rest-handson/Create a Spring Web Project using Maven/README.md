# Spring Learn - Hands On 1

## Steps
1. Import as Existing Maven Project in Eclipse/STS.
2. Run:
   mvn clean package
3. Run `SpringLearnApplication`.

## Folder Walkthrough
- src/main/java : Application source code
- src/main/resources : Configuration files
- src/test/java : Test classes
- SpringLearnApplication.java : Main class with @SpringBootApplication
- pom.xml : Maven dependencies (Spring Web, DevTools, Test)

## @SpringBootApplication
Combines:
- @Configuration
- @EnableAutoConfiguration
- @ComponentScan

## Dependency Hierarchy
In Eclipse:
Right Click Project -> Maven -> Show Dependency Hierarchy.
