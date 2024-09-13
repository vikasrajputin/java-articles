# java-articles
Source Code Related to Java Related Articles

# Things to remember:
- Please note that this repository is maven multi module project.
- When importing in eclipse or intellij always import the child modules and not the root modules.

# To Run the Project Locally in Eclipse:
- Import the child Module for eg: /java-articles/core-java/pom.xml as Project(Maven project) in eclipse.
- After eclipse finish building and importing the maven project, open terminal/cmd and go to the root folder where parent pom.xml is present. For eg. /java-articles/pom.xml
- Run below commands in one by one: mvn clean install, mvn eclipse:clean and mvn eclipse:eclipse
- Make sure all the steps are executed successfully, that's it you repo is set locally.

# Modules, Thread and their Source Code Package Information:
- Java Thread - Why do we've getter and setter method - https://github.com/vikasrajputin/java-articles/tree/main/core-java/src/main/java/in/vikasrajput/java/getterandsettermethods
- Java Article - SOLID Principles in Java -> Refer to [solid](https://github.com/vikasrajputin/java-articles/tree/main/core-java/src/main/java/in/vikasrajput/java/solid) package -> Article [link](https://vikasrajput.in/complete-guide-to-solid-principles-in-java)
- Mastering Java updates - version 9 to 22 -> Refer to [java-updates-v9-to-v22](https://github.com/vikasrajputin/java-articles/tree/main/java-updates-v9-to-v22) module

# How to Run Examples:
- Once you identify the correct package against the thread you will be able to find Java class ending with "Demo.java" name.
- This java class is main class, simply run this class as Java class in your favourite IDE.
