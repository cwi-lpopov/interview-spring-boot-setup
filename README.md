# Spring Boot initial project (skeleton for the interviews)

The purpose of this project is to reduce preparation time on the interview itself and help the candidate to become a bit familiar with a project structure which is mostly will be the same during the interview.

**Initial requirements:**

- Git
- JAVA 11
- IDE (for example [IntelliJ](https://www.jetbrains.com/idea/download/) Ultimate/Trial)

**Notes:**

- it does NOT include the real interview task
- this project or repository might be given to the candidate before "Spring Boot" technical interview to help to prepare and test local environment for it
- gradle dependencies included in the `build.gradle` might or might NOT be used for the real interview task

**To check local environment is ready for the interview:**

- from command line run `gradlew clean build` and see `BUILD SUCCESSFUL` message
- launch the project from IDE and see `Tomcat started on port(s): 8080` in the logs
- while project launched `curl -X GET http://localhost:8080/sample` should return `Hello World!` message
